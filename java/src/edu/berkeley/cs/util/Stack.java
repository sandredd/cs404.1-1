package edu.berkeley.cs.util;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
  private LinkedList<T> list;

  public Stack() {
    list = new LinkedList<>();
  }

  public Stack(LinkedList<T> list) {
    this.list = list;
  }

  /** @return the value of the top element in the container */
  public T peek() {
    return list.front();
  }

  /** @param value the value to be added onto the top of the container */
  public void push(T value) {
    list.insertFront(value);
  }

  /** @return the value of the top element in the container (removes the element as well) */
  public T pop() {
    return list.removeFront();
  }

  /** @return the number of elements in the container */
  public int size() {
    return list.size();
  }

  /** @return true if this container contains no elements */
  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("TOP  [");
    boolean added = false;
    for (T value : this) {
      if (added) {
        sb.append(", ");
      }

      sb.append(value);
      added = true;
    }

    sb.append("]  BOTTOM");
    return sb.toString();
  }

  @Override
  public Iterator<T> iterator() {
    return list.iterator();
  }
}
