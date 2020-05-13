package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultipleSourceShortestPath_T {
  private DirectedGraph graph;
  private double epsilon = 0.0001;

  @Before
  public void setup() {
    graph = Utilities.smallDirectedGraph();
  }

  private void checkGraph(
      MultipleSourceShortestPath mssp, boolean[] expectedHasPathTo, double[] expectedDistTo) {
    boolean[] actualHasPathTo = new boolean[expectedHasPathTo.length];
    for (int i = 0; i < actualHasPathTo.length; i++) {
      actualHasPathTo[i] = mssp.hasPathTo(i);
    }
    Assert.assertArrayEquals(expectedHasPathTo, actualHasPathTo);

    double[] actualDistTo = new double[expectedDistTo.length];
    for (int i = 0; i < actualDistTo.length; i++) {
      actualDistTo[i] = mssp.distTo(i);
    }
    Assert.assertArrayEquals(expectedDistTo, actualDistTo, epsilon);
  }

  @Test
  public void testSource01() {
    MultipleSourceShortestPath mssp = new MultipleSourceShortestPath(graph, new int[] {0, 1});

    boolean[] hasPathTo =
        new boolean[] {
          true, true, true, false, false, true, true, false, false, false, false, false
        };

    double[] distTo =
        new double[] {
          0,
          0,
          12,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          8,
          20,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
        };

    checkGraph(mssp, hasPathTo, distTo);
  }

  @Test
  public void testSource02() {
    MultipleSourceShortestPath mssp = new MultipleSourceShortestPath(graph, new int[] {0, 2});

    boolean[] hasPathTo =
        new boolean[] {
          true, true, true, false, false, true, true, false, false, false, false, false
        };

    double[] distTo =
        new double[] {
          0,
          14,
          0,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          8,
          20,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
        };

    checkGraph(mssp, hasPathTo, distTo);
  }

  @Test
  public void testSource03() {
    MultipleSourceShortestPath mssp = new MultipleSourceShortestPath(graph, new int[] {0, 3});

    boolean[] hasPathTo =
        new boolean[] {true, true, true, true, true, true, true, false, false, false, false, false};

    double[] distTo =
        new double[] {
          0,
          14,
          12,
          0,
          4,
          2,
          17,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE
        };

    checkGraph(mssp, hasPathTo, distTo);
  }

  @Test
  public void testSource04() {
    MultipleSourceShortestPath mssp = new MultipleSourceShortestPath(graph, new int[] {0, 4});

    boolean[] hasPathTo =
        new boolean[] {
          true, true, true, false, true, true, true, false, false, false, false, false
        };

    double[] distTo =
        new double[] {
          0,
          14,
          12,
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

    checkGraph(mssp, hasPathTo, distTo);
  }

  @Test
  public void testSource05() {
    MultipleSourceShortestPath mssp = new MultipleSourceShortestPath(graph, new int[] {0, 5});

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
          0,
          20,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
        };

    checkGraph(mssp, hasPathTo, distTo);
  }

  @Test
  public void testSource06() {
    MultipleSourceShortestPath mssp = new MultipleSourceShortestPath(graph, new int[] {0, 6});

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
          0,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
        };

    checkGraph(mssp, hasPathTo, distTo);
  }

  @Test
  public void testSource07() {
    MultipleSourceShortestPath mssp = new MultipleSourceShortestPath(graph, new int[] {0, 7});

    boolean[] hasPathTo =
        new boolean[] {true, true, true, false, false, true, true, true, true, false, false, false};

    double[] distTo =
        new double[] {
          0,
          14,
          12,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          8,
          20,
          0,
          17,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
        };

    checkGraph(mssp, hasPathTo, distTo);
  }

  @Test
  public void testSource08() {
    MultipleSourceShortestPath mssp = new MultipleSourceShortestPath(graph, new int[] {0, 8});

    boolean[] hasPathTo =
        new boolean[] {
          true, true, true, false, false, true, true, false, true, false, false, false
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
          0,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
          Float.MAX_VALUE,
        };

    checkGraph(mssp, hasPathTo, distTo);
  }

  @Test
  public void testSource09() {
    MultipleSourceShortestPath mssp = new MultipleSourceShortestPath(graph, new int[] {0, 9});

    boolean[] hasPathTo =
        new boolean[] {true, true, true, false, false, true, true, false, false, true, true, true};

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
          0,
          19,
          11,
        };

    checkGraph(mssp, hasPathTo, distTo);
  }

  @Test
  public void testSource010() {
    MultipleSourceShortestPath mssp = new MultipleSourceShortestPath(graph, new int[] {0, 10});

    boolean[] hasPathTo =
        new boolean[] {
          true, true, true, false, false, true, true, false, false, false, true, false
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
          0,
          Float.MAX_VALUE,
        };

    checkGraph(mssp, hasPathTo, distTo);
  }

  @Test
  public void testSource011() {
    MultipleSourceShortestPath mssp = new MultipleSourceShortestPath(graph, new int[] {0, 11});

    boolean[] hasPathTo =
        new boolean[] {
          true, true, true, false, false, true, true, false, false, false, false, true
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
          0,
        };

    checkGraph(mssp, hasPathTo, distTo);
  }
}
