package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Queue;
import edu.berkeley.cs.util.Stack;

public class BreadthFirstSearch {
  private final int source;

  private final Graph graph;
  private final boolean[] marked;
  private final int[] edgeTo;
  private final int[] distTo;

  public BreadthFirstSearch(Graph graph, int s) {
    this.graph = graph;
    this.source = s;

    marked = new boolean[graph.numVertices()];
    edgeTo = new int[graph.numVertices()];
    distTo = new int[graph.numVertices()];
    graph.validateVertex(s);
    bfs(s);
  }

  public int source() {
    return source;
  }

  public boolean hasPathTo(int v) {
    graph.validateVertex(v);
    return marked[v];
  }

  public int distTo(int v) {
    graph.validateVertex(v);
    return distTo[v];
  }

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

  private void bfs(int s) {
    // TODO: complete this function
  }
}
