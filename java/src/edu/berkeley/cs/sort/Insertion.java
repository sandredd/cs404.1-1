package edu.berkeley.cs.sort;

public class Insertion<T extends Comparable<T>> extends Sort<T> {
  @Override
  public void sort(T[] input) {
    sort(input, 0, input.length - 1);
  }

  /** Sort the given range (low, high) of the input array using insertion sort */
  public void sort(T[] input, int low, int high) {
    // TODO: complete this function
  }
}
