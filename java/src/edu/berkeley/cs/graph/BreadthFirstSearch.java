package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Stack;

public class BreadthFirstSearch {
  private final int source;

  private final Graph graph;
  private final boolean[] marked;
  private final int[] edgeTo;
  private final int[] distTo;

  /**
   * @param graph the graph to search through
   * @param source the source vertex where the search will begin
   */
  public BreadthFirstSearch(Graph graph, int s) {
    this.graph = graph;
    this.source = s;

    marked = new boolean[graph.numVertices()];
    edgeTo = new int[graph.numVertices()];
    distTo = new int[graph.numVertices()];
    graph.validateVertex(s);
    bfs(s);
  }

  /** @return the source vertex where the search began */
  public int source() {
    return source;
  }

  /** @return true if the source vertex has a path to vertex v */
  public boolean hasPathTo(int v) {
    graph.validateVertex(v);
    return marked[v];
  }

  /** @return the distance from the source vertex to vertex v */
  public int distTo(int v) {
    graph.validateVertex(v);
    return distTo[v];
  }

  /** @return the path from the source vertex to vertex v */
  public Iterable<Integer> pathTo(int v) {
    graph.validateVertex(v);

    if (!hasPathTo(v)) {
      return null;
    }

    Stack<Integer> path = new Stack<>();
    int i;
    for (i = v; distTo[i] != 0; i = edgeTo[i]) {
      path.push(i);
    }

    path.push(i);
    return path;
  }

  /**
   * Execute a breadth first search. This method is normally implemented recursively but you are
   * free to implement it however you wish.
   *
   * @param v the vertex to execute the search on
   */
  private void bfs(int s) {
    // TODO: complete this function
  }
}
