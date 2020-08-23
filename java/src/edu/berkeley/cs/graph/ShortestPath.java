package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Stack;

public class ShortestPath {
  private Edge[] edgeTo;
  private float[] distTo;

  /**
   * @param graph the graph to search through
   * @param s the source vertex where the search will begin
   */
  public ShortestPath(Graph graph, int s) {
    // TODO: complete this function
  }

  /** @return the distance from the source vertex to vertex v */
  public float distTo(int v) {
    return distTo[v];
  }

  /** @return true if the source vertex has a path to vertex v */
  public boolean hasPathTo(int v) {
    return distTo[v] < Float.MAX_VALUE;
  }

  /** @return the path from the source vertex to vertex v */
  public Iterable<Edge> pathTo(int v) {
    if (!hasPathTo(v)) {
      return null;
    }

    Stack<Edge> stack = new Stack<>();

    Edge edge = edgeTo[v];
    while (edge != null) {
      stack.push(edge);
      edge = edgeTo[edge.to()];
    }

    return stack;
  }
}
