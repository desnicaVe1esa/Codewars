package graph_operations_part_2_your_distance_from_a_colleague;

import graph_operations_part_2_your_distance_from_a_colleague.model.Graph;
import graph_operations_part_2_your_distance_from_a_colleague.model.Vertex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphTest {
    Graph exampleGraph;
    Vertex[] V = new Vertex[]{new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex()};

    @Before
    public void setUpSmallExampleGraph() {
        exampleGraph = new Graph();
        exampleGraph.addEdges(V[0], V[1], V[0], V[2], V[0], V[3], V[1], V[3], V[3], V[4]);
        exampleGraph.addVertex(V[5]);
    }

    @Test
    public void testHopDistanceExample() {
        assertEquals(1, GraphOperations.hopDistance(exampleGraph, V[0], V[1]));
        assertEquals(3, GraphOperations.hopDistance(exampleGraph, V[2], V[4]));
        assertEquals(3, GraphOperations.hopDistance(exampleGraph, V[4], V[2]));
    }
}
