package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.LinkedList;

public class Graph {
  private final int vertices;
  protected int edges;
  protected LinkedList<Edge>[] adjacencyList;

  /**
   * Create a new graph with the given number of vertices. No vertices will be connected with any
   * edges. Use the addEdge methods to connect vertices.
   */
  public Graph(int vertices) {
    if (vertices < 0) {
      throw new IllegalArgumentException("Number of vertices must be nonnegative");
    }

    this.vertices = vertices;
    adjacencyList = new LinkedList[vertices];

    for (int i = 0; i < adjacencyList.length; i++) {
      adjacencyList[i] = new LinkedList<>();
    }
  }

  /** @return the total number of edges in the graph */
  public int numEdges() {
    return edges;
  }

  /** @return the total number of vertices in the graph */
  public int numVertices() {
    return vertices;
  }

  /** Ensure that vertex v satisfies all required graph properties to be valid */
  protected void validateVertex(int v) {
    if (v < 0 || v >= vertices)
      throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (vertices - 1));
  }

  /**
   * Connect two vertices (bidirectional) in the graph with an edge that has a zero weight. This
   * function is primarily used in non-edge-weighted graphs.
   */
  public void addEdge(int from, int to) {
    addEdge(from, to, 0);
  }

  /** Connect two vertices (bidirectional) in the graph with an edge that has a given weight */
  public void addEdge(int from, int to, float weight) {
    validateVertex(from);
    validateVertex(to);

    edges++;
    adjacencyList[from].insertEnd(new Edge(from, to, weight));
    adjacencyList[to].insertEnd(new Edge(to, from, weight));
  }

  /** @return the edges in the graph */
  public Iterable<Edge> edges() {
    LinkedList<Edge> list = new LinkedList<>();
    for (int i = 0; i < vertices; i++) {
      for (Edge edge : edges(i)) {
        list.insertEnd(edge);
      }
    }

    return list;
  }

  /** @return the edges connected to vertex v */
  public Iterable<Edge> edges(int v) {
    // create a copy of the adjacency list to expressly avoid passing back an internal reference
    // that the caller can modify (could potentially corrupt the internal adjacency lists).
    LinkedList<Edge> list = new LinkedList<>();

    for (Edge edge : adjacencyList[v]) {
      list.insertEnd(edge);
    }

    return list;
  }

  /** @return the vertices adjacent to vertex v */
  public LinkedList<Integer> adjacentVertices(int v) {
    validateVertex(v);

    LinkedList<Integer> vertices = new LinkedList<>();
    for (Edge edge : adjacencyList[v]) {
      vertices.insertEnd(edge.to());
    }

    return vertices;
  }

  /** @return the number of edges connected to vertex v */
  public int degree(int v) {
    validateVertex(v);
    return adjacencyList[v].size();
  }
}
