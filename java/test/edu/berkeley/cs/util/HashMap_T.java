package edu.berkeley.cs.util;

import java.util.Iterator;
import java.util.Random;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashMap_T {
  private HashMap<Integer, Integer> map;

  @Before
  public void setup() {
    map = new HashMap<>();
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

    Assert.assertEquals(1, map.size());
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
  public void testPutSize() {
    Random random = new Random();

    for (int i = 0; i < 10; i++) {
      map.put(random.nextInt(), random.nextInt());
      Assert.assertEquals(i + 1, map.size());
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
    Assert.assertEquals(Integer.valueOf(value), map.get(key));
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

    Assert.assertFalse(map.contains(key));
    Assert.assertNull(map.get(key));
  }

  @Test
  public void testIterator() {
    Random random = new Random();

    HashMap<Integer, Integer>.Entry[] entries = new HashMap.Entry[10];
    for (int i = 0; i < entries.length; i++) {
      int key = random.nextInt();
      int value = random.nextInt();
      entries[i] = map.new Entry(key, value);
      map.put(key, value);
    }

    Iterator<HashMap<Integer, Integer>.Entry> itr = map.iterator();
    for (int i = 0; i < map.size(); i++) {
      Assert.assertTrue(itr.hasNext());
      HashMap<Integer, Integer>.Entry entry = itr.next();

      boolean found = false;
      for (HashMap<Integer, Integer>.Entry element : entries) {
        if (element.key().equals(entry.key()) && element.value().equals(entry.value())) {
          found = true;
          break;
        }
      }

      Assert.assertTrue(found);
    }

    Assert.assertFalse(itr.hasNext());
  }

  @Test
  public void testResizeLimits() {
    int capacity = map.table.length;
    for (int i = 0; i < capacity * 8 - 1; i++) {
      map.put(i, i);
    }

    Assert.assertEquals(capacity, map.table.length);
    map.put(-1, -1);
    Assert.assertEquals(capacity * 2, map.table.length);

    capacity = map.table.length;
    for (int key : map.keys()) {
      if ((map.size() - 1) / (float) capacity <= 2) {
        break;
      }

      map.delete(key);
    }

    Assert.assertEquals(capacity, map.table.length);
    map.delete(map.keys().front());
    Assert.assertEquals(capacity / 2, map.table.length);
    Assert.assertNotEquals(0, map.table.length);
  }

  @Test
  public void testResizeDoubleOnNewElementOnly() {
    int capacity = map.table.length;
    for (int i = 0; i < capacity * 8 + 1; i++) {
      map.put(1, 1);
    }

    Assert.assertEquals(capacity, map.table.length);
  }

  @Test
  public void testItemsSearchableAfterResize() {
    int capacity = map.table.length;
    for (int i = 0; i < capacity * 8; i++) {
      map.put(i, i);
    }

    Assert.assertEquals(capacity * 2, map.table.length);

    for (int i = 0; i < map.size(); i++) {
      Assert.assertEquals(Integer.valueOf(i), map.get(i));
    }
  }
}
