package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.HashSet;
import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Test;

public class MinimumSpanningTree_T {
  private static final double epsilon = 0.0001;

  private void checkEdge(HashSet<Edge> edges, int from, int to, float weight) {
    Edge a = new Edge(from, to, weight);
    Edge b = a.reverse();
    Assert.assertTrue(from + " -- " + to + " missing", edges.contains(a) || edges.contains(b));
  }

  @Test
  public void testSmallGraph() {
    MinimumSpanningTree mst = new MinimumSpanningTree(Utilities.smallGraph());
    Assert.assertEquals(100, mst.weight(), epsilon);

    HashSet<Edge> edges = new HashSet<>();
    for (Edge edge : mst.edges()) {
      edges.add(edge);
    }

    checkEdge(edges, 0, 2, 12);
    checkEdge(edges, 1, 0, 14);
    checkEdge(edges, 10, 9, 19);
    checkEdge(edges, 4, 3, 4);
    checkEdge(edges, 5, 0, 8);
    checkEdge(edges, 5, 3, 2);
    checkEdge(edges, 6, 4, 13);
    checkEdge(edges, 8, 7, 17);
    checkEdge(edges, 9, 11, 11);
  }

  @Test
  public void testLargeGraph() {
    MinimumSpanningTree mst = new MinimumSpanningTree(Utilities.largeGraph());
    Assert.assertEquals(2140, mst.weight(), epsilon);

    HashSet<Edge> edges = new HashSet<>();
    for (Edge edge : mst.edges()) {
      edges.add(edge);
    }

    checkEdge(edges, 10, 13, 19);
    checkEdge(edges, 11, 43, 48);
    checkEdge(edges, 11, 45, 44);
    checkEdge(edges, 15, 12, 89);
    checkEdge(edges, 15, 13, 80);
    checkEdge(edges, 16, 27, 65);
    checkEdge(edges, 16, 4, 79);
    checkEdge(edges, 17, 23, 17);
    checkEdge(edges, 18, 23, 49);
    checkEdge(edges, 19, 20, 41);
    checkEdge(edges, 19, 21, 25);
    checkEdge(edges, 19, 25, 22);
    checkEdge(edges, 20, 13, 86);
    checkEdge(edges, 20, 14, 109);
    checkEdge(edges, 24, 25, 30);
    checkEdge(edges, 25, 26, 33);
    checkEdge(edges, 27, 42, 46);
    checkEdge(edges, 28, 17, 53);
    checkEdge(edges, 28, 22, 128);
    checkEdge(edges, 28, 27, 32);
    checkEdge(edges, 29, 23, 38);
    checkEdge(edges, 3, 21, 40);
    checkEdge(edges, 30, 36, 84);
    checkEdge(edges, 32, 18, 45);
    checkEdge(edges, 33, 49, 42);
    checkEdge(edges, 34, 42, 62);
    checkEdge(edges, 35, 34, 20);
    checkEdge(edges, 35, 40, 57);
    checkEdge(edges, 37, 39, 12);
    checkEdge(edges, 38, 26, 36);
    checkEdge(edges, 38, 31, 3);
    checkEdge(edges, 38, 37, 10);
    checkEdge(edges, 39, 36, 4);
    checkEdge(edges, 4, 1, 110);
    checkEdge(edges, 4, 5, 26);
    checkEdge(edges, 40, 39, 14);
    checkEdge(edges, 41, 40, 18);
    checkEdge(edges, 41, 43, 43);
    checkEdge(edges, 43, 47, 24);
    checkEdge(edges, 44, 47, 8);
    checkEdge(edges, 45, 46, 64);
    checkEdge(edges, 46, 48, 58);
    checkEdge(edges, 48, 49, 61);
    checkEdge(edges, 6, 1, 1);
    checkEdge(edges, 6, 9, 21);
    checkEdge(edges, 7, 4, 13);
    checkEdge(edges, 8, 3, 5);
    checkEdge(edges, 9, 0, 11);
    checkEdge(edges, 9, 2, 115);
  }
}
