package edu.berkeley.cs.sort;

import edu.berkeley.cs.util.Utilities;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Selection_T {
  private int n = 1000;

  @Test
  public void testSelectionSort() {
    Selection<Integer> selection = new Selection<>();

    Integer[] actual = Utilities.generateRandomArray(n);
    Integer[] expected = Arrays.copyOf(actual, actual.length);

    Arrays.sort(expected);
    selection.sort(actual);

    Assert.assertArrayEquals(expected, actual);
    Assert.assertEquals(499500, selection.compares());
    Assert.assertTrue(selection.swaps() >= 999);
    Assert.assertTrue(selection.swaps() <= 1000);
  }

}
