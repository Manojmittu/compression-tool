package compressiontool;

public class LeafNode implements Node {

    private final int weight;
    private final char value;

    public LeafNode(char value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    private char getValue() {
        return value;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public int weight() {
        return weight;
    }
}
