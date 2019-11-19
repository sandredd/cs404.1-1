package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.LinkedList;

public class Graph {
  private final int vertices;
  protected int edges;
  protected LinkedList<Edge>[] adjacencyList;

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

  public int numEdges() {
    return edges;
  }

  public int numVertices() {
    return vertices;
  }

  protected void validateVertex(int v) {
    if (v < 0 || v >= vertices)
      throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (vertices - 1));
  }

  public void addEdge(int from, int to) {
    addEdge(from, to, 0);
  }

  public void addEdge(int from, int to, double weight) {
    validateVertex(from);
    validateVertex(to);

    edges++;
    adjacencyList[from].insertEnd(new Edge(from, to, weight));
    adjacencyList[to].insertEnd(new Edge(to, from, weight));
  }

  public LinkedList<Edge> edges() {
    LinkedList<Edge> list = new LinkedList<>();
    for (int i = 0; i < vertices; i++) {
      for (Edge edge : adjacentVertices(i)) {
        list.insertEnd(edge);
      }
    }

    return list;
  }

  public LinkedList<Edge> adjacentVertices(int v) {
    validateVertex(v);
    return adjacencyList[v];
  }

  public int degree(int v) {
    validateVertex(v);
    return adjacencyList[v].size();
  }
}
