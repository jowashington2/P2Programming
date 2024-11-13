public class Quadtree {
    private Node root = new LeafNode(-50, -50, 100, 100);

    public void insertRectangle(int x, int y, int length, int width) {
        root.insert(new Rectangle(x, y, length, width));
    }

    public void deleteRectangle(int x, int y) {
        if (!root.delete(x, y)) System.out.println("Nothing to delete at (" + x + ", " + y + ")");
    }

    public void findRectangle(int x, int y) {
        Rectangle rect = root.find(x, y);
        System.out.println(rect != null ? rect : "Nothing at (" + x + ", " + y + ")");
    }

    public void updateRectangle(int x, int y, int length, int width) {
        Rectangle rect = root.find(x, y);
        if (rect != null) {
            rect.setLength(length);
            rect.setWidth(width);
        } else {
            System.out.println("Nothing to update at (" + x + ", " + y + ")");
        }
    }

    public void dumpTree() {
        root.dump(0);
    }
}
