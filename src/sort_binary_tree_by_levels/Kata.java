package sort_binary_tree_by_levels;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Kata {
    public static void main(String[] args) {
        System.out.println(Kata.treeByLevels(new Node
                (new Node
                        (null, new Node(null, null, 4), 2),
                        new Node(new Node(null, null, 5),
                                new Node(null, null, 6), 3), 1)));
    }


    public static List<Integer> treeByLevels(Node node) {
        ArrayList<Integer> lists = new ArrayList<>();
        if (node == null) {
            return lists;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            Node tree = queue.poll();
            if (tree.left != null) {
                queue.offer(tree.left);
            }
            if (tree.right != null) {
                queue.offer(tree.right);
            }
            lists.add(tree.value);
        }
        return lists;
    }


    public static class Node {
        public Node left;
        public Node right;
        public int value;

        public Node(Node l, Node r, int v) {
            left = l;
            right = r;
            value = v;
        }
    }
}
