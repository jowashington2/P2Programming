/**
 * Abstract base class representing a Node in the quadtree.
 * This class will be extended by both InternalNode and LeafNode.
 */
public abstract class Node {
    protected int x, y, width, height;

    public Node(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Inserts a rectangle into the node.
     * @param rect The rectangle to insert.
     */
    public abstract void insert(Rectangle rect);

    /**
     * Deletes a rectangle at specified coordinates.
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     * @return true if deletion was successful, false otherwise.
     */
    public abstract boolean delete(int x, int y);

    /**
     * Finds a rectangle at specified coordinates.
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     * @return The found rectangle, or null if not found.
     */
    public abstract Rectangle find(int x, int y);

    /**
     * Dumps the tree structure.
     * @param level The level of indentation.
     */
    public abstract void dump(int level);
}
