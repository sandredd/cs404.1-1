package edu.berkeley.cs.graph;

public class DirectedGraph extends Graph {
  private int[] indegree;

  public DirectedGraph(int vertices) {
    super(vertices);
    this.indegree = new int[vertices];
  }

  /** Connect two vertices (unidirectional) in the graph with an edge that has a given weight */
  @Override
  public void addEdge(int from, int to, float weight) {
    validateVertex(from);
    validateVertex(to);

    edges++;
    adjacencyList[from].insertEnd(new Edge(from, to, weight));
    indegree[to]++;
  }

  /** @return the number of edges exiting vertex v */
  public int outdegree(int v) {
    validateVertex(v);
    return adjacencyList[v].size();
  }

  /** @return the number of edges entering vertex v */
  public int indegree(int v) {
    validateVertex(v);
    return indegree[v];
  }

  /**
   * @return a graph that has the same vertices as the current instance but with the edges reversed
   */
  public DirectedGraph reverse() {
    // TODO: complete this function
    return null;
  }
}
