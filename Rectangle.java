public class Rectangle {
    private int x, y, length, width;

    public Rectangle(int x, int y, int length, int width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getLength() { return length; }
    public int getWidth() { return width; }

    @Override
    public String toString() {
        return "Rectangle at (" + x + ", " + y + "): " + length + "x" + width;
    }

    public void setLength(int length2) {
    }

    public void setWidth(int width2) {
    }
}
