package compressiontool;

public class InternalNode implements Node {

    private final int weight;
    private final Node left;
    private final Node right;

    public InternalNode(int weight, Node left, Node right) {
        this.weight = weight;
        this.left = left;
        this.right = right;
    }

    private Node getLeft() {
        return left;
    }

    private Node getRight() {
        return right;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public int weight() {
        return weight;
    }
}
