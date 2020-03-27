package edu.berkeley.cs.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MinHeap<T extends Comparable<T>> implements Iterable<T> {
  protected final int initialSize = 10;
  private int size = 0;
  protected T[] array;

  public MinHeap() {
    array = (T[]) new Comparable[initialSize];
  }

  public int size() {
    return size;
  }

  public int capacity() {
    return array.length;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  private int parent(int index) {
    return index / 2;
  }

  private int left(int index) {
    return 2 * index;
  }

  private int right(int index) {
    return 2 * index + 1;
  }

  private void swap(int i, int j) {
    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  private boolean less(T v, T w) {
    return v.compareTo(w) < 0;
  }

  private void resize(int capacity) {
    T[] temp = (T[]) new Comparable[capacity];
    System.arraycopy(array, 1, temp, 1, size);
    array = temp;
  }

  public T min() {
    if (isEmpty()) {
      throw new NoSuchElementException("Priority queue underflow");
    }

    return array[1];
  }

  public void insert(T value) {
    if (size >= array.length - 1) {
      resize(2 * array.length);
    }

    array[++size] = value;
    swim(size);
  }

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

  public T removeMinimum() {
    // TODO: complete this function
    return null;
  }

  private void sink(int index) {
    // TODO: complete this function
  }

  private void swim(int index) {
    // TODO: complete this function
  }
}
