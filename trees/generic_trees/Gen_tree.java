import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Gen_tree
 */
public class Gen_tree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    /**
     * d(10) -> 10 will print themselves & its family
     * d(20), d(30), d(40) will print themselves & their family
     * d(10) = s(10) + d(20) + d(30) + d(40) 
     * @param node
     */
    
    static Stack<String> tab = new Stack<>();
    /**
     *        
               L0       L1       L2       L3
        root :  
                
        _______ 
               |
               10
                |        
                |_______ 
                |       |
                |       20
                |       |        
                |       |_______ 
                |       |       |
                |       |       50
                |       |        
                |       |_______ 
                |       |       |
                |       |       60
                |        
                |_______ 
                |       |
                |       30
                |       |        
                |       |_______ 
                |       |       |
                |       |       70
                |       |       
                |       |_______
                |       |       |
                |       |       80
                |       |       |
                |       |       |_______
                |       |       |       |
                |       |       |       110
                |       |       |
                |       |       |_______
                |       |       |       |
                |       |       |       120
                |       |
                |       |_______
                |       |       |
                |       |       90
                |
                |_______
                |       |
                |       40
                |       |
                |       |_______
                |       |       |
                |       |       100
     *
     * @param node
     */
    public static void display(Node node){
        
        // for space above node value
        for(String s:tab){
            System.out.print(s);
        }
        System.out.println();
        
        // for branch visualization
        // horizontal branch connector
        for(String s:tab){
            System.out.print(s);
        }
        System.out.println("_______");
        // vertical branch connector
        for(String s:tab){
            System.out.print(s);
        }
        System.out.println("       "+"|");

        // leave space so that nodes don't seem conjested
        for(String s:tab){
            System.out.print(s);
        }

        try { Thread.sleep(100); } catch (Exception e) {}   // animation effect
        System.out.println("       "+node.data);    // printing the value
        

        // tab is a stack made for managing indentations
        tab.push("\t");
        tab.push("|");
        
        // display childrens of corresponding node
        for(Node child: node.children){
            
            display(child);
            
        }
        
        tab.pop();
        tab.pop();
        
    }
    /**
     * size means total number of nodes
     * @param node
     * @return
     */
    public static int size(Node node){  
        int sum = 0;
        if(node.children.size() == 0){
            return 1; // if there are no children then only return size of itself which is 1 
        }
        for(Node i:node.children){
            sum += size(i);
        }
        return sum + 1; // extra 1 is for the node itself & the sum is for sum of sizes of its children
    }
    static{
        System.out.println("-------------------------------------------------------------");
        System.out.println("                        Generic Trees");
        System.out.println("-------------------------------------------------------------");
        
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        /**
         * Note: Here -1 value means backtrack to the parent node
         * 
         *                    10
         *                 /  |   \
         *               20   30   40
         *              / |   | \    \ 
         *            50  60  70 80  100
         *                       / \
         *                      110 120
         */
        Node root = null;
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                stack.pop();
            }
            else{
                Node t = new Node();
                t.data = arr[i];
                if (stack.size() > 0) {
                    stack.peek().children.add(t);
                }
                else{
                    root = t;
                }
                stack.push(t);
            }
        }

        System.out.println("       "+"L0"+"       "+"L1"+"       "+"L2"+"       "+"L3");
        System.out.println("-------------------------------------------------------------");
        display(root);

        System.out.println("Size : "+size(root));
    }
}