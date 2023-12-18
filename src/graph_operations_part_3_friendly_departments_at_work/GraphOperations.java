package graph_operations_part_3_friendly_departments_at_work;

import graph_operations_part_3_friendly_departments_at_work.model.Graph;
import graph_operations_part_3_friendly_departments_at_work.model.Vertex;
import graph_operations_part_3_friendly_departments_at_work.model.Edge;

import java.util.Set;


public class GraphOperations {
    public static int departmentConnections(Graph graph, Set<Vertex> department1, Set<Vertex> department2){
        Set<Edge> edges = graph.getEdges();
        int count = 0;
        for(Edge e : edges)
            if(department1.contains(e.getV1()) && department2.contains(e.getV2())
                    || department1.contains(e.getV2()) && department2.contains(e.getV1()))
                ++count;
        return count;
    }
}
