package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.HashSet;
import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Test;

public class MinimumSpanningTree_T {
  private static final double epsilon = 0.0001;

  @Test
  public void testSmallGraph() {
    MinimumSpanningTree mst = new MinimumSpanningTree(Utilities.smallGraph());
    Assert.assertEquals(100, mst.weight(), epsilon);

    HashSet<Edge> edges = new HashSet<>();
    for (Edge edge : mst.edges()) {
      edges.add(edge);
    }

    Assert.assertTrue(edges.contains(new Edge(0, 2, 12)));
    Assert.assertTrue(edges.contains(new Edge(1, 0, 14)));
    Assert.assertTrue(edges.contains(new Edge(10, 9, 19)));
    Assert.assertTrue(edges.contains(new Edge(4, 3, 4)));
    Assert.assertTrue(edges.contains(new Edge(5, 0, 8)));
    Assert.assertTrue(edges.contains(new Edge(5, 3, 2)));
    Assert.assertTrue(edges.contains(new Edge(6, 4, 13)));
    Assert.assertTrue(edges.contains(new Edge(8, 7, 17)));
    Assert.assertTrue(edges.contains(new Edge(9, 11, 11)));
  }

  @Test
  public void testLargeGraph() {
    MinimumSpanningTree mst = new MinimumSpanningTree(Utilities.largeGraph());
    Assert.assertEquals(2140, mst.weight());

    HashSet<Edge> edges = new HashSet<>();
    for (Edge edge : mst.edges()) {
      edges.add(edge);
    }

    Assert.assertTrue(edges.contains(new Edge(10, 13, 19)));
    Assert.assertTrue(edges.contains(new Edge(11, 43, 48)));
    Assert.assertTrue(edges.contains(new Edge(11, 45, 44)));
    Assert.assertTrue(edges.contains(new Edge(15, 12, 89)));
    Assert.assertTrue(edges.contains(new Edge(15, 13, 80)));
    Assert.assertTrue(edges.contains(new Edge(16, 27, 65)));
    Assert.assertTrue(edges.contains(new Edge(16, 4, 79)));
    Assert.assertTrue(edges.contains(new Edge(17, 23, 17)));
    Assert.assertTrue(edges.contains(new Edge(18, 23, 49)));
    Assert.assertTrue(edges.contains(new Edge(19, 20, 41)));
    Assert.assertTrue(edges.contains(new Edge(19, 21, 25)));
    Assert.assertTrue(edges.contains(new Edge(19, 25, 22)));
    Assert.assertTrue(edges.contains(new Edge(20, 13, 86)));
    Assert.assertTrue(edges.contains(new Edge(20, 14, 109)));
    Assert.assertTrue(edges.contains(new Edge(24, 25, 30)));
    Assert.assertTrue(edges.contains(new Edge(25, 26, 33)));
    Assert.assertTrue(edges.contains(new Edge(27, 42, 46)));
    Assert.assertTrue(edges.contains(new Edge(28, 17, 53)));
    Assert.assertTrue(edges.contains(new Edge(28, 22, 128)));
    Assert.assertTrue(edges.contains(new Edge(28, 27, 32)));
    Assert.assertTrue(edges.contains(new Edge(29, 23, 38)));
    Assert.assertTrue(edges.contains(new Edge(3, 21, 40)));
    Assert.assertTrue(edges.contains(new Edge(30, 36, 84)));
    Assert.assertTrue(edges.contains(new Edge(32, 18, 45)));
    Assert.assertTrue(edges.contains(new Edge(33, 49, 42)));
    Assert.assertTrue(edges.contains(new Edge(34, 42, 62)));
    Assert.assertTrue(edges.contains(new Edge(35, 34, 20)));
    Assert.assertTrue(edges.contains(new Edge(35, 40, 57)));
    Assert.assertTrue(edges.contains(new Edge(37, 39, 12)));
    Assert.assertTrue(edges.contains(new Edge(38, 26, 36)));
    Assert.assertTrue(edges.contains(new Edge(38, 31, 3)));
    Assert.assertTrue(edges.contains(new Edge(38, 37, 10)));
    Assert.assertTrue(edges.contains(new Edge(39, 36, 4)));
    Assert.assertTrue(edges.contains(new Edge(4, 1, 110)));
    Assert.assertTrue(edges.contains(new Edge(4, 5, 26)));
    Assert.assertTrue(edges.contains(new Edge(40, 39, 14)));
    Assert.assertTrue(edges.contains(new Edge(41, 40, 18)));
    Assert.assertTrue(edges.contains(new Edge(41, 43, 43)));
    Assert.assertTrue(edges.contains(new Edge(43, 47, 24)));
    Assert.assertTrue(edges.contains(new Edge(44, 47, 8)));
    Assert.assertTrue(edges.contains(new Edge(45, 46, 64)));
    Assert.assertTrue(edges.contains(new Edge(46, 48, 58)));
    Assert.assertTrue(edges.contains(new Edge(48, 49, 61)));
    Assert.assertTrue(edges.contains(new Edge(6, 1, 1)));
    Assert.assertTrue(edges.contains(new Edge(6, 9, 21)));
    Assert.assertTrue(edges.contains(new Edge(7, 4, 13)));
    Assert.assertTrue(edges.contains(new Edge(8, 3, 5)));
    Assert.assertTrue(edges.contains(new Edge(9, 0, 11)));
    Assert.assertTrue(edges.contains(new Edge(9, 2, 115)));
  }
}
