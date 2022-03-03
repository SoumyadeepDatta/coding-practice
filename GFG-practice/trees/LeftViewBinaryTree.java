
// { Driver Code Starts
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class LeftViewBinaryTree {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void printInorder(Node root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            Tree g = new Tree();
            ArrayList<Integer> result = g.leftView(root);
            for (int value : result) {
                System.out.print(value + " ");
            }
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends

// User function Template for Java

/*
 * A Binary Tree node
 * class Node
 * {
 * int data;
 * Node left, right;
 * 
 * Node(int item)
 * {
 * data = item;
 * left = right = null;
 * }
 * }
 */
class Tree {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {

        ArrayList<Integer> lv=new ArrayList<>();
        ArrayDeque<Node> q1 = new ArrayDeque<>();   
        ArrayDeque<Node> q2;

        if(root==null) return lv;

        q1.add(root);

        while (!q1.isEmpty()) {
            //bring all children of q1 to q2 by overwriting q2
            q2 = new ArrayDeque<>();

            for (Node node : q1) {
                if (node.left == null && node.right == null)
                    continue;
                if (node.left != null)
                    q2.add(node.left);
                if (node.right != null)
                    q2.add(node.right);
            }

            //add the 1st node of each level(q1 represents each level)
            lv.add(q1.poll().data);

            //copy the content of q2 into q1 by overwriting q1
            q1=q2.clone();
            
        }
        
        return lv;

    }
}