package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.LinkedList;

public class Graph {
  private final int vertices;
  private int edges;
  private LinkedList<Integer>[] adjacencyList;

  public Graph(int vertices) {
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

  public void addEdge(int v, int w) {
    validateVertex(v);
    validateVertex(w);

    edges++;
    adjacencyList[v].insertEnd(w);
    adjacencyList[w].insertEnd(v);
  }

  public LinkedList<Integer> adjacentVertices(int v) {
    validateVertex(v);
    return adjacencyList[v];
  }

  public int degree(int v) {
    validateVertex(v);
    return adjacencyList[v].size();
  }
}
