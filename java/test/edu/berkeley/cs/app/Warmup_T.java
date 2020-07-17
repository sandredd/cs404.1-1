package edu.berkeley.cs.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Warmup_T {
  private Warmup warmup;

  @Before
  public void setup() {
    warmup = new Warmup();
  }

  @Test
  public void testRunningSumSingleElement() {
    Assert.assertArrayEquals(new int[] {1}, warmup.runningSum(new int[] {1}));
  }

  @Test
  public void testRunningSumAllSame() {
    Assert.assertArrayEquals(new int[] {1, 2, 3}, warmup.runningSum(new int[] {1, 1, 1}));
  }

  @Test
  public void testRunningSum() {
    Assert.assertArrayEquals(new int[] {1, 3, 6, 10}, warmup.runningSum(new int[] {1, 2, 3, 4}));
  }

  @Test
  public void testNumSmallerSingleElement() {
    Assert.assertArrayEquals(new int[] {0}, warmup.numSmaller(new int[] {1}));
  }

  @Test
  public void testNumSmallerAllSame() {
    Assert.assertArrayEquals(new int[] {0, 0, 0}, warmup.numSmaller(new int[] {1, 1, 1}));
  }

  @Test
  public void testNumSmallerZeroes() {
    Assert.assertArrayEquals(new int[] {2, 1, 0}, warmup.numSmaller(new int[] {4, 1, 0}));
  }

  @Test
  public void testNumSmaller() {
    Assert.assertArrayEquals(
        new int[] {4, 0, 1, 1, 3}, warmup.numSmaller(new int[] {8, 1, 2, 2, 3}));
  }

  @Test
  public void testSimpleCompressSingleElement() {
    Assert.assertEquals("a", warmup.simpleCompress("a"));
  }

  @Test
  public void testSimpleCompressNonConsecutive() {
    Assert.assertEquals("aba", warmup.simpleCompress("aba"));
  }

  @Test
  public void testSimpleCompressNoRepetition() {
    Assert.assertEquals("abcdef", warmup.simpleCompress("abcdef"));
  }

  @Test
  public void testSimpleCompress() {
    Assert.assertEquals("a2b3cd2ed2f", warmup.simpleCompress("aabbbcddeddf"));
  }

  @Test
  public void testSimpleCompressTrailing() {
    Assert.assertEquals("a2b3cd2ed2f4", warmup.simpleCompress("aabbbcddeddffff"));
  }
}
