package graph_operations_part_1_find_neighbours_of_a_vertex.model;

import java.util.HashSet;
import java.util.Set;

public class Graph {
    private static int uidCounter = 0;
    Set<Vertex> vertices;
    Set<Edge> edges;

    public Graph() {
        vertices = new HashSet<>();
        edges = new HashSet<>();
    }

    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
    }

    public void addVertices(Vertex... vertices) {
        for (Vertex v : vertices)
            addVertex(v);
    }

    public void addEdge(Vertex v1, Vertex v2) {
        addEdge(new Edge(v1, v2));
    }

    public void addEdge(Edge edge) {
        vertices.add(edge.v1);
        vertices.add(edge.v2);
        edges.add(edge);
    }

    public void addEdges(Vertex... vertices) {
        if (vertices.length % 2 != 0)
            throw new IllegalArgumentException();

        for (int i = 0; i < vertices.length; i = i + 2) {
            addEdge(vertices[i], vertices[i + 1]);
        }
    }

    public Set<Vertex> getVertices() {
        return vertices;
    }

    public Set<Edge> getEdges() {
        return edges;
    }

    static int getUidForNode() {
        return uidCounter++;
    }
}
