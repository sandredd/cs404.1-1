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
  }

  @Test
  public void testCycleFound() {
    graph = Utilities.smallCyclicGraph();
    Cycle finder = new Cycle(graph);
    LinkedList<Integer> expectedCycle = new LinkedList<>();
    expectedCycle.insertFront(2);
    expectedCycle.insertFront(3);
    int actualCycleSize = 0;
    for (int i : finder.cycle()){
      actualCycleSize++;
      Assert.assertTrue(expectedCycle.contains(i));
    }
    Assert.assertTrue(actualCycleSize == expectedCycle.size());
  }

  @Test
  public void testHasNoCycle() {
    graph = Utilities.smallAcyclicGraph();
    Cycle finder = new Cycle(graph);
    Assert.assertFalse(finder.hasCycle());
  }
}
