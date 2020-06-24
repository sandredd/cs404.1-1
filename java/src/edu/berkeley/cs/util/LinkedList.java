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

  public void insertFront(T value) {
    // TODO: complete this function
  }

  public void insertEnd(T value) {
    // TODO: complete this function
  }

  public T removeFront() {
    // TODO: complete this function
    return null;
  }

  public T removeEnd() {
    // TODO: complete this function
    return null;
  }

  public boolean remove(T value) {
    // TODO: complete this function
    return false;
  }

  public T front() {
    // TODO: complete this function
    return null;
  }

  public T back() {
    // TODO: complete this function
    return null;
  }

  public boolean contains(T value) {
    // TODO: complete this function
    return false;
  }

  public int size() {
    // TODO: complete this function
    return 0;
  }

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
