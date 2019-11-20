package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DepthFirstOrder_T {
  private DepthFirstOrder dfs;

  @Before
  public void setup() {
    DirectedGraph graph = Utilities.smallDirectedGraph();
    dfs = new DepthFirstOrder(graph);
  }

  @Test
  public void testPreorder() {
    int[] expected = new int[] {0, 6, 2, 1, 5, 3, 4, 7, 8, 9, 10, 11};
    int[] actual = new int[expected.length];

    int i = 0;
    for (int v : dfs.preorder()) {
      actual[i] = v;
      i++;
    }

    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void testPostorder() {
    int[] expected = new int[] {6, 2, 1, 5, 0, 4, 3, 8, 7, 10, 11, 9};
    int[] actual = new int[expected.length];

    int i = 0;
    for (int v : dfs.postorder()) {
      actual[i] = v;
      i++;
    }

    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void testReversePostorder() {
    int[] expected = new int[] {9, 11, 10, 7, 8, 3, 4, 0, 5, 1, 2, 6};
    int[] actual = new int[expected.length];

    int i = 0;
    for (int v : dfs.reversePostorder()) {
      actual[i] = v;
      i++;
    }

    Assert.assertArrayEquals(expected, actual);
  }
}
