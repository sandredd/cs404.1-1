package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Queue;

public class MultipleSourceShortestPath {
  private ShortestPath sp;

  public MultipleSourceShortestPath(DirectedGraph input, int[] sources) {
    DirectedGraph graph = new DirectedGraph(input.numVertices() + 1);

    int singleSource = graph.numVertices() - 1;
    for (int source : sources) {
      graph.addEdge(singleSource, source, 0);
    }

    for (Edge edge : input.edges()) {
      graph.addEdge(edge.from(), edge.to(), edge.weight());
    }

    sp = new ShortestPath(graph, singleSource);
  }

  public boolean hasPathTo(int v) {
    return sp.hasPathTo(v);
  }

  public Iterable<Edge> pathTo(int v) {
    Queue<Edge> path = new Queue<Edge>();
    for (Edge edge : sp.pathTo(v)) {
      path.enqueue(edge);
    }

    path.dequeue();
    return path;
  }

  public double distTo(int v) {
    return sp.distTo(v);
  }
}
