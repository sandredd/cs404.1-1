package edu.berkeley.cs.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TreeMap<Key extends Comparable<Key>, Value> implements Map<Key, Value>, Iterable<Key> {
  protected Node root;
  private int size;

  protected class Node {
    public Key key;
    public Value value;
    public Node left;
    public Node right;

    public Node(Key key, Value value) {
      this.key = key;
      this.value = value;
    }
  }

  /** Reset this container as if it was newly created with no elements */
  @Override
  public void clear() {
    root = null;
    size = 0;
  }

  /** @return true if this container contains no elements */
  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  /** @return the number of elements in this container */
  @Override
  public int size() {
    return size;
  }

  /**
   * @param key The element whose presence in this container is to be tested. If key is null, throw
   *     an IllegalArgumentException.
   * @return true if this container contains the specified element
   */
  @Override
  public boolean contains(Key key) {
    if (key == null) {
      throw new IllegalArgumentException("argument to contains() is null");
    }

    return get(key) != null;
  }

  /**
   * @param key The element whose presence in this container is to be tested. If key is null, throw
   *     an IllegalArgumentException.
   * @return the value associated with the input key, if it exists in the container (null otherwise)
   */
  @Override
  public Value get(Key key) {
    // TODO: complete this function
    return null;
  }

  /**
   * Associate a key with a value. If the key already exists in the container, this method
   * overwrites the previous value with the new one.
   *
   * @param key the key to be inserted into the container (cannot be null). If a null key is
   *     provided, throw an IllegalArgumentException.
   * @param value the value associated with the input key (deletes key if null)
   */
  @Override
  public void put(Key key, Value value) {
    if (key == null) {
      throw new IllegalArgumentException("calls put() with a null key");
    }

    if (value == null) {
      delete(key);
      return;
    }

    size++;
    // TODO: complete this function
  }

  /**
   * Delete the minimum element in the container. If is called on an empty container, throw a
   * NoSuchElementException.
   */
  public void deleteMin() {
    if (isEmpty()) {
      throw new NoSuchElementException("Symbol table underflow");
    }

    root = deleteMin(root);
    size--;
  }

  /**
   * @param node the root of the subtree to delete the minimum from
   * @return the new left node for this subtree root
   */
  private Node deleteMin(Node node) {
    // TODO: complete this function
    return null;
  }

  /**
   * Delete the maximum element in the container. If called on an empty container, throw a
   * NoSuchElementException.
   */
  public void deleteMax() {
    if (isEmpty()) {
      throw new NoSuchElementException("Symbol table underflow");
    }

    root = deleteMax(root);
    size--;
  }

  /**
   * @param node the root of the subtree to delete the maximum from
   * @return the new right node for this subtree root
   */
  private Node deleteMax(Node node) {
    // TODO: complete this function
    return null;
  }

  /**
   * @param key the key to delete from the container (the associated value is also deleted). If key
   *     is null, throw an IllegalArgumentException.
   */
  @Override
  public void delete(Key key) {
    if (key == null) {
      throw new IllegalArgumentException("calls delete() with a null key");
    }

    root = delete(root, key);
    size--;
  }

  /**
   * @param node the subtree root to delete from
   * @param key the key to delete from the subtree (the associated value is also deleted)
   */
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

  /**
   * @return the minimum value key in the container. If called on an empty container, throw a
   *     NoSuchElementException.
   */
  public Key min() {
    if (isEmpty()) {
      throw new NoSuchElementException("calls min() with empty symbol table");
    }

    return min(root).key;
  }

  /**
   * @param node the root of the subtree to find the minimum from
   * @return the minimum node within this subtree
   */
  private Node min(Node node) {
    // TODO: complete this function
    return null;
  }

  /**
   * @return the maximum value key in the container. If called on an empty container, throw a
   *     NoSuchElementException.
   */
  public Key max() {
    if (isEmpty()) {
      throw new NoSuchElementException("calls max() with empty symbol table");
    }

    return max(root).key;
  }

  /**
   * @param node the root of the subtree to find the maximum from
   * @return the maximum node within this subtree
   */
  private Node max(Node node) {
    // TODO: complete this function
    return null;
  }

  /** @return true if the container exhibits the binary search tree property at all nodes */
  public boolean isBST() {
    return isBST(root, null, null);
  }

  /**
   * @return true if the container exhibits the binary search tree property at the subtree rooted at
   *     node.
   */
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
