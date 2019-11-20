package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Graph_T {
  private Graph graph;

  @Before
  public void setup() {
    graph = Utilities.smallGraph();
  }

  @Test
  public void testGraphProperties() {
    Assert.assertEquals(11, graph.numEdges());
    Assert.assertEquals(12, graph.numVertices());
  }

  @Test
  public void testDegree() {
    Assert.assertEquals(4, graph.degree(0));
    Assert.assertEquals(1, graph.degree(1));
    Assert.assertEquals(1, graph.degree(2));
    Assert.assertEquals(2, graph.degree(3));
    Assert.assertEquals(3, graph.degree(4));
    Assert.assertEquals(3, graph.degree(5));
    Assert.assertEquals(2, graph.degree(6));
    Assert.assertEquals(1, graph.degree(7));
    Assert.assertEquals(1, graph.degree(8));
    Assert.assertEquals(2, graph.degree(9));
    Assert.assertEquals(1, graph.degree(10));
    Assert.assertEquals(1, graph.degree(11));
  }

  private boolean hasEdgeTo(Iterable<Edge> edges, int vertex, double weight) {
    for (Edge edge : edges) {
      if (edge.to() == vertex && edge.weight() == weight) {
        return true;
      }
    }

    return false;
  }

  @Test
  public void testEdges() {
    Assert.assertTrue(hasEdgeTo(graph.edges(0), 6, 20));
    Assert.assertTrue(hasEdgeTo(graph.edges(0), 2, 12));
    Assert.assertTrue(hasEdgeTo(graph.edges(0), 1, 14));
    Assert.assertTrue(hasEdgeTo(graph.edges(0), 5, 8));
    Assert.assertTrue(hasEdgeTo(graph.edges(3), 5, 2));
    Assert.assertTrue(hasEdgeTo(graph.edges(3), 4, 4));
    Assert.assertTrue(hasEdgeTo(graph.edges(4), 5, 7));
    Assert.assertTrue(hasEdgeTo(graph.edges(4), 6, 13));
    Assert.assertTrue(hasEdgeTo(graph.edges(7), 8, 17));
    Assert.assertTrue(hasEdgeTo(graph.edges(9), 10, 19));
    Assert.assertTrue(hasEdgeTo(graph.edges(9), 11, 11));
  }
}
