package edu.berkeley.cs.graph;

import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StronglyConnectedComponents_T {
  private DirectedGraph graph = Utilities.smallComponentGraph();
  private StronglyConnectedComponents scc;

  @Before
  public void setup() {
    scc = new StronglyConnectedComponents(graph);
  }

  @Test
  public void testCount() {
    Assert.assertEquals(5, scc.count());
  }

  @Test
  public void testConnectedIds() {
    int[] ids = new int[] {1, 0, 1, 1, 1, 1, 3, 4, 3, 2, 2, 2, 2};
    for (int i = 0; i < graph.numVertices(); i++) {
      Assert.assertEquals(ids[i], scc.id(i));
    }
  }

  private void checkStrongComponent(int v, int[] component) {
    for (int i = 0; i < component.length; i++) {
      Assert.assertTrue(scc.stronglyConnected(v, component[i]));
    }
  }

  @Test
  public void testStronglyConnected() {
    int[] scc0 = new int[] {0, 2, 3, 4, 5};
    int[] scc1 = new int[] {1};
    int[] scc2 = scc0;
    int[] scc3 = scc0;
    int[] scc4 = scc0;
    int[] scc5 = scc0;
    int[] scc6 = new int[] {6, 8};
    int[] scc7 = new int[] {7};
    int[] scc8 = scc6;
    int[] scc9 = new int[] {9, 10, 11, 12};
    int[] scc10 = scc9;
    int[] scc11 = scc9;
    int[] scc12 = scc9;

    checkStrongComponent(0, scc0);
    checkStrongComponent(1, scc1);
    checkStrongComponent(2, scc2);
    checkStrongComponent(3, scc3);
    checkStrongComponent(4, scc4);
    checkStrongComponent(5, scc5);
    checkStrongComponent(6, scc6);
    checkStrongComponent(7, scc7);
    checkStrongComponent(8, scc8);
    checkStrongComponent(9, scc9);
    checkStrongComponent(10, scc10);
    checkStrongComponent(11, scc11);
    checkStrongComponent(12, scc12);
  }
}
