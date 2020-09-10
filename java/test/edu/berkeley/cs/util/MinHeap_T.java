package edu.berkeley.cs.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinHeap_T {
  private MinHeap<Integer> heap;

  @Before
  public void setup() {
    heap = new MinHeap<>();
  }

  @Test
  public void testSizeIsEmpty() {
    Assert.assertTrue(heap.isEmpty());
    Assert.assertEquals(0, heap.size());

    for (int i = 0; i < heap.initialCapacity; i++) {
      heap.insert(i);
    }

    Assert.assertEquals(heap.initialCapacity, heap.size());
    Assert.assertFalse(heap.isEmpty());
  }

  @Test(expected = NoSuchElementException.class)
  public void testRemoveMinimumEmptyHeap() {
    Assert.assertNull(heap.removeMinimum());
  }

  @Test(expected = NoSuchElementException.class)
  public void testMinimumEmptyHeap() {
    Assert.assertNull(heap.min());
  }

  @Test(expected = NoSuchElementException.class)
  public void testRemoveSingleEntry() {
    heap.insert(0);
    Assert.assertEquals(1, heap.size());
    Assert.assertEquals(Integer.valueOf(0), heap.removeMinimum());
    Assert.assertEquals(0, heap.size());
    Assert.assertNull(heap.removeMinimum());
  }

  @Test
  public void testSortedRemoval() {
    Random random = new Random();
    int n = 100;
    int[] expected = new int[n];

    for (int i = 0; i < n; i++) {
      int r = random.nextInt();
      heap.insert(r);
      Assert.assertTrue(heap.isMinHeap());
      expected[i] = r;
    }

    int[] actual = new int[n];
    for (int i = 0; i < n; i++) {
      actual[i] = heap.removeMinimum();
      Assert.assertTrue(heap.isMinHeap());
    }

    Arrays.sort(expected);
    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void testIterator() {
    Random random = new Random();
    int[] expected = new int[heap.initialCapacity];

    for (int i = 0; i < heap.initialCapacity; i++) {
      int r = random.nextInt();
      heap.insert(r);
      expected[i] = r;
    }

    Arrays.sort(expected);

    Iterator<Integer> itr = heap.iterator();
    for (int i = 0; i < heap.initialCapacity; i++) {
      int r = itr.next();
      Assert.assertTrue(Arrays.binarySearch(expected, r) >= 0);
    }

    Assert.assertFalse(itr.hasNext());
  }

  @Test
  public void testResize() {
    Random random = new Random();
    for (int i = 0; i < heap.capacity(); i++) {
      heap.insert(random.nextInt());
    }

    Assert.assertEquals(heap.initialCapacity, heap.capacity());
    heap.insert(random.nextInt());
    Assert.assertEquals(2 * heap.initialCapacity, heap.capacity());

    for (int i = 0; i < heap.initialCapacity / 2; i++) {
      heap.removeMinimum();
    }

    Assert.assertEquals(2 * heap.initialCapacity, heap.capacity());
    heap.removeMinimum();
    Assert.assertEquals(heap.initialCapacity, heap.capacity());
  }
}
