package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Test;

public class ShortestPath_T {
  private DirectedGraph graph = Utilities.smallDirectedGraph();
  private static final double epsilon = 0.0001;

  private void checkGraph(ShortestPath sp, boolean[] expectedHasPathTo, double[] expectedDistTo) {
    boolean[] actualHasPathTo = new boolean[expectedHasPathTo.length];
    for (int i = 0; i < actualHasPathTo.length; i++) {
      actualHasPathTo[i] = sp.hasPathTo(i);
    }
    Assert.assertArrayEquals(expectedHasPathTo, actualHasPathTo);

    double[] actualDistTo = new double[expectedDistTo.length];
    for (int i = 0; i < actualDistTo.length; i++) {
      actualDistTo[i] = sp.distTo(i);
    }
    Assert.assertArrayEquals(expectedDistTo, actualDistTo, epsilon);
  }

  @Test
  public void testSource0() {
    ShortestPath sp = new ShortestPath(graph, 0);

    boolean[] hasPathTo =
        new boolean[] {
          true, true, true, false, false, true, true, false, false, false, false, false
        };

    double[] distTo =
        new double[] {
          0,
          14,
          12,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          8,
          20,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE
        };

    checkGraph(sp, hasPathTo, distTo);
  }

  @Test
  public void testSource1() {
    ShortestPath sp = new ShortestPath(graph, 1);

    boolean[] hasPathTo =
        new boolean[] {
          false, true, false, false, false, false, false, false, false, false, false, false
        };

    double[] distTo =
        new double[] {
          Float.MAX_VALUE,
          0,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE
        };

    checkGraph(sp, hasPathTo, distTo);
  }

  @Test
  public void testSource2() {
    ShortestPath sp = new ShortestPath(graph, 2);

    boolean[] hasPathTo =
        new boolean[] {
          false, false, true, false, false, false, false, false, false, false, false, false
        };

    double[] distTo =
        new double[] {
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          0,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE
        };

    checkGraph(sp, hasPathTo, distTo);
  }

  @Test
  public void testSource3() {
    ShortestPath sp = new ShortestPath(graph, 3);

    boolean[] hasPathTo =
        new boolean[] {
          false, false, false, true, true, true, true, false, false, false, false, false
        };

    double[] distTo =
        new double[] {
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          0,
          4,
          2,
          17,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
        };

    checkGraph(sp, hasPathTo, distTo);
  }

  @Test
  public void testSource4() {
    ShortestPath sp = new ShortestPath(graph, 4);

    boolean[] hasPathTo =
        new boolean[] {
          false, false, false, false, true, true, true, false, false, false, false, false
        };

    double[] distTo =
        new double[] {
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          0,
          7,
          13,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
        };

    checkGraph(sp, hasPathTo, distTo);
  }

  @Test
  public void testSource5() {
    ShortestPath sp = new ShortestPath(graph, 5);

    boolean[] hasPathTo =
        new boolean[] {
          false, false, false, false, false, true, false, false, false, false, false, false
        };

    double[] distTo =
        new double[] {
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          0,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
        };

    checkGraph(sp, hasPathTo, distTo);
  }

  @Test
  public void testSource6() {
    ShortestPath sp = new ShortestPath(graph, 6);

    boolean[] hasPathTo =
        new boolean[] {
          false, false, false, false, false, false, true, false, false, false, false, false
        };

    double[] distTo =
        new double[] {
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          0,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
        };

    checkGraph(sp, hasPathTo, distTo);
  }

  @Test
  public void testSource7() {
    ShortestPath sp = new ShortestPath(graph, 7);

    boolean[] hasPathTo =
        new boolean[] {
          false, false, false, false, false, false, false, true, true, false, false, false
        };

    double[] distTo =
        new double[] {
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          0,
          17,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
        };

    checkGraph(sp, hasPathTo, distTo);
  }

  @Test
  public void testSource8() {
    ShortestPath sp = new ShortestPath(graph, 8);

    boolean[] hasPathTo =
        new boolean[] {
          false, false, false, false, false, false, false, false, true, false, false, false
        };

    double[] distTo =
        new double[] {
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          0,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
        };

    checkGraph(sp, hasPathTo, distTo);
  }

  @Test
  public void testSource9() {
    ShortestPath sp = new ShortestPath(graph, 9);

    boolean[] hasPathTo =
        new boolean[] {
          false, false, false, false, false, false, false, false, false, true, true, true
        };

    double[] distTo =
        new double[] {
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          0,
          19,
          11,
        };

    checkGraph(sp, hasPathTo, distTo);
  }

  @Test
  public void testSource10() {
    ShortestPath sp = new ShortestPath(graph, 10);

    boolean[] hasPathTo =
        new boolean[] {
          false, false, false, false, false, false, false, false, false, false, true, false
        };

    double[] distTo =
        new double[] {
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          0,
          Float.MAX_VALUE,
        };

    checkGraph(sp, hasPathTo, distTo);
  }

  @Test
  public void testSource11() {
    ShortestPath sp = new ShortestPath(graph, 11);

    boolean[] hasPathTo =
        new boolean[] {
          false, false, false, false, false, false, false, false, false, false, false, true
        };

    double[] distTo =
        new double[] {
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          0,
        };

    checkGraph(sp, hasPathTo, distTo);
  }
}
