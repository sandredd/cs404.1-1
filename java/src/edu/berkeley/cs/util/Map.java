package edu.berkeley.cs.util;

public interface Map<Key, Value> {
  /** Reset this container as if it was newly created with no elements */
  void clear();

  /** @return true if this container contains no elements */
  boolean isEmpty();

  /** @return the number of elements in this container */
  int size();

  /**
   * @param key The element whose presence in this container is to be tested
   * @return true if this container contains the specified element
   */
  boolean contains(Key key);

  /**
   * @param key The element whose presence in this container is to be tested
   * @return the value associated with the input key, if it exists in the container (null otherwise)
   */
  Value get(Key key);

  /**
   * Associate a key with a value. If the key already exists in the container, this method
   * overwrites the previous value with the new one.
   *
   * @param key the key to be inserted into the container (cannot be null)
   * @param value the value associated with the input key (deletes key if null)
   */
  void put(Key key, Value value);

  /** @param key the key to delete from the container (the associated value is also deleted) */
  void delete(Key key);
}
