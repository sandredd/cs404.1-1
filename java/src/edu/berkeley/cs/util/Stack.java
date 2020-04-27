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

  /**
   * Get the value of the top element in the stack.
   *
   * @return the value of the top element in the stack.
   */
  public T peek() {
    return list.front();
  }

  /**
   * Push a value onto the top of the stack.
   *
   * @param value the value to be added onto the top of the stack.
   */
  public void push(T value) {
    list.insertFront(value);
  }

  /**
   * Remove a value from the top of the stack.
   *
   * @return the value that was previously on the top of the stack.
   */
  public T pop() {
    return list.removeFront();
  }

  /**
   * Returns the number of elements in the stack.
   *
   * @return the number of elements in the stack.
   */
  public int size() {
    return list.size();
  }

  /**
   * Returns true if this stack contains no elements.
   *
   * @return true if this stack contains no elements.
   */
  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public Iterator<T> iterator() {
    return list.iterator();
  }
}
