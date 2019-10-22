package edu.berkeley.cs.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TreeMap<Key extends Comparable<Key>, Value> implements Iterable<Key> {
  private Node root;
  private int size;

  private class Node {
    private Key key;
    private Value value;
    private Node left;
    private Node right;

    public Node(Key key, Value value) {
      this.key = key;
      this.value = value;
    }
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public int size() {
    return size;
  }

  public boolean contains(Key key) {
    if (key == null) {
      throw new IllegalArgumentException("argument to contains() is null");
    }

    return get(key) != null;
  }

  public Value get(Key key) {
    return get(root, key);
  }

  private Value get(Node node, Key key) {
    // TODO: complete this function
    return null;
  }

  public void put(Key key, Value value) {
    if (key == null) {
      throw new IllegalArgumentException("calls put() with a null key");
    }

    if (value == null) {
      delete(key);
      return;
    }

    root = put(root, key, value);
    size++;
  }

  private Node put(Node node, Key key, Value value) {
    // TODO: complete this function
    return null;
  }

  public void deleteMin() {
    if (isEmpty()) {
      throw new NoSuchElementException("Symbol table underflow");
    }

    root = deleteMin(root);
    size--;
  }

  private Node deleteMin(Node node) {
    // TODO: complete this function
    return null;
  }

  public void deleteMax() {
    if (isEmpty()) {
      throw new NoSuchElementException("Symbol table underflow");
    }

    root = deleteMax(root);
    size--;
  }

  private Node deleteMax(Node node) {
    // TODO: complete this function
    return null;
  }

  public void delete(Key key) {
    if (key == null) {
      throw new IllegalArgumentException("calls delete() with a null key");
    }

    root = delete(root, key);
    size--;
  }

  private Node delete(Node node, Key key) {
    if (node == null) {
      return null;
    }

    int cmp = key.compareTo(node.key);
    if (cmp < 0) {
      node.left = delete(node.left, key);
    } else if (cmp > 0) {
      node.right = delete(node.right, key);
    } else {
      if (node.right == null) {
        return node.left;
      }

      if (node.left == null) {
        return node.right;
      }

      Node t = node;
      node = min(t.right);
      node.right = deleteMin(t.right);
      node.left = t.left;
    }

    return node;
  }

  public Key min() {
    if (isEmpty()) {
      throw new NoSuchElementException("calls min() with empty symbol table");
    }

    return min(root).key;
  }

  private Node min(Node node) {
    // TODO: complete this function
    return null;
  }

  public Key max() {
    if (isEmpty()) {
      throw new NoSuchElementException("calls max() with empty symbol table");
    }

    return max(root).key;
  }

  private Node max(Node node) {
    // TODO: complete this function
    return null;
  }

  public boolean isBST() {
    return isBST(root, null, null);
  }

  private boolean isBST(Node node, Key min, Key max) {
    if (node == null) {
      return true;
    }

    if (min != null && node.key.compareTo(min) <= 0) {
      return false;
    }

    if (max != null && node.key.compareTo(max) >= 0) {
      return false;
    }

    return isBST(node.left, min, node.key) && isBST(node.right, node.key, max);
  }

  @Override
  public Iterator<Key> iterator() {
    Queue<Key> keys = new Queue<>();
    Queue<Node> queue = new Queue<>();
    queue.enqueue(root);

    while (!queue.isEmpty()) {
      Node node = queue.dequeue();
      if (node == null) {
        continue;
      }

      keys.enqueue(node.key);
      queue.enqueue(node.left);
      queue.enqueue(node.right);
    }

    return new Iterator<Key>() {
      private Iterator<Key> itr = keys.iterator();

      @Override
      public boolean hasNext() {
        return itr.hasNext();
      }

      @Override
      public Key next() {
        return itr.next();
      }
    };
  }
}
