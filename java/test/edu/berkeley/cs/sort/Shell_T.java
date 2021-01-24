package edu.berkeley.cs.sort;

import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Shell_T {
  private int n = 1000;

  @Test
  public void testShellSort() {
    Shell<Integer> shell = new Shell<>();

    Integer[] actual = Utilities.generateRandomArray(n);
    Integer[] expected = Arrays.copyOf(actual, actual.length);

    Arrays.sort(expected);
    shell.sort(actual);

    Assert.assertArrayEquals(expected, actual);
    Assert.assertTrue(shell.compares() < 16000);
    Assert.assertTrue(shell.swaps() < 11000);
  }
}
