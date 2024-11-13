/**
 * Represents an internal node in the quadtree that holds references to child nodes.
 */
public class InternalNode extends Node {
    private Node[] children = new Node[4];

    public InternalNode(int x, int y, int width, int height) {
        super(x, y, width, height);
        createChildren();
    }

    private void createChildren() {
        children[0] = new LeafNode(x, y, width / 2, height / 2);
        children[1] = new LeafNode(x - width / 2, y, width / 2, height / 2);
        children[2] = new LeafNode(x, y - height / 2, width / 2, height / 2);
        children[3] = new LeafNode(x - width / 2, y - height / 2, width / 2, height / 2);
    }

    @Override
    public void insert(Rectangle rect) {
        children[findQuadrant(rect.getX(), rect.getY())].insert(rect);
    }

    @Override
    public boolean delete(int x, int y) {
        return children[findQuadrant(x, y)].delete(x, y);
    }

    @Override
    public Rectangle find(int x, int y) {
        return children[findQuadrant(x, y)].find(x, y);
    }

    @Override
    public void dump(int level) {
        for (Node child : children) child.dump(level + 1);
    }

    private int findQuadrant(int x, int y) {
        return (x >= this.x ? 0 : 1) + (y >= this.y ? 0 : 2);
    }
}
