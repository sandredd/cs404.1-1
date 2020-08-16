package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Test;

public class Cycle_T {
  private DirectedGraph graph;

  @Test
  public void testHasCycle() {
    graph = Utilities.smallCyclicGraph();
    Cycle finder = new Cycle(graph);
    Assert.assertTrue(finder.hasCycle());

    int first = -1;
    int last = -1;
    int prev = -1;

    for (int vertex : finder.cycle()) {
      if (first == -1) {
        first = vertex;
      }

      graph.validateVertex(vertex);
      if (prev == -1) {
        prev = vertex;
        continue;
      }

      Assert.assertTrue(graph.adjacentVertices(prev).contains(vertex));
      prev = vertex;
    }

    // we must begin and end on the same node
    last = prev;
    Assert.assertEquals(first, last);
  }

  @Test
  public void testHasNoCycle() {
    graph = Utilities.smallAcyclicGraph();
    Cycle finder = new Cycle(graph);
    Assert.assertFalse(finder.hasCycle());
  }
}
