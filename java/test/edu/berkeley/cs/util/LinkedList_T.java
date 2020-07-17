package edu.berkeley.cs.util;

import java.util.Iterator;
import java.util.Objects;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedList_T {
  private static class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
      if (obj == null) {
        return false;
      }
      if (!(obj instanceof Point)) {
        return false;
      }
      return (x == ((Point) obj).x && y == ((Point) obj).y);
    }

    @Override
    public int hashCode() {
      return Objects.hash(x, y);
    }
  }

  private LinkedList<Integer> list;

  @Before
  public void setup() {
    list = new LinkedList<>();
  }

  @Test
  public void testIsEmpty() {
    Assert.assertTrue(list.isEmpty());
    list.insertFront(0);
    Assert.assertFalse(list.isEmpty());
  }

  @Test
  public void testEmptyList() {
    Assert.assertEquals(0, list.size());

    Assert.assertNull(list.front());
    Assert.assertNull(list.back());

    Assert.assertNull(list.removeFront());
    Assert.assertNull(list.removeEnd());
  }

  @Test
  public void testInsertFront() {
    list.insertFront(0);
    list.insertFront(1);

    Assert.assertEquals(2, list.size());

    Assert.assertEquals(Integer.valueOf(1), list.front());
    Assert.assertEquals(Integer.valueOf(0), list.back());

    list.insertFront(2);
    Assert.assertEquals(3, list.size());

    Assert.assertEquals(Integer.valueOf(2), list.front());
    Assert.assertEquals(Integer.valueOf(0), list.back());
  }

  @Test
  public void testInsertEnd() {
    list.insertEnd(0);
    list.insertEnd(1);

    Assert.assertEquals(2, list.size());

    Assert.assertEquals(Integer.valueOf(0), list.front());
    Assert.assertEquals(Integer.valueOf(1), list.back());

    list.insertEnd(2);
    Assert.assertEquals(3, list.size());

    Assert.assertEquals(Integer.valueOf(0), list.front());
    Assert.assertEquals(Integer.valueOf(2), list.back());
  }

  @Test
  public void testRemoveFront() {
    Assert.assertNull(list.removeFront());

    list.insertEnd(0);
    list.insertEnd(1);
    list.insertEnd(2);

    Assert.assertEquals(Integer.valueOf(0), list.removeFront());
    Assert.assertEquals(2, list.size());
    Assert.assertEquals(Integer.valueOf(1), list.front());

    Assert.assertEquals(Integer.valueOf(1), list.removeFront());
    Assert.assertEquals(1, list.size());
    Assert.assertEquals(Integer.valueOf(2), list.front());

    Assert.assertEquals(Integer.valueOf(2), list.removeFront());
    Assert.assertEquals(0, list.size());
    Assert.assertNull(list.front());
  }

  @Test
  public void testRemoveEnd() {
    Assert.assertNull(list.removeEnd());

    list.insertEnd(0);
    list.insertEnd(1);
    list.insertEnd(2);

    Assert.assertEquals(Integer.valueOf(2), list.removeEnd());
    Assert.assertEquals(2, list.size());
    Assert.assertEquals(Integer.valueOf(0), list.front());

    Assert.assertEquals(Integer.valueOf(1), list.removeEnd());
    Assert.assertEquals(1, list.size());
    Assert.assertEquals(Integer.valueOf(0), list.front());

    Assert.assertEquals(Integer.valueOf(0), list.removeEnd());
    Assert.assertEquals(0, list.size());
    Assert.assertNull(list.front());
  }

  @Test
  public void testRemoveNotFound() {
    list.insertEnd(0);

    Assert.assertFalse(list.remove(1));
    Assert.assertEquals(1, list.size());

    Assert.assertEquals(Integer.valueOf(0), list.front());
    Assert.assertEquals(Integer.valueOf(0), list.back());
  }

  @Test
  public void testRemoveOnlyElement() {
    list.insertEnd(0);

    Assert.assertTrue(list.remove(0));
    Assert.assertEquals(0, list.size());

    Assert.assertNull(list.front());
    Assert.assertNull(list.back());
  }

  @Test
  public void testRemoveFirstElement() {
    list.insertEnd(0);
    list.insertEnd(1);

    Assert.assertTrue(list.remove(0));
    Assert.assertEquals(1, list.size());

    Assert.assertEquals(Integer.valueOf(1), list.front());
    Assert.assertEquals(Integer.valueOf(1), list.back());
  }

  @Test
  public void testRemoveLastElement() {
    list.insertEnd(0);
    list.insertEnd(1);

    Assert.assertTrue(list.remove(1));
    Assert.assertEquals(1, list.size());

    Assert.assertEquals(Integer.valueOf(0), list.front());
    Assert.assertEquals(Integer.valueOf(0), list.back());
  }

  @Test
  public void testRemoveMiddleElement() {
    list.insertEnd(0);
    list.insertEnd(1);
    list.insertEnd(2);

    Assert.assertTrue(list.remove(1));
    Assert.assertEquals(2, list.size());

    Assert.assertEquals(Integer.valueOf(0), list.front());
    Assert.assertEquals(Integer.valueOf(2), list.back());
  }

  @Test
  public void testRemoveFirstOccurrence() {
    list.insertEnd(0);
    list.insertEnd(1);
    list.insertEnd(0);

    Assert.assertTrue(list.remove(0));
    Assert.assertEquals(2, list.size());

    Assert.assertEquals(Integer.valueOf(1), list.front());
    Assert.assertEquals(Integer.valueOf(0), list.back());
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
  public void testIterator() {
    list.insertEnd(0);
    list.insertEnd(1);
    list.insertEnd(2);

    Iterator<Integer> itr = list.iterator();
    for (int i = 0; i < list.size(); i++) {
      Assert.assertTrue(itr.hasNext());
      Assert.assertEquals(Integer.valueOf(i), itr.next());
    }

    Assert.assertFalse(itr.hasNext());
  }

  @Test
  public void testObjectContains() {
    int size = 10;
    LinkedList<Point> pointList = new LinkedList<>();
    Assert.assertEquals(0, pointList.size());
    for (int i = 0; i < size; i++) {
      Point point = new Point(i, i);
      pointList.insertEnd(point);
    }

    Assert.assertEquals(size, pointList.size());

    for (int i = 0; i < size; i++) {
      Point point = new Point(i, i);
      Assert.assertTrue(pointList.contains(point));
    }

    Point point = new Point(11, 11);
    Assert.assertFalse(pointList.contains(point));
  }

  @Test
  public void testRemoveFirstObjectOccurrence() {
    LinkedList<Point> pointList = new LinkedList<>();
    Point point0 = new Point(0, 0);
    Point point1 = new Point(1, 1);
    pointList.insertEnd(point0);
    pointList.insertEnd(point1);
    pointList.insertEnd(point0);

    Point point3 = new Point(0, 0);
    Assert.assertTrue(pointList.remove(point3));
    Assert.assertEquals(2, pointList.size());

    Assert.assertEquals(point1, pointList.front());
    Assert.assertEquals(point0, pointList.back());
  }
}
