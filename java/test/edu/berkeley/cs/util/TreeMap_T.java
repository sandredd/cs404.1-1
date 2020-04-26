package edu.berkeley.cs.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeMap_T {
  private TreeMap<Integer, Integer> map;

  @Before
  public void setup() {
    map = new TreeMap<>();
  }

  @Test
  public void testClear() {
    map.put(1, 2);

    Assert.assertEquals(1, map.size());
    Assert.assertFalse(map.isEmpty());

    map.clear();

    Assert.assertEquals(0, map.size());
    Assert.assertTrue(map.isEmpty());
    Assert.assertFalse(map.contains(1));
    Assert.assertNull(map.get(1));
  }

  @Test
  public void testSizeIsEmpty() {
    Assert.assertTrue(map.isEmpty());
    Assert.assertEquals(0, map.size());

    map.put(1, 2);
    map.put(2, 3);

    Assert.assertEquals(2, map.size());
    Assert.assertFalse(map.isEmpty());
  }

  @Test
  public void testContains() {
    Assert.assertFalse(map.contains(1));
    map.put(1, 2);
    Assert.assertTrue(map.contains(1));
  }

  @Test
  public void testGetNonexistent() {
    Assert.assertNull(map.get(1));
  }

  @Test
  public void testPut() {
    Random random = new Random();

    for (int i = 0; i < 10; i++) {
      map.put(random.nextInt(), random.nextInt());
      Assert.assertTrue(map.isBST());
    }
  }

  @Test
  public void testGet() {
    Random random = new Random();

    int[] keys = new int[10];
    int[] values = new int[keys.length];
    for (int i = 0; i < keys.length; i++) {
      keys[i] = random.nextInt();
      values[i] = random.nextInt();
      map.put(keys[i], values[i]);
    }

    for (int i = 0; i < keys.length; i++) {
      Assert.assertEquals(Integer.valueOf(values[i]), map.get(keys[i]));
    }
  }

  @Test
  public void testPutDuplicateOverwrite() {
    Random random = new Random();

    int key = random.nextInt();
    int value = random.nextInt();
    map.put(key, value);

    for (int i = 0; i < 10; i++) {
      map.put(random.nextInt(), random.nextInt());
    }

    Assert.assertEquals(Integer.valueOf(value), map.get(key));

    value = random.nextInt();
    map.put(key, value);
    Assert.assertTrue(map.isBST());
    Assert.assertEquals(Integer.valueOf(value), map.get(key));
  }

  @Test
  public void testDeleteMin() {
    Random random = new Random();

    int minimum = Integer.MAX_VALUE;
    for (int i = 0; i < 10; i++) {
      int r = random.nextInt();
      map.put(r, random.nextInt());

      if (r < minimum) {
        minimum = r;
      }
    }

    Assert.assertTrue(map.contains(minimum));
    Assert.assertEquals(Integer.valueOf(minimum), map.min());

    map.deleteMin();

    Assert.assertTrue(map.isBST());
    Assert.assertFalse(map.contains(minimum));
    Assert.assertNotEquals(Integer.valueOf(minimum), map.min());
  }

  @Test
  public void testDeleteMax() {
    Random random = new Random();

    int maximum = Integer.MIN_VALUE;
    for (int i = 0; i < 10; i++) {
      int r = random.nextInt();
      map.put(r, random.nextInt());

      if (r > maximum) {
        maximum = r;
      }
    }

    Assert.assertTrue(map.contains(maximum));
    Assert.assertEquals(Integer.valueOf(maximum), map.max());

    map.deleteMax();

    Assert.assertTrue(map.isBST());
    Assert.assertFalse(map.contains(maximum));
    Assert.assertNotEquals(Integer.valueOf(maximum), map.max());
  }

  @Test
  public void testDelete() {
    Random random = new Random();

    int[] keys = new int[10];
    for (int i = 0; i < keys.length; i++) {
      keys[i] = random.nextInt();
      map.put(keys[i], random.nextInt());
    }

    int index = random.nextInt(keys.length);
    int key = keys[index];
    map.delete(key);

    Assert.assertTrue(map.isBST());
    Assert.assertFalse(map.contains(key));
    Assert.assertNull(map.get(key));
  }

  @Test
  public void testDeleteSingleton() {
    Random random = new Random();

    int key = random.nextInt();

    // test deleteMin on a single node tree
    map.put(key, random.nextInt());
    Assert.assertTrue(map.contains(key));
    Assert.assertEquals(Integer.valueOf(key), map.min());

    map.deleteMin();

    Assert.assertTrue(map.isEmpty());
    Assert.assertTrue(map.isBST());
    Assert.assertFalse(map.contains(key));

    // test deleteMax on a single node tree
    map.put(key, random.nextInt());
    Assert.assertTrue(map.contains(key));
    Assert.assertEquals(Integer.valueOf(key), map.max());

    map.deleteMax();

    Assert.assertTrue(map.isEmpty());
    Assert.assertTrue(map.isBST());
    Assert.assertFalse(map.contains(key));

    // test delete on a single node tree
    map.put(key, random.nextInt());
    Assert.assertTrue(map.contains(key));

    map.delete(key);

    Assert.assertTrue(map.isBST());
    Assert.assertFalse(map.contains(key));
    Assert.assertNull(map.get(key));
  }

  @Test
  public void testIterator() {
    Random random = new Random();

    int[] keys = new int[10];
    for (int i = 0; i < keys.length; i++) {
      keys[i] = random.nextInt();
      map.put(keys[i], random.nextInt());
    }

    Arrays.sort(keys);
    Iterator<Integer> itr = map.iterator();
    for (int i = 0; i < map.size(); i++) {
      Assert.assertTrue(itr.hasNext());
      Assert.assertTrue(Arrays.binarySearch(keys, itr.next()) >= 0);
    }

    Assert.assertFalse(itr.hasNext());
  }
}
