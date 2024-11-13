# P2Programming
Programming Language Project 2

# Quadtree Project

This project implements a quadtree data structure in Java, allowing for efficient spatial data management in a 2D space. The quadtree is designed to handle basic operations like inserting, finding, deleting, updating, and dumping (printing) rectangles.

## Project Overview

The project uses a hierarchical quadtree structure where:
- **Leaf Nodes** hold up to five rectangles. If more than five rectangles are added, the node splits into four **Internal Nodes**.
- **Internal Nodes** divide the space into four quadrants, each capable of holding rectangles or further subdivisions.

This quadtree implementation supports five key operations:
1. **Insert**: Adds a rectangle to the quadtree.
2. **Find**: Retrieves a rectangle at specified coordinates.
3. **Delete**: Removes a rectangle at specified coordinates.
4. **Update**: Changes the dimensions of a rectangle at specified coordinates.
5. **Dump**: Prints the entire quadtree structure, showing nodes and rectangles in a structured format.

## File Structure

- **src/main/java**:
  - `Node.java`: Abstract base class for tree nodes.
  - `LeafNode.java`: Represents leaf nodes that store rectangles.
  - `InternalNode.java`: Represents internal nodes that divide the space.
  - `Rectangle.java`: Represents a rectangle with position and size.
  - `Quadtree.java`: Manages the quadtree and provides operations.
  - `Main.java`: Main program that reads commands from a file and performs operations on the quadtree.

