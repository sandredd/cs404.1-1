package edu.berkeley.cs.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SummableTree_T {
  private SummableTree tree;

  @Before
  public void setup() {
    tree = new SummableTree();
  }

  @Test
  public void testNullRoot() {
    Assert.assertFalse(tree.hasPathSum(0));
  }

  @Test
  public void testRootAlone() {
    tree.put(4, true);
    Assert.assertTrue(tree.hasPathSum(4));
  }

  @Test
  public void testLeftChildren() {
    int[] elements = new int[] {4, 2, 1};
    for (int element : elements) {
      tree.put(element, true);
    }

    Assert.assertTrue(tree.hasPathSum(7));
  }

  @Test
  public void testRightChildren() {
    int[] elements = new int[] {4, 6, 7};
    for (int element : elements) {
      tree.put(element, true);
    }

    Assert.assertTrue(tree.hasPathSum(17));
  }

  @Test
  public void testLeafNodesOnly() {
    int[] elements = new int[] {4, 2, 6, 5};
    for (int element : elements) {
      tree.put(element, true);
    }

    Assert.assertTrue(tree.hasPathSum(6));
    Assert.assertFalse(tree.hasPathSum(10));
    Assert.assertTrue(tree.hasPathSum(15));
  }

  @Test
  public void testCompleteTree() {
    int[] elements = new int[] {4, 2, 6, 1, 3, 5, 7};
    for (int element : elements) {
      tree.put(element, true);
    }

    Assert.assertTrue(tree.hasPathSum(7));
    Assert.assertTrue(tree.hasPathSum(9));
    Assert.assertTrue(tree.hasPathSum(15));
    Assert.assertTrue(tree.hasPathSum(17));
  }

  @Test
  public void testNegativeKeys() {
    int[] elements = new int[] {0, -2, 2, -3, -1, 1, 3};
    for (int element : elements) {
      tree.put(element, true);
    }

    Assert.assertTrue(tree.hasPathSum(-5));
    Assert.assertTrue(tree.hasPathSum(-3));
    Assert.assertTrue(tree.hasPathSum(3));
    Assert.assertTrue(tree.hasPathSum(5));
  }

  @Test
  public void testRange() {
    int[] elements = new int[] {0, 1, 2};
    for (int element : elements) {
      tree.put(element, true);
    }

    Assert.assertTrue(tree.hasPathSum(3));

    for (int i = 0; i < 10; i++) {
      if (i == 3) {
        continue;
      }

      Assert.assertFalse(tree.hasPathSum(i));
    }
  }
}