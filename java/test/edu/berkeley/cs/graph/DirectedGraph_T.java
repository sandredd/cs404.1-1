package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DirectedGraph_T {
  private DirectedGraph graph;

  @Before
  public void setup() {
    graph = Utilities.smallDirectedGraph();
  }

  private boolean hasEdgeTo(Iterable<Integer> edges, int vertex) {
    for (int w : edges) {
      if (w == vertex) {
        return true;
      }
    }

    return false;
  }

  @Test
  public void testSingleEdgeDirection() {
    Assert.assertTrue(hasEdgeTo(graph.adjacentVertices(0), 6));
    Assert.assertTrue(hasEdgeTo(graph.adjacentVertices(0), 2));
    Assert.assertTrue(hasEdgeTo(graph.adjacentVertices(0), 1));
    Assert.assertTrue(hasEdgeTo(graph.adjacentVertices(0), 5));
    Assert.assertTrue(hasEdgeTo(graph.adjacentVertices(3), 5));
    Assert.assertTrue(hasEdgeTo(graph.adjacentVertices(3), 4));
    Assert.assertTrue(hasEdgeTo(graph.adjacentVertices(4), 5));
    Assert.assertTrue(hasEdgeTo(graph.adjacentVertices(4), 6));
    Assert.assertTrue(hasEdgeTo(graph.adjacentVertices(7), 8));
    Assert.assertTrue(hasEdgeTo(graph.adjacentVertices(9), 10));
    Assert.assertTrue(hasEdgeTo(graph.adjacentVertices(9), 11));

    Assert.assertFalse(hasEdgeTo(graph.adjacentVertices(6), 0));
    Assert.assertFalse(hasEdgeTo(graph.adjacentVertices(2), 0));
    Assert.assertFalse(hasEdgeTo(graph.adjacentVertices(1), 0));
    Assert.assertFalse(hasEdgeTo(graph.adjacentVertices(5), 0));
    Assert.assertFalse(hasEdgeTo(graph.adjacentVertices(5), 3));
    Assert.assertFalse(hasEdgeTo(graph.adjacentVertices(4), 3));
    Assert.assertFalse(hasEdgeTo(graph.adjacentVertices(5), 4));
    Assert.assertFalse(hasEdgeTo(graph.adjacentVertices(6), 4));
    Assert.assertFalse(hasEdgeTo(graph.adjacentVertices(8), 7));
    Assert.assertFalse(hasEdgeTo(graph.adjacentVertices(10), 9));
    Assert.assertFalse(hasEdgeTo(graph.adjacentVertices(11), 9));
  }

  @Test
  public void testOutDegree() {
    int[] expected = new int[] {4, 0, 0, 2, 2, 0, 0, 1, 0, 2, 0, 0};
    int[] actual = new int[expected.length];

    for (int i = 0; i < graph.numVertices(); i++) {
      actual[i] = graph.outdegree(i);
    }

    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void testInDegree() {
    int[] expected = new int[] {0, 1, 1, 0, 1, 3, 2, 0, 1, 0, 1, 1};
    int[] actual = new int[expected.length];

    for (int i = 0; i < graph.numVertices(); i++) {
      actual[i] = graph.indegree(i);
    }

    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void testReversal() {
    DirectedGraph reversed = graph.reverse();

    Assert.assertTrue(hasEdgeTo(reversed.adjacentVertices(6), 0));
    Assert.assertTrue(hasEdgeTo(reversed.adjacentVertices(2), 0));
    Assert.assertTrue(hasEdgeTo(reversed.adjacentVertices(1), 0));
    Assert.assertTrue(hasEdgeTo(reversed.adjacentVertices(5), 0));
    Assert.assertTrue(hasEdgeTo(reversed.adjacentVertices(5), 3));
    Assert.assertTrue(hasEdgeTo(reversed.adjacentVertices(4), 3));
    Assert.assertTrue(hasEdgeTo(reversed.adjacentVertices(5), 4));
    Assert.assertTrue(hasEdgeTo(reversed.adjacentVertices(6), 4));
    Assert.assertTrue(hasEdgeTo(reversed.adjacentVertices(8), 7));
    Assert.assertTrue(hasEdgeTo(reversed.adjacentVertices(10), 9));
    Assert.assertTrue(hasEdgeTo(reversed.adjacentVertices(11), 9));

    Assert.assertFalse(hasEdgeTo(reversed.adjacentVertices(0), 6));
    Assert.assertFalse(hasEdgeTo(reversed.adjacentVertices(0), 2));
    Assert.assertFalse(hasEdgeTo(reversed.adjacentVertices(0), 1));
    Assert.assertFalse(hasEdgeTo(reversed.adjacentVertices(0), 5));
    Assert.assertFalse(hasEdgeTo(reversed.adjacentVertices(3), 5));
    Assert.assertFalse(hasEdgeTo(reversed.adjacentVertices(3), 4));
    Assert.assertFalse(hasEdgeTo(reversed.adjacentVertices(4), 5));
    Assert.assertFalse(hasEdgeTo(reversed.adjacentVertices(4), 6));
    Assert.assertFalse(hasEdgeTo(reversed.adjacentVertices(7), 8));
    Assert.assertFalse(hasEdgeTo(reversed.adjacentVertices(9), 10));
    Assert.assertFalse(hasEdgeTo(reversed.adjacentVertices(9), 11));
  }
}
