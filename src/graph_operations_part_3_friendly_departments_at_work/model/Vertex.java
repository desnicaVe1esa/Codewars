package graph_operations_part_3_friendly_departments_at_work.model;

public class Vertex {
    private final int uid;

    public Vertex(){
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
    public int hashCode() { return uid; }
}