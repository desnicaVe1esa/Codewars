package kyu_5.graph_operations_part_2_your_distance_from_a_colleague.model;

/***
 * Вершина
 */
public class Vertex {
    private final int uid;

    public Vertex() {
        uid = Graph.getUidForNode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex other = (Vertex) o;
        return uid == other.uid;
    }

    @Override
    public int hashCode() {
        return uid;
    }
}