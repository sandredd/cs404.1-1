package edu.berkeley.cs.graph;

public class DirectedGraph extends Graph {
  private int[] indegree;

  public DirectedGraph(int vertices) {
    super(vertices);
    this.indegree = new int[vertices];
  }

  @Override
  public void addEdge(int from, int to, float weight) {
    validateVertex(from);
    validateVertex(to);

    edges++;
    adjacencyList[from].insertEnd(new Edge(from, to, weight));
    indegree[to]++;
  }

  public int outdegree(int v) {
    validateVertex(v);
    return adjacencyList[v].size();
  }

  public int indegree(int v) {
    validateVertex(v);
    return indegree[v];
  }

  public DirectedGraph reverse() {
    // TODO: complete this function
    return null;
  }
}
