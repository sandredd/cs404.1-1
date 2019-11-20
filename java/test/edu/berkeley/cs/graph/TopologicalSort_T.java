package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Test;

public class TopologicalSort_T {
  @Test
  public void testCyclicGraphNoTopologicalOrder() {
    DirectedGraph graph = Utilities.smallCyclicGraph();
    TopologicalSort topological = new TopologicalSort(graph);
    Assert.assertFalse(topological.hasOrder());
    Assert.assertNull(topological.order());
  }

  @Test
  public void testAcyclicGraph() {
    DirectedGraph graph = Utilities.smallAcyclicGraph();
    TopologicalSort topological = new TopologicalSort(graph);
    Assert.assertTrue(topological.hasOrder());

    int[] expected = new int[] {8, 7, 2, 3, 0, 5, 1, 6, 9, 11, 10, 12, 4};
    int[] actual = new int[expected.length];

    int i = 0;
    for (int v : topological.order()) {
      actual[i] = v;
      i++;
    }

    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void testTopologicalOrderReversePostorder() {
    DirectedGraph graph = Utilities.smallAcyclicGraph();

    int[] a = new int[graph.numVertices()];
    int[] b = new int[graph.numVertices()];

    TopologicalSort topological = new TopologicalSort(graph);
    int i = 0;
    for (int v : topological.order()) {
      a[i] = v;
      i++;
    }

    DepthFirstOrder dfs = new DepthFirstOrder(graph);
    i = 0;
    for (int v : dfs.reversePostorder()) {
      b[i] = v;
      i++;
    }

    Assert.assertArrayEquals(a, b);
  }
}
