package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BreadthFirstSearch_T {
  private Graph graph;

  @Before
  public void setup() {
    graph = Utilities.smallGraph();
  }

  private void checkPathTo(BreadthFirstSearch bfs, int[] pathTo, int[] noPathTo) {
    for (int v : pathTo) {
      Assert.assertTrue(bfs.source() + " should be connected to " + v, bfs.hasPathTo(v));
    }

    for (int v : noPathTo) {
      Assert.assertFalse(bfs.source() + " should not be connected to " + v, bfs.hasPathTo(v));
    }
  }

  private void checkDistTo(BreadthFirstSearch bfs, int[] vertices, int[] distTo) {
    for (int i = 0; i < vertices.length; i++) {
      String message =
          bfs.source()
              + " is "
              + bfs.distTo(vertices[i])
              + " hops away from "
              + vertices[i]
              + ", should be "
              + distTo[i];
      Assert.assertEquals(message, distTo[i], bfs.distTo(vertices[i]));
    }
  }

  @Test
  public void testSource() {
    for (int i = 0; i < graph.numVertices(); i++) {
      BreadthFirstSearch bfs = new BreadthFirstSearch(graph, i);
      Assert.assertEquals(i, bfs.source());
    }
  }

  @Test
  public void testSource0() {
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 0);

    int[] vertices = new int[] {0, 1, 2, 3, 4, 5, 6};
    checkPathTo(bfs, vertices, Utilities.vertexInverse(graph, vertices));
    checkDistTo(bfs, vertices, new int[] {0, 1, 1, 2, 2, 1, 1});
  }

  @Test
  public void testSource1() {
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 1);

    int[] vertices = new int[] {0, 1, 2, 3, 4, 5, 6};
    checkPathTo(bfs, vertices, Utilities.vertexInverse(graph, vertices));
    checkDistTo(bfs, vertices, new int[] {1, 0, 2, 3, 3, 2, 2});
  }

  @Test
  public void testSource2() {
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 2);

    int[] vertices = new int[] {0, 1, 2, 3, 4, 5, 6};
    checkPathTo(bfs, vertices, Utilities.vertexInverse(graph, vertices));
    checkDistTo(bfs, vertices, new int[] {1, 2, 0, 3, 3, 2, 2});
  }

  @Test
  public void testSource3() {
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 3);

    int[] vertices = new int[] {0, 1, 2, 3, 4, 5, 6};
    checkPathTo(bfs, vertices, Utilities.vertexInverse(graph, vertices));
    checkDistTo(bfs, vertices, new int[] {2, 3, 3, 0, 1, 1, 2});
  }

  @Test
  public void testSource4() {
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 4);

    int[] vertices = new int[] {0, 1, 2, 3, 4, 5, 6};
    checkPathTo(bfs, vertices, Utilities.vertexInverse(graph, vertices));
    checkDistTo(bfs, vertices, new int[] {2, 3, 3, 1, 0, 1, 1});
  }

  @Test
  public void testSource5() {
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 5);

    int[] vertices = new int[] {0, 1, 2, 3, 4, 5, 6};
    checkPathTo(bfs, vertices, Utilities.vertexInverse(graph, vertices));
    checkDistTo(bfs, vertices, new int[] {1, 2, 2, 1, 1, 0, 2});
  }

  @Test
  public void testSource6() {
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 6);

    int[] vertices = new int[] {0, 1, 2, 3, 4, 5, 6};
    checkPathTo(bfs, vertices, Utilities.vertexInverse(graph, vertices));
    checkDistTo(bfs, vertices, new int[] {1, 2, 2, 2, 1, 2, 0});
  }

  @Test
  public void testSource7() {
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 7);

    int[] vertices = new int[] {7, 8};
    checkPathTo(bfs, vertices, Utilities.vertexInverse(graph, vertices));
    checkDistTo(bfs, vertices, new int[] {0, 1});
  }

  @Test
  public void testSource8() {
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 8);

    int[] vertices = new int[] {7, 8};
    checkPathTo(bfs, vertices, Utilities.vertexInverse(graph, vertices));
    checkDistTo(bfs, vertices, new int[] {1, 0});
  }

  @Test
  public void testSource9() {
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 9);

    int[] vertices = new int[] {9, 10, 11};
    checkPathTo(bfs, vertices, Utilities.vertexInverse(graph, vertices));
    checkDistTo(bfs, vertices, new int[] {0, 1, 1});
  }

  @Test
  public void testSource10() {
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 10);

    int[] vertices = new int[] {9, 10, 11};
    checkPathTo(bfs, vertices, Utilities.vertexInverse(graph, vertices));
    checkDistTo(bfs, vertices, new int[] {1, 0, 2});
  }

  @Test
  public void testSource11() {
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 11);

    int[] vertices = new int[] {9, 10, 11};
    checkPathTo(bfs, vertices, Utilities.vertexInverse(graph, vertices));
    checkDistTo(bfs, vertices, new int[] {1, 2, 0});
  }
}
