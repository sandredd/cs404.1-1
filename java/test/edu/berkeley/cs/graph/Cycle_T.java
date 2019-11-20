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
  }

  @Test
  public void testHasNoCycle() {
    graph = Utilities.smallAcyclicGraph();
    Cycle finder = new Cycle(graph);
    Assert.assertFalse(finder.hasCycle());
  }

  @Test
  public void testCyclePath() {
    graph = Utilities.smallCyclicGraph();
    Cycle finder = new Cycle(graph);

    int[] cycle = new int[] {3, 2, 3};
    int i = 0;
    for (int v : finder.cycle()) {
      Assert.assertEquals(cycle[i], v);
      i++;
    }
  }
}
