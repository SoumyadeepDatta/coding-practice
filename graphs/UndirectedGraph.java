import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Weighted undirected graph (Sample input)
 * (Source Sink Cost)
 * .        
 * .
 * .

0 1 10
1 2 10
2 3 10
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10

 */
public class UndirectedGraph {
    public static ArrayList<Edge>[] makeUndirectedGraph(int numberOfVertices, int numberOfEdges) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        ArrayList<Edge>[] undirectedGraph = new ArrayList[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++) {
            undirectedGraph[i] = new ArrayList<>();
        }

        for (int i = 0; i < numberOfEdges; i++) {
            String[] ip = br.readLine().split(" ");

            Integer source = Integer.parseInt(ip[0]);
            Integer sink = Integer.parseInt(ip[1]);
            Integer cost = Integer.parseInt(ip[2]);

            undirectedGraph[source].add(new Edge(source, sink, cost));
            undirectedGraph[sink].add(new Edge(sink, source, cost));
        }
        return undirectedGraph;
    }

    public static void printUndirectedGraph(ArrayList<Edge>[] undirectedGraph) {
        int i = 0;
        for(ArrayList<Edge> arrayList : undirectedGraph) {
            System.out.print("V" + i++ +":\t");
            for(Edge edge : arrayList) {
                System.out.print(edge.getSource() + "-" + edge.getSink() + "-" + edge.getCost() + "\t");
            }
            System.out.println();
        }
    }

    public static boolean hasPath(ArrayList<Edge>[] undirectedGraph, int source, int sink, boolean[] visited) {
        if (source == sink) {
            return true;
        }

        visited[source] = true;

        for(Edge edge : undirectedGraph[source]) {
            if (!visited[edge.getSink()]) {
                if (hasPath(undirectedGraph, edge.getSink(), sink, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        /**
         * 7
         * 8
         */

        int numberOfVertices = Integer.parseInt(br.readLine());
        int numberOfEdges = Integer.parseInt(br.readLine());
        
        ArrayList<Edge>[] undirectedGraph = makeUndirectedGraph(numberOfVertices, numberOfEdges);
        
        printUndirectedGraph(undirectedGraph);

        boolean[] visited = new boolean[numberOfVertices];
        System.out.println(hasPath(undirectedGraph, Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), visited));
    }
}