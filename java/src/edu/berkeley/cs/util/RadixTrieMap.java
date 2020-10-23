package edu.berkeley.cs.util;

public class RadixTrieMap<Value> implements Map<String, Value> {
  /** Reset this container as if it was newly created with no elements */
  @Override
  public void clear() {
    // TODO: complete this function
  }

  /** @return the number of elements in this container */
  @Override
  public int size() {
    // TODO: complete this function
    return 0;
  }

  /** @return true if this container contains no elements */
  @Override
  public boolean isEmpty() {
    // TODO: complete this function
    return false;
  }

  /**
   * Associate a key with a value. If the key already exists in the container, this method
   * overwrites the previous value with the new one.
   *
   * @param key the key to be inserted into the container (cannot be null, must use characters from
   *     a-z). If key is null or contains characters not in a-z, throw an IllegalArgumentException.
   * @param value the value associated with the input key (deletes key if null)
   */
  @Override
  public void put(String key, Value value) {
    // TODO: complete this function
  }

  /**
   * @param key The element whose presence in this container is to be tested
   * @return the value associated with the input key, if it exists in the container (null otherwise)
   */
  @Override
  public Value get(String key) {
    // TODO: complete this function
    return null;
  }

  /**
   * @param key The element whose presence in this container is to be tested
   * @return true if this container contains the specified element
   */
  @Override
  public boolean contains(String key) {
    // TODO: complete this function
    return false;
  }

  /** @param key the key to delete from the container (the associated value is also deleted) */
  @Override
  public void delete(String key) {
    throw new UnsupportedOperationException();
  }

  /**
   * @param prefix the prefix to search for
   * @return the keys in the container which all begin with the input prefix
   */
  public Iterable<String> startsWith(String prefix) {
    // TODO: complete this function
    return null;
  }

  /**
   * @param prefix the prefix to search for
   * @return true if the input is a prefix of at least one key in the container
   */
  public boolean isPrefix(String prefix) {
    // TODO: complete this function
    return false;
  }

  /** @return container keys in sorted order */
  public Iterable<String> sorted() {
    // TODO: complete this function
    return null;
  }
}
