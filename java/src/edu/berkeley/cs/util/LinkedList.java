package edu.berkeley.cs.util;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
  static class ListNode<T> {
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

  /**
   * Inserts the specified element at the beginning of this linked list.
   *
   * @param value The element to add
   */
  public void insertFront(T value) {
    // TODO: complete this function
  }

  /**
   * Appends the specified element to the end of this linked list.
   *
   * @param value The element to add
   */
  public void insertEnd(T value) {
    // TODO: complete this function
  }

  /**
   * Removes the first element of this linked list and returns it.
   *
   * @return The first element of the list, null if the list was empty
   */
  public T removeFront() {
    // TODO: complete this function
    return null;
  }

  /**
   * Removes the last element of this linked list and returns it.
   *
   * @return The last element of the list, null if the list was empty
   */
  public T removeEnd() {
    // TODO: complete this function
    return null;
  }

  /**
   * Remove the specified value form this linked list, if it exists.
   *
   * @param value The value to remove
   * @return true if the value was removed successfully, false otherwise
   */
  public boolean remove(T value) {
    // TODO: complete this function
    return false;
  }

  /**
   * Returns a reference to the first element of the list.
   *
   * @return the first element of the list, null if the list was empty.
   */
  public T front() {
    // TODO: complete this function
    return null;
  }

  /**
   * Returns a reference to the last element of the list.
   *
   * @return the last element of the list, null if the list was empty.
   */
  public T back() {
    // TODO: complete this function
    return null;
  }

  /**
   * Check whether this list contains a specific value.
   *
   * @param value The element whose presence in this list is to be tested
   * @return true if this list contains the specified element
   */
  public boolean contains(T value) {
    // TODO: complete this function
    return false;
  }

  /**
   * Returns the number of elements in this list.
   *
   * @return the number of elements in this list.
   */
  public int size() {
    // TODO: complete this function
    return 0;
  }

  /**
   * Returns true if this list contains no elements.
   *
   * @return true if this list contains no elements.
   */
  public boolean isEmpty() {
    // TODO: complete this function
    return false;
  }
}
