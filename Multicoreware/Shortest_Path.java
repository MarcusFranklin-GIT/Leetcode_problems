import java.io.*;
import java.util.*;

public class Shortest_Path {

    // Class to represent a weighted edge in the graph
    static class Edge {
        int target;
        long weight;

        Edge(int target, long weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    // Class to represent a node pair inside the Priority Queue
    static class NodePair {
        int vertex;
        long distance;

        NodePair(int vertex, long distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }

    public static long findShortestPath(int n, int m, int[][] edges, int source, int destination) {
        // Edge Case: If source and destination are the same, distance is 0
        if (source == destination) {
            return 0;
        }

        // 1. Initialize Adjacency List (1-indexed nodes)
        List<Edge>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 2. Build the Undirected Graph (Add edges bidirectionally)
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            long w = edges[i][2];
            
            graph[u].add(new Edge(v, w));
            graph[v].add(new Edge(u, w));
        }

        // 3. Initialize distance tracking array with infinity
        long[] dist = new long[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[source] = 0;

        // 4. Min-Priority Queue sorted by ascending distance
        PriorityQueue<NodePair> pq = new PriorityQueue<>(Comparator.comparingLong(node -> node.distance));
        pq.add(new NodePair(source, 0));

        // 5. Dijkstra's Algorithm core processing loop
        while (!pq.isEmpty()) {
            NodePair current = pq.poll();
            int u = current.vertex;
            long currentDist = current.distance;

            // Optimization: If we found a shorter path to u already, skip processing
            if (currentDist > dist[u]) {
                continue;
            }

            // Early termination optimization: stop if destination is reached
            if (u == destination) {
                return dist[destination];
            }

            // Relax neighboring edges
            for (Edge edge : graph[u]) {
                int v = edge.target;
                long weight = edge.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new NodePair(v, dist[v]));
                }
            }
        }

        // Return shortest path value, or -1 if the destination is unreachable
        return dist[destination] == Long.MAX_VALUE ? -1 : dist[destination];
    }

    // Main method for testing using Example 1 from your prompt
    public static void main(String[] args) {
        int n = 5;
        int m = 8;
        int[][] edges = {
            {2, 1, 3},
            {1, 3, 6},
            {1, 4, 3},
            {3, 4, 2},
            {4, 3, 1},
            {4, 2, 1},
            {5, 2, 4},
            {5, 4, 2}
        };
        int source = 5;
        int destination = 3;

        long result = findShortestPath(n, m, edges, source, destination);
        System.out.println("Shortest Path Length: " + result); 
        // Expected Output: 3
    }
}