package edu.berkeley.cs.util;

import java.util.Iterator;

public class HashSet<Key extends Comparable<Key>> implements Set<Key>, Iterable<Key> {
  private HashMap<Key, Boolean> map = new HashMap<>();

  /** @param key the key to insert into the container (does nothing if key is already present) */
  @Override
  public void add(Key key) {
    map.put(key, true);
  }

  /**
   * @param key The element whose presence in this container is to be tested
   * @return true if this container contains the specified element
   */
  @Override
  public boolean contains(Key key) {
    return map.contains(key);
  }

  /** @param key the key to delete from the container */
  @Override
  public void delete(Key key) {
    map.delete(key);
  }

  /** Reset this container as if it was newly created with no elements */
  @Override
  public void clear() {
    map.clear();
  }

  /** @return true if this container contains no elements */
  @Override
  public boolean isEmpty() {
    return map.isEmpty();
  }

  /** @return the number of elements in this container */
  @Override
  public int size() {
    return map.size();
  }

  @Override
  public Iterator<Key> iterator() {
    return map.keys().iterator();
  }
}
