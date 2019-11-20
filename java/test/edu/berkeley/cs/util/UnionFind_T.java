package edu.berkeley.cs.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnionFind_T {
  private final int initialCount = 10;
  private UnionFind uf;

  @Before
  public void setup() {
    uf = new UnionFind(initialCount);
  }

  @Test
  public void testTransitivity() {
    uf.union(0, 1);
    uf.union(2, 1);

    Assert.assertTrue(uf.connected(0, 2));
    Assert.assertEquals(uf.find(0), uf.find(2));

    for (int i = 3; i < initialCount; i++) {
      Assert.assertFalse(uf.connected(0, i));
    }
  }

  @Test
  public void testComponentCount() {
    for (int i = 1; i < initialCount; i++) {
      uf.union(i - 1, i);
      Assert.assertEquals(initialCount - i, uf.count());
    }

    for (int i = 0; i < initialCount; i++) {
      for (int j = i; j < initialCount; j++) {
        Assert.assertTrue(uf.connected(i, j));
      }
    }
  }
}
