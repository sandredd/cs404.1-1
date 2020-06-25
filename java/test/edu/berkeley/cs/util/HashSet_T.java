package edu.berkeley.cs.util;

import java.util.Random;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashSet_T {
  private HashSet<Integer> set;

  @Before
  public void setup() {
    set = new HashSet<>();
  }

  @Test
  public void testClear() {
    set.add(1);

    Assert.assertEquals(1, set.size());
    Assert.assertFalse(set.isEmpty());

    set.clear();

    Assert.assertEquals(0, set.size());
    Assert.assertTrue(set.isEmpty());
    Assert.assertFalse(set.contains(1));
  }

  @Test
  public void testSizeIsEmpty() {
    Assert.assertTrue(set.isEmpty());
    Assert.assertEquals(0, set.size());

    set.add(1);

    Assert.assertEquals(1, set.size());
    Assert.assertFalse(set.isEmpty());
  }

  @Test
  public void testContains() {
    Assert.assertFalse(set.contains(1));
    set.add(1);
    Assert.assertTrue(set.contains(1));
  }

  @Test
  public void testAddSize() {
    Random random = new Random();

    for (int i = 0; i < 10; i++) {
      set.add(random.nextInt());
      Assert.assertEquals(i + 1, set.size());
    }
  }

  @Test
  public void testAddDuplicateNoSizeIncrease() {
    Assert.assertEquals(0, set.size());
    set.add(1);
    set.add(1);
    Assert.assertEquals(1, set.size());
  }

  @Test
  public void testDelete() {
    Random random = new Random();

    int[] keys = new int[10];
    for (int i = 0; i < keys.length; i++) {
      keys[i] = random.nextInt();
      set.add(keys[i]);
    }

    int index = random.nextInt(keys.length);
    int key = keys[index];
    set.delete(key);

    Assert.assertFalse(set.contains(key));
  }
}
