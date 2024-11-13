import java.util.ArrayList;

/**
 * Represents a leaf node that can store up to five rectangles.
 */
public class LeafNode extends Node {
    private ArrayList<Rectangle> rectangles = new ArrayList<>();
    private static final int MAX_RECTANGLES = 5;

    public LeafNode(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void insert(Rectangle rect) {
        if (rectangles.size() < MAX_RECTANGLES) {
            rectangles.add(rect);
        } else {
            convertToInternalNode();
        }
    }

    @Override
    public boolean delete(int x, int y) {
        return rectangles.removeIf(rect -> rect.getX() == x && rect.getY() == y);
    }

    @Override
    public Rectangle find(int x, int y) {
        for (Rectangle rect : rectangles) {
            if (rect.getX() == x && rect.getY() == y) return rect;
        }
        return null;
    }

    @Override
    public void dump(int level) {
        System.out.println(" ".repeat(level * 4) + "LeafNode with rectangles: " + rectangles);
    }

    private void convertToInternalNode() {
        InternalNode internal = new InternalNode(x, y, width, height);
        rectangles.forEach(internal::insert);
    }
}
