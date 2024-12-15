package kyu_7.linked_lists_get_nth_node.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {

    private void doTest(Node node, int index, int expected) {
        try {
            int actual = Node.getNth(node, index);
            assertEquals(expected, actual, "for index = " + index);
        } catch (Exception e) {
            fail("for index = " + index + " expected " + expected + " but an Exception was thrown");
        }
    }

    private void doTest(Node node, int index) {
        assertThrows(Exception.class, () -> Node.getNth(node, index), "for index = " + index);
    }

    @Test
    public void test0() {
        Node n = new Node();
        n.data = 1337;
        doTest(n, 0, 1337);
    }

    @Test
    public void test2() {
        Node n = new Node();
        n.data = 1337;
        n.next = new Node();
        n.next.data = 42;
        n.next.next = new Node();
        n.next.next.data = 23;
        doTest(n, 0, 1337);
        doTest(n, 1, 42);
        doTest(n, 2, 23);
        doTest(n, -1);
        doTest(n, 3);
        doTest(n, 1000);
    }

    @Test
    public void testNull() {
        doTest(null, 0);
    }

    @Test
    public void testWrongIdx() {
        doTest(new Node(), 1);
    }
}
