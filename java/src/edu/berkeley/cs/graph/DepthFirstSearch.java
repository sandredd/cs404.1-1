package edu.berkeley.cs.graph;

public class DepthFirstSearch {
  private final Graph graph;
  private final int source;
  private final boolean[] marked;
  private int connectedVertices;

  /**
   * @param graph the graph to search through
   * @param source the source vertex where the search will begin
   */
  public DepthFirstSearch(Graph graph, int source) {
    this.graph = graph;
    this.source = source;

    marked = new boolean[graph.numVertices()];
    graph.validateVertex(source);
    dfs(source);
  }

  /** @return true if the source vertex has a path to vertex v */
  public boolean hasPathTo(int v) {
    graph.validateVertex(v);
    return marked[v];
  }

  /** @return the source vertex where the search began */
  public int source() {
    return source;
  }

  /** @return the number of vertices that are connected to the source vertex */
  public int connectedVertices() {
    return connectedVertices;
  }

  /**
   * Execute a depth first search. This method is normally implemented recursively but you are free
   * to implement it however you wish.
   *
   * @param v the vertex to execute the search on
   */
  private void dfs(int v) {
    // TODO: complete this function
  }
}
