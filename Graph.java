import java.util.*;

public class Graph {
    HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
    int vertex;
    ArrayList<Integer> edges = new ArrayList<>();

    public ArrayList<Integer> getEdges() {
        return edges;
    }

    public int getVertex() {
        return vertex;
    }

    public void setEdges(ArrayList<Integer> edges) {
        this.edges = edges;
    }

    public void setVertex(int vertex) {
        this.vertex = vertex;
    }

    public void addVertex(int vertex) {
        graph.put(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        if (graph.containsKey(source)) {
            ArrayList<Integer> edgesList = graph.get(source);
            edgesList.add(destination);
        } else {
            System.out.println("Source vertex does not exist. Please add the vertex first.");
        }
    }

    public void removeEdge(int source, int destination) {
        if (graph.containsKey(source)) {
            ArrayList<Integer> edgesList = graph.get(source);
            edgesList.remove(Integer.valueOf(destination));
        } else {
            System.out.println("Source vertex does not exist.");
        }
    }

    public void printGraph() {
        System.out.println(graph);
    }

    public void getHashMap(String command, int key, int value) {
        switch (command) {
            case "addVertex":
                addVertex(key);
                break;
            case "addEdge":
                addEdge(key, value);
                break;
            case "removeEdge":
                removeEdge(key, value);
                break;
            case "printGraph":
                printGraph();
                break;
            default:
                System.out.println("Invalid command.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Graph graph = new Graph();

        System.out.println("Enter your commands (type 'exit' to stop): ");
        String input;
        while (!(input = scanner.nextLine()).equals("exit")) {
            String[] inputs = input.split(" ");
            if (inputs.length == 1) {
                graph.getHashMap(inputs[0], 0, 0);
            } else if (inputs.length == 2) {
                int key = Integer.parseInt(inputs[1]);
                graph.getHashMap(inputs[0], key, 0);
            } else if (inputs.length == 3) {
                int key = Integer.parseInt(inputs[1]);
                int value = Integer.parseInt(inputs[2]);
                graph.getHashMap(inputs[0], key, value);
            } else {
                System.out.println("Invalid input format.");
            }
        }
    }
}
