package edu.berkeley.cs.util;

public interface Set<Key extends Comparable<Key>> {
  /** @param key the key to insert into the container (does nothing if key is already present) */
  void add(Key key);

  /**
   * @param key The element whose presence in this container is to be tested
   * @return true if this container contains the specified element
   */
  boolean contains(Key key);

  /** @param key the key to delete from the container */
  void delete(Key key);

  /** Reset this container as if it was newly created with no elements */
  void clear();

  /** @return true if this container contains no elements */
  boolean isEmpty();

  /** @return the number of elements in this container */
  int size();
}
