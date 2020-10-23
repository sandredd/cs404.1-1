package edu.berkeley.cs.util;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MinHeap<T extends Comparable<T>> implements Iterable<T> {
  protected final int initialCapacity = 10;
  private int size = 0;
  protected T[] array = (T[]) Array.newInstance(Comparable.class, initialCapacity + 1);

  /** @return the number of elements in this container */
  public int size() {
    return size;
  }

  /** @return the number of elements this container can hold before having to resize */
  public int capacity() {
    return array.length - 1;
  }

  /** @return true if this container contains no elements */
  public boolean isEmpty() {
    return size() == 0;
  }

  /** @return the parent index of the given index */
  private int parent(int index) {
    return index / 2;
  }

  /** @return the left child's index of the given index */
  private int left(int index) {
    return 2 * index;
  }

  /** @return the right child's index of the given index */
  private int right(int index) {
    return 2 * index + 1;
  }

  /** Swap index i and j in the container's backing array */
  private void swap(int i, int j) {
    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  /** @return true if v is less than w */
  private boolean less(T v, T w) {
    return v.compareTo(w) < 0;
  }

  /** Resize this container's backing array to the new capacity */
  private void resize(int capacity) {
    T[] temp = (T[]) Array.newInstance(Comparable.class, capacity);
    System.arraycopy(array, 1, temp, 1, size);
    array = temp;
  }

  /**
   * @return the minimum element in the container. If called on an empty container, throw a
   *     NoSuchElementException.
   */
  public T min() {
    if (isEmpty()) {
      throw new NoSuchElementException("Priority queue underflow");
    }

    return array[1];
  }

  /**
   * @return true if the heap property is satisfied at every level of the container's backing array
   */
  private boolean isMinHeapOrdered(int k) {
    if (k > size()) {
      return true;
    }

    int left = left(k);
    int right = right(k);

    if (left <= size() && less(array[left], array[k])) {
      return false;
    }

    if (right <= size() && less(array[right], array[k])) {
      return false;
    }

    return isMinHeapOrdered(left) && isMinHeapOrdered(right);
  }

  /** @return true if this container is valid and satisfies all necessary heap conditions */
  protected boolean isMinHeap() {
    for (int i = 1; i <= size(); i++) {
      if (array[i] == null) {
        return false;
      }
    }

    for (int i = size() + 1; i < array.length; i++) {
      if (array[i] != null) {
        return false;
      }
    }

    if (array[0] != null) {
      return false;
    }

    return isMinHeapOrdered(1);
  }

  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {
      private int index = 1;

      @Override
      public boolean hasNext() {
        return index < array.length && array[index] != null;
      }

      @Override
      public T next() {
        return array[index++];
      }
    };
  }

  /** Insert a value into the container and ensure that the heap property is maintained */
  public void insert(T value) {
    // TODO: complete this function
  }

  /**
   * Remove the minimum value from this container and ensure that the heap property is maintained.
   * If called on an empty container, throw a NoSuchElementException.
   */
  public T removeMinimum() {
    // TODO: complete this function
    return null;
  }

  /** Implement the sink operation within this container, starting at the given index */
  private void sink(int index) {
    // TODO: complete this function
  }

  /** Implement the swim operation within this container, starting at the given index */
  private void swim(int index) {
    // TODO: complete this function
  }
}
