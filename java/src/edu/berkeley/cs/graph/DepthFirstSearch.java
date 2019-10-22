package edu.berkeley.cs.graph;

public class DepthFirstSearch {
  private final Graph graph;
  private final int source;
  private final boolean[] marked;
  private int connectedVertices;

  public DepthFirstSearch(Graph graph, int source) {
    this.graph = graph;
    this.source = source;

    marked = new boolean[graph.numVertices()];
    graph.validateVertex(source);
    dfs(source);
  }

  public boolean hasPathTo(int v) {
    graph.validateVertex(v);
    return marked[v];
  }

  public int source() {
    return source;
  }

  public int connectedVertices() {
    return connectedVertices;
  }

  private void dfs(int v) {
    // TODO: complete this function
  }
}
