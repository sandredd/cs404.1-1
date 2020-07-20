package edu.berkeley.cs.util;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
  protected class ListNode<T> {
    ListNode<T> prev;
    ListNode<T> next;
    T value;

    ListNode(T value) {
      this.value = value;
    }
  }

  protected ListNode<T> head;
  protected ListNode<T> tail;
  private int size = 0;

  /** @param value The element to add at the beginning of this container */
  public void insertFront(T value) {
    // TODO: complete this function
  }

  /** @param value The element to add to the end of this container */
  public void insertEnd(T value) {
    // TODO: complete this function
  }

  /** @return The first element of the container, null if the container was empty */
  public T removeFront() {
    // TODO: complete this function
    return null;
  }

  /** @return The last element of the container, null if the container was empty */
  public T removeEnd() {
    // TODO: complete this function
    return null;
  }

  /**
   * Remove the first occurrence of a given value.
   *
   * @param value The value to remove
   * @return true if the value was removed successfully, false otherwise
   */
  public boolean remove(T value) {
    // TODO: complete this function
    return false;
  }

  /** @return the first element of the container, null if the container was empty */
  public T front() {
    // TODO: complete this function
    return null;
  }

  /** @return the last element of the container, null if the container was empty */
  public T back() {
    // TODO: complete this function
    return null;
  }

  /**
   * @param value The element whose presence in this container is to be tested
   * @return true if this container contains the specified element
   */
  public boolean contains(T value) {
    // TODO: complete this function
    return false;
  }

  /** @return the number of elements in this container */
  public int size() {
    // TODO: complete this function
    return 0;
  }

  /** @return true if this container contains no elements */
  public boolean isEmpty() {
    // TODO: complete this function
    return false;
  }

  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {
      ListNode<T> current = head;

      @Override
      public boolean hasNext() {
        return current != null;
      }

      @Override
      public T next() {
        T value = current.value;
        current = current.next;
        return value;
      }
    };
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append('[');
    boolean added = false;
    for (T key : this) {
      if (added) {
        sb.append(", ");
      }

      sb.append(key);
      added = true;
    }

    sb.append(']');
    return sb.toString();
  }
}
