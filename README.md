# ap-hw2-Graph
# Graph Program

This is a simple Java program for working with directed graphs. The program provides functionality to add vertices, add edges, remove edges, and print the graph. The user interacts with the program through the command line.

## Getting Started

To use this program, you need to have Java installed on your machine. Clone the repository to your local machine using the following command:

```bash
git clone https://github.com/your-username/graph-program.git
```

Navigate to the project directory:

```bash
cd graph-program
```

Compile the program:

```bash
javac Graph.java
```

Run the program:

```bash
java Graph
```

## Usage

The program accepts commands in the following format:

- To add a vertex: `addVertex <vertex>`
- To add an edge: `addEdge <source> <destination>`
- To remove an edge: `removeEdge <source> <destination>`
- To print the graph: `printGraph`

Type `exit` to stop the program.

### Example Usage

```bash
addVertex 1
addVertex 2
addEdge 1 2
printGraph
removeEdge 1 2
printGraph
exit
```

## Program Structure

The program consists of a `Graph` class with methods for adding vertices, adding edges, removing edges, and printing the graph. The main method provides a simple command-line interface for interacting with the graph.

### Graph Class Methods

- `addVertex(int vertex)`: Adds a vertex to the graph.
- `addEdge(int source, int destination)`: Adds a directed edge from the source vertex to the destination vertex.
- `removeEdge(int source, int destination)`: Removes the directed edge from the source vertex to the destination vertex.
- `printGraph()`: Prints the current state of the graph.
- `getHashMap(String command, int key, int value)`: Handles user commands and invokes the corresponding graph operation.

### Main Method

The main method initializes a `Graph` object and enters a loop to read user commands from the command line. It processes the commands and interacts with the graph accordingly.

## Contributing

If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request. Contributions are welcome!

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
