package kyu_7.linked_lists_get_nth_node.java;

public class Node {
    public int data;
    public Node next = null;

    public static int getNth(Node n, int index) throws Exception {
        if (index == 0) {
            return n.data;
        }
        return getNth(n.next, index - 1);
    }
}
