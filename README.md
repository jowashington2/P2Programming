# P2Programming
Programming Language Project 2

This project implements a quadtree data structure in Java, allowing for efficient spatial data management in a 2D space. The quadtree is designed to handle basic operations like inserting, finding, deleting, updating, and dumping (printing) rectangles.

Project Overview
The project uses a hierarchical quadtree structure where:

Leaf Nodes hold up to five rectangles. If more than five rectangles are added, the node splits into four Internal Nodes.
Internal Nodes divide the space into four quadrants, each capable of holding rectangles or further subdivisions.
This quadtree implementation supports five key operations:

Insert: Adds a rectangle to the quadtree.
Find: Retrieves a rectangle at specified coordinates.
Delete: Removes a rectangle at specified coordinates.
Update: Changes the dimensions of a rectangle at specified coordinates.
Dump: Prints the entire quadtree structure, showing nodes and rectangles in a structured format.
File Structure
src/main/java:
Node.java: Abstract base class for tree nodes.
LeafNode.java: Represents leaf nodes that store rectangles.
InternalNode.java: Represents internal nodes that divide the space.
Rectangle.java: Represents a rectangle with position and size.
Quadtree.java: Manages the quadtree and provides operations.
Main.java: Main program that reads commands from a file and performs operations on the quadtree.
test/java:
QuadtreeTest.java: Contains JUnit test cases for validating the quadtree operations.


Project Structure and Design
Node Classes
Node: Abstract base class with essential methods for insert, delete, find, and dump.
LeafNode: Stores up to 5 rectangles. Converts to an InternalNode if over capacity.
InternalNode: Manages four quadrants with child nodes.
Rectangle Class
The Rectangle class represents the spatial data with fields for position and size. It includes methods for getting and setting properties.

Quadtree Class
The Quadtree class initializes the root node and provides methods for managing operations (insert, delete, find, update, dump).

