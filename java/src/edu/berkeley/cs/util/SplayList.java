package edu.berkeley.cs.util;

public class SplayList<T> extends LinkedList<T> {
  /**
   * Check whether this list contains a specific value. If the value is found within the list, the
   * value is moved to the front of the list so that future accesses will be faster.
   *
   * @param value The element whose presence in this list is to be tested
   * @return true if this list contains the specified element
   */
  @Override
  public boolean contains(T value) {
    return false;
  }
}
