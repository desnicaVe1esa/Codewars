package graph_operations_part_1_find_neighbours_of_a_vertex;

import graph_operations_part_1_find_neighbours_of_a_vertex.model.Edge;
import graph_operations_part_1_find_neighbours_of_a_vertex.model.Graph;
import graph_operations_part_1_find_neighbours_of_a_vertex.model.Vertex;

import java.util.HashSet;
import java.util.Set;


public class GraphOperations {
    public static Set<Vertex> getNeighbours(Graph graph, Vertex vertex){
        Set<Vertex> result = new HashSet<>();
        Set<Edge> edges = graph.getEdges();
        for (Edge edge : edges) {
            if (edge.getV1().equals(vertex)) {
                result.add(edge.getV2());
            } else if (edge.getV2().equals(vertex)) {
                result.add(edge.getV1());
            }
        }
        return result;
    }
}
