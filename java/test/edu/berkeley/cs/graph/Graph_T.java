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

  @Test
  public void testAdjacentVertices() {
    Assert.assertTrue(graph.adjacentVertices(0).contains(6));
    Assert.assertTrue(graph.adjacentVertices(0).contains(2));
    Assert.assertTrue(graph.adjacentVertices(0).contains(1));
    Assert.assertTrue(graph.adjacentVertices(0).contains(5));
    Assert.assertTrue(graph.adjacentVertices(3).contains(5));
    Assert.assertTrue(graph.adjacentVertices(3).contains(4));
    Assert.assertTrue(graph.adjacentVertices(4).contains(5));
    Assert.assertTrue(graph.adjacentVertices(4).contains(6));
    Assert.assertTrue(graph.adjacentVertices(7).contains(8));
    Assert.assertTrue(graph.adjacentVertices(9).contains(10));
    Assert.assertTrue(graph.adjacentVertices(9).contains(11));
  }
}
