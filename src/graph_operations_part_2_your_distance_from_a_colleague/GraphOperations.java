package graph_operations_part_2_your_distance_from_a_colleague;

import graph_operations_part_2_your_distance_from_a_colleague.model.Edge;
import graph_operations_part_2_your_distance_from_a_colleague.model.Graph;
import graph_operations_part_2_your_distance_from_a_colleague.model.Vertex;

import java.util.*;


public class GraphOperations {
    public static int hopDistance(Graph graph, Vertex source, Vertex target) {
        if (!graph.getVertices().contains(source) || !graph.getVertices().contains(target)) {
            return -1;
        }
        Map<Vertex, Integer> distances = new HashMap<>();
        List<Vertex> queue = new ArrayList<>();

        distances.put(source, 0);
        queue.add(source);

        while (!queue.isEmpty()) {
            Vertex current = queue.remove(0);

            if (current.equals(target)) {
                return distances.get(current);
            }

            for (Vertex neighbor : getNeighbours(graph, current)) {
                if (!distances.containsKey(neighbor)) {
                    distances.put(neighbor, distances.get(current) + 1);
                    queue.add(neighbor);
                }
            }
        }

        return -1;
    }

    public static Set<Vertex> getNeighbours(Graph graph, Vertex vertex) {
        Set<Vertex> vertexSet = new HashSet<>();
        Set<Edge> edges = graph.getEdges();
        for (Edge edge : edges) {
            if (edge.getV1().equals(vertex)) {
                vertexSet.add(edge.getV2());
            } else if (edge.getV2().equals(vertex)) {
                vertexSet.add(edge.getV1());
            }
        }
        return vertexSet;
    }
}
