import java.util.*;

public class ShortestPath
{
    public static int shortestPath(int V, int[][] edges, int start, int end) 
    {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++)     
        {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) 
        {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];
        int[] distance = new int[V];
        
        queue.add(start);
        visited[start] = true;
        distance[start] = 0;

        while (!queue.isEmpty()) 
       {
            int node = queue.poll();

            if (node == end)
            {
                return distance[node]; 
            }

            for (int neighbor : graph.get(node)) 
           {
                if (!visited[neighbor]) 
                {
                    visited[neighbor] = true;
                    distance[neighbor] = distance[node] + 1;
                    queue.add(neighbor);
                }
            }
        }
        return -1; 
    }

    public static void main(String[] args) 
   {
        int V = 5;
        int[][] edges = {{0,1}, {0,2}, {1,3}, {2,3}, {3,4}};
        int start = 0, end = 4;

        int result = shortestPath(V, edges, start, end);
        System.out.println("Shortest path length: " + result);
    }
}


