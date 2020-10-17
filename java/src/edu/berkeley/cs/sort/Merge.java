package edu.berkeley.cs.sort;

import edu.berkeley.cs.util.LinkedList;

public class Merge<T extends Comparable<T>> extends Sort<T> {
  protected Insertion<T> insertion = new Insertion<>();

  /**
   * Sort the given array using mergesort. Use the insertion member variable when breaking off to
   * insertion sort in order to make the tests happy.
   */
  @Override
  public void sort(T[] input) {
    // TODO: complete this function
  }

  /** Sort the given linked list using mergesort */
  public LinkedList<T> sort(LinkedList<T> input) {
    // TODO: complete this function
    return null;
  }
}
