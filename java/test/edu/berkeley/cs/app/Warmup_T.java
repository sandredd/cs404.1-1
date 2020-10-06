package edu.berkeley.cs.app;

import org.junit.Assert;
import org.junit.Test;

public class Warmup_T {
  @Test
  public void testRunningSumSingleElement() {
    Assert.assertArrayEquals(new int[] {1}, Warmup.runningSum(new int[] {1}));
  }

  @Test
  public void testRunningSumAllSame() {
    Assert.assertArrayEquals(new int[] {1, 2, 3}, Warmup.runningSum(new int[] {1, 1, 1}));
  }

  @Test
  public void testRunningSum() {
    Assert.assertArrayEquals(new int[] {1, 3, 6, 10}, Warmup.runningSum(new int[] {1, 2, 3, 4}));
  }

  @Test
  public void testNumSmallerSingleElement() {
    Assert.assertArrayEquals(new int[] {0}, Warmup.numSmaller(new int[] {1}));
  }

  @Test
  public void testNumSmallerAllSame() {
    Assert.assertArrayEquals(new int[] {0, 0, 0}, Warmup.numSmaller(new int[] {1, 1, 1}));
  }

  @Test
  public void testNumSmallerZeroes() {
    Assert.assertArrayEquals(new int[] {2, 1, 0}, Warmup.numSmaller(new int[] {4, 1, 0}));
  }

  @Test
  public void testNumSmaller() {
    Assert.assertArrayEquals(
        new int[] {4, 0, 1, 1, 3}, Warmup.numSmaller(new int[] {8, 1, 2, 2, 3}));
  }

  @Test
  public void testSimpleCompressSingleElement() {
    Assert.assertEquals("a", Warmup.simpleCompress("a"));
  }

  @Test
  public void testSimpleCompressNonConsecutive() {
    Assert.assertEquals("aba", Warmup.simpleCompress("aba"));
  }

  @Test
  public void testSimpleCompressNoRepetition() {
    Assert.assertEquals("abcdef", Warmup.simpleCompress("abcdef"));
  }

  @Test
  public void testSimpleCompress() {
    Assert.assertEquals("a2b3cd2ed2f", Warmup.simpleCompress("aabbbcddeddf"));
  }

  @Test
  public void testSimpleCompressTrailing() {
    Assert.assertEquals("a2b3cd2ed2f4", Warmup.simpleCompress("aabbbcddeddffff"));
  }
}
