package edu.berkeley.cs.util;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RadixTrieMap_T {
  private RadixTrieMap<Boolean> map;

  @Before
  public void setup() {
    map = new RadixTrieMap<>();
  }

  @Test
  public void testClear() {
    map.put("go", true);

    Assert.assertEquals(1, map.size());
    Assert.assertFalse(map.isEmpty());

    map.clear();

    Assert.assertEquals(0, map.size());
    Assert.assertTrue(map.isEmpty());
    Assert.assertFalse(map.contains("go"));
  }

  @Test
  public void testSizeIsEmpty() {
    Assert.assertTrue(map.isEmpty());
    Assert.assertEquals(0, map.size());

    map.put("go", false);
    map.put("gone", true);

    Assert.assertEquals(2, map.size());
    Assert.assertFalse(map.isEmpty());
  }

  @Test
  public void testContains() {
    map.put("go", true);
    map.put("going", true);

    Assert.assertTrue(map.contains("go"));
    Assert.assertTrue(map.contains("going"));

    Assert.assertFalse(map.contains("gotten"));
    map.put("gotten", true);
    Assert.assertTrue(map.contains("gotten"));
  }

  @Test
  public void testGetNonexistant() {
    Assert.assertNull(map.get("gone"));

    map.put("gone", true);
    Assert.assertNull(map.get("go"));
    Assert.assertNotNull(map.get("gone"));
  }

  @Test
  public void testPutDuplicateOverwrite() {
    map.put("go", true);
    map.put("gone", true);
    Assert.assertTrue(map.get("go"));
    Assert.assertTrue(map.get("gone"));

    map.put("go", false);
    Assert.assertFalse(map.get("go"));
    Assert.assertTrue(map.get("gone"));
  }

  @Test
  public void testStartsWith() {
    map.put("go", true);
    map.put("going", true);
    map.put("gone", true);
    map.put("gong", true);
    map.put("gonna", true);
    map.put("gown", true);

    HashSet<String> words = new HashSet<>();
    for (String word : map.startsWith("gon")) {
      words.add(word);
    }

    Assert.assertEquals(3, words.size());
    Assert.assertTrue(words.contains("gone"));
    Assert.assertTrue(words.contains("gong"));
    Assert.assertTrue(words.contains("gonna"));
  }

  @Test
  public void testSorted() {
    map.put("go", true);
    map.put("going", true);
    map.put("gone", true);
    map.put("house", true);
    map.put("ephemeris", true);
    map.put("eikons", true);
    map.put("nail", true);
    map.put("sick", true);
    map.put("sikkimese", true);
    map.put("marylanders", true);
    map.put("unparasitically", true);
    map.put("unbuttressed", true);
    map.put("solemnest", true);
    map.put("escalades", true);
    map.put("devoration", true);
    map.put("weight", true);
    map.put("vice", true);
    map.put("begotten", true);
    map.put("pugil", true);
    map.put("assurgent", true);
    map.put("podsnappery", true);
    map.put("poet", true);
    map.put("dramatist", true);
    map.put("leonese", true);
    map.put("wreathy", true);

    String[] actual = new String[map.size()];
    String[] sorted = new String[map.size()];
    int i = 0;
    for (String word : map.sorted()) {
      actual[i] = word;
      sorted[i] = word;
      i++;
    }

    Arrays.sort(sorted);
    Assert.assertArrayEquals(sorted, actual);
  }
}
