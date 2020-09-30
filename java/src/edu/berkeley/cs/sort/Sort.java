package edu.berkeley.cs.sort;

public abstract class Sort<T extends Comparable<T>> {
  private int swaps = 0;
  private int compares = 0;
  protected final int cutoff = 5;

  /** The sort method that all sorting algorithms must implement */
  public abstract void sort(T[] input);

  public int swaps() {
    return swaps;
  }

  public int compares() {
    return compares;
  }

  /**
   * Use this method instead of implementing your own in order to make the tests happy.
   *
   * @return true if v is less than w
   */
  protected boolean less(T v, T w) {
    compares++;
    return v.compareTo(w) < 0;
  }

  /**
   * Swap index i with index j in the input array. Use this method instead of implementing your own
   * in order to make the tests happy.
   */
  protected void swap(T[] input, int i, int j) {
    swaps++;
    T t = input[i];
    input[i] = input[j];
    input[j] = t;
  }
}
