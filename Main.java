import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <command_file>");
            return;
        }

        Quadtree quadtree = new Quadtree();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");
                switch (tokens[0]) {
                    case "Insert":
                        quadtree.insertRectangle(
                            Integer.parseInt(tokens[1]),
                            Integer.parseInt(tokens[2]),
                            Integer.parseInt(tokens[3]),
                            Integer.parseInt(tokens[4])
                        );
                        break;
                    case "Delete":
                        quadtree.deleteRectangle(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                        break;
                    case "Find":
                        quadtree.findRectangle(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                        break;
                    case "Update":
                        quadtree.updateRectangle(
                            Integer.parseInt(tokens[1]),
                            Integer.parseInt(tokens[2]),
                            Integer.parseInt(tokens[3]),
                            Integer.parseInt(tokens[4])
                        );
                        break;
                    case "Dump":
                        quadtree.dumpTree();
                        break;
                    default:
                        System.out.println("Invalid command: " + tokens[0]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading command file: " + e.getMessage());
        }
    }
}
