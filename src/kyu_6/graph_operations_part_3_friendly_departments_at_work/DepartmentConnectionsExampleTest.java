package kyu_6.graph_operations_part_3_friendly_departments_at_work;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import kyu_6.graph_operations_part_3_friendly_departments_at_work.model.Graph;
import kyu_6.graph_operations_part_3_friendly_departments_at_work.model.Vertex;

import static org.junit.Assert.assertEquals;

public class DepartmentConnectionsExampleTest {

    Graph exampleGraph;
    Vertex[] V = new Vertex[]{new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex()};

    @Before
    public void setUpSmallExampleGraph() {
        exampleGraph = new Graph();
        /*
         *      V[2] - V[0] - V[3] - V[4]    V[5]
         *              |       |
         *             V[1] - - -
         */
        exampleGraph.addEdges(V[0], V[1], V[0], V[2], V[0], V[3], V[1], V[3], V[3], V[4]);
        exampleGraph.addVertex(V[5]);
    }

    private Set<Vertex> createDepartment(Vertex... vertices) {
        Set<Vertex> department = new HashSet<>();
        department.addAll(Arrays.asList(vertices));
        return department;
    }

    @Test
    public void exampleTests() {
        //Department of V[1] and V[2] is not connected to the department of V[4] and V[5]
        assertEquals(0, GraphOperations.departmentConnections(exampleGraph, createDepartment(V[1], V[2]), createDepartment(V[4], V[5])));

        //Department of V[0], V[1] and V[2] is connected to the department of V[3] and V[4] 2 times: V[0]-V[3] and V[1]-V[3]
        assertEquals(2, GraphOperations.departmentConnections(exampleGraph, createDepartment(V[0], V[1], V[2]), createDepartment(V[3], V[4])));

        //Department of V[1], V[2] and V[3] is connected to the department of V[0] 3 times: V[1]-V[0], V[2]-V[0] and V[3]-V[0]
        assertEquals(3, GraphOperations.departmentConnections(exampleGraph, createDepartment(V[1], V[2], V[3]), createDepartment(V[0])));
    }
}
