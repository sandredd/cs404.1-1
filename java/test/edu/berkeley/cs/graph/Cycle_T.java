package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.LinkedList;
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

    LinkedList<Integer> expectedCycle = new LinkedList<>();
    expectedCycle.insertFront(3);
    expectedCycle.insertFront(2);
    expectedCycle.insertFront(3);

    int actualSize = 0;
    for (int node : finder.cycle()) {
      actualSize++;
      Assert.assertTrue(expectedCycle.contains(node));
    }

    Assert.assertEquals(expectedCycle.size(), actualSize);
  }

  @Test
  public void testHasNoCycle() {
    graph = Utilities.smallAcyclicGraph();
    Cycle finder = new Cycle(graph);
    Assert.assertFalse(finder.hasCycle());
  }
}
