package edu.berkeley.cs.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SplayList_T {
  private SplayList<Integer> list;

  @Before
  public void setup() {
    list = new SplayList<>();
  }

  @Test
  public void testBackNoMove() {
    list.insertEnd(0);
    list.insertEnd(1);

    Assert.assertEquals(Integer.valueOf(1), list.back());
    Assert.assertEquals(Integer.valueOf(0), list.front());
  }

  @Test
  public void sizeNoMove() {
    list.insertEnd(0);
    list.insertEnd(1);

    Assert.assertEquals(2, list.size());

    Assert.assertEquals(Integer.valueOf(0), list.front());
    Assert.assertEquals(Integer.valueOf(1), list.back());
  }

  @Test
  public void isEmptyNoMove() {
    list.insertEnd(0);
    list.insertEnd(1);

    Assert.assertFalse(list.isEmpty());

    Assert.assertEquals(Integer.valueOf(0), list.front());
    Assert.assertEquals(Integer.valueOf(1), list.back());
  }

  @Test
  public void testContains() {
    int size = 10;

    Assert.assertEquals(0, list.size());
    for (int i = 0; i < size; i++) {
      list.insertEnd(i);
    }
    Assert.assertEquals(size, list.size());

    Assert.assertFalse(list.contains(size + 1));
    for (int i = 0; i < size; i++) {
      Assert.assertTrue(list.contains(i));
    }
  }

  @Test
  public void testContainsMoveToFrontSingleNode() {
    list.insertEnd(0);

    Assert.assertTrue(list.contains(0));
    Assert.assertEquals(Integer.valueOf(0), list.front());
    Assert.assertEquals(Integer.valueOf(0), list.back());
  }

  @Test
  public void testContainsMoveToFrontFirstNode() {
    list.insertEnd(0);
    list.insertEnd(1);

    Assert.assertTrue(list.contains(0));
    Assert.assertEquals(Integer.valueOf(0), list.front());
    Assert.assertEquals(Integer.valueOf(1), list.back());

    Assert.assertTrue(list.contains(0));
    Assert.assertTrue(list.contains(1));
  }

  @Test
  public void testContainsMoveToFrontLastNode() {
    list.insertEnd(0);
    list.insertEnd(1);

    Assert.assertTrue(list.contains(1));
    Assert.assertEquals(Integer.valueOf(1), list.front());
    Assert.assertEquals(Integer.valueOf(0), list.back());

    Assert.assertTrue(list.contains(0));
    Assert.assertTrue(list.contains(1));
  }

  @Test
  public void testContainsMoveToFrontMiddleNode() {
    list.insertEnd(0);
    list.insertEnd(1);
    list.insertEnd(2);

    Assert.assertTrue(list.contains(1));
    Assert.assertEquals(Integer.valueOf(1), list.front());
    Assert.assertEquals(Integer.valueOf(2), list.back());

    Assert.assertTrue(list.contains(0));
    Assert.assertTrue(list.contains(1));
    Assert.assertTrue(list.contains(2));
  }
}
