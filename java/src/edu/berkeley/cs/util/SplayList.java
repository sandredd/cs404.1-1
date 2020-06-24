package edu.berkeley.cs.util;

public class SplayList<T> extends LinkedList<T> {
  /**
   * Check whether this container contains a specific value. If the value is found within the list,
   * the value is moved to the front of the list so that future accesses will be faster.
   *
   * @param value The element whose presence in this container is to be tested
   * @return true if this container contains the specified element
   */
  @Override
  public boolean contains(T value) {
    return false;
  }
}
