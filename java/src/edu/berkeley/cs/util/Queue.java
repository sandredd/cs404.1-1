package edu.berkeley.cs.util;

import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
  private LinkedList<T> list;

  public Queue() {
    list = new LinkedList<>();
  }

  public Queue(LinkedList<T> list) {
    this.list = list;
  }

  /** @return the value of the element at the front of the container */
  public T peek() {
    return list.front();
  }

  /** @param value the value to be added to the end of the container */
  public void enqueue(T value) {
    list.insertEnd(value);
  }

  /** @return the value at the front of the container (removes the element as well) */
  public T dequeue() {
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

    sb.append("FRONT  [");
    boolean added = false;
    for (T value : this) {
      if (added) {
        sb.append(", ");
      }

      sb.append(value);
      added = true;
    }

    sb.append("]  BACK");
    return sb.toString();
  }

  @Override
  public Iterator<T> iterator() {
    return list.iterator();
  }
}
