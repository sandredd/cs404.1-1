package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DepthFirstSearch_T {
  private Graph graph;

  @Before
  public void setup() {
    graph = Utilities.smallGraph();
  }

  private void checkPathTo(DepthFirstSearch dfs, int[] pathTo, int[] noPathTo) {
    for (int v : pathTo) {
      Assert.assertTrue(dfs.source() + " should be connected to " + v, dfs.hasPathTo(v));
    }

    for (int v : noPathTo) {
      Assert.assertFalse(dfs.source() + " should not be connected to " + v, dfs.hasPathTo(v));
    }
  }

  @Test
  public void testSource() {
    for (int i = 0; i < graph.numVertices(); i++) {
      DepthFirstSearch dfs = new DepthFirstSearch(graph, i);
      Assert.assertEquals(i, dfs.source());
    }
  }

  @Test
  public void testSource0_1_2_3_4_5_6() {
    for (int i = 0; i <= 6; i++) {
      DepthFirstSearch dfs = new DepthFirstSearch(graph, i);
      Assert.assertEquals(7, dfs.connectedVertices());

      int[] vertices = new int[] {0, 1, 2, 3, 4, 5, 6};
      checkPathTo(dfs, vertices, Utilities.vertexInverse(graph, vertices));
    }
  }

  @Test
  public void testSource7_8() {
    for (int i = 7; i <= 8; i++) {
      DepthFirstSearch dfs = new DepthFirstSearch(graph, i);
      Assert.assertEquals(2, dfs.connectedVertices());

      int[] vertices = new int[] {7, 8};
      checkPathTo(dfs, vertices, Utilities.vertexInverse(graph, vertices));
    }
  }

  @Test
  public void testSource9_10_11() {
    for (int i = 9; i <= 11; i++) {
      DepthFirstSearch dfs = new DepthFirstSearch(graph, i);
      Assert.assertEquals(3, dfs.connectedVertices());

      int[] vertices = new int[] {9, 10, 11};
      checkPathTo(dfs, vertices, Utilities.vertexInverse(graph, vertices));
    }
  }
}
