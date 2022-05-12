import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Graph {

    public static ArrayList<Integer>[] makeGraph(boolean directed) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int v = Integer.parseInt(br.readLine()); // no. of vertices
        int e = Integer.parseInt(br.readLine()); // no. of edges

        ArrayList<Integer>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        while (e-- > 0) {
            String[] ip = br.readLine().split(" ");
            if (ip.length == 2) {
                graph[Integer.parseInt(ip[0])].add(Integer.parseInt(ip[1]));

                if (!directed) {
                    graph[Integer.parseInt(ip[1])].add(Integer.parseInt(ip[0]));
                }
            } else {
                System.err.println("Invalid format : Graph creation failed!!!");
                for (ArrayList<Integer> list : graph) {
                    list.clear();
                }
                break;
            }
        }

        return graph;
    }

    public static ArrayList<Integer> DFS(ArrayList<Integer>[] graph) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        DFSTraversal(graph, ans, visited, 0); // 0 is the starting vertex
        return ans;
    }

    public static void DFSTraversal(ArrayList<Integer>[] graph, ArrayList<Integer> ans, boolean[] visited, int v) {
        if(visited[v]) {
            return;
        }
        else {
            ans.add(v);
            visited[v] = true;
            for(Integer i : graph[v]) {
                DFSTraversal(graph, ans, visited, i);
            }
        }
    }

    public static ArrayList<String> DFSAllPaths(ArrayList<Integer>[] graph) {
        ArrayList<String> ans = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        DFSAllPathsTraversal(graph, ans, visited, "0", 0);
        return ans;
    } 

    public static void DFSAllPathsTraversal(ArrayList<Integer>[] graph, ArrayList<String> ans, boolean[] visited, String path, int v) {
        
        if(visited[v]) {
            
            return;
        }
        else {
            if(path.length() == graph.length) {
                ans.add(path);
                return;
            }
            else {
                visited[v] = true;
                for(Integer i : graph[v]) {
                    
                    DFSAllPathsTraversal(graph, ans, visited, path + i, i);
                    // visited[i] = false;
                }
                visited[v] = false;
            }
        }
    }

    public static void printGraph(ArrayList<Integer>[] graph) {
        System.out.println();
        for(int i = 0; i < graph.length; i++) {
            System.out.print(i + " -> ");
            for(int v : graph[i]) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException{

        ArrayList<Integer>[] graph = makeGraph(false);

        printGraph(graph);

        ArrayList<Integer> dfs = DFS(graph);

        System.out.println();
        for(Integer i : dfs) {
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayList<String> dfsAll = DFSAllPaths(graph);
        
        System.out.println();
        for(String i : dfsAll) {
            System.out.println(i);
        }
        System.out.println();
    }
}

/**
7
8
0 1
1 2
2 3
0 3
3 4
4 5
5 6
4 6

4
6
0 1
0 2
0 3
2 0
2 1
1 3
 */
