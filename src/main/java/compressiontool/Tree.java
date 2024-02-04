package compressiontool;

public class Tree implements Comparable<Tree> {

    private final Node root;

    public Tree(char value, int weight) {
        root = new LeafNode(value, weight);
    }

    public Tree(Node left, Node right, int weight) {
        root = new InternalNode(weight, left, right);
    }

    public Node root() {
        return root;
    }

    public int weight() {
        return root.weight();
    }

    @Override
    public int compareTo(Tree tree) {
        return Integer.compare(root.weight(), tree.weight());
    }
}
