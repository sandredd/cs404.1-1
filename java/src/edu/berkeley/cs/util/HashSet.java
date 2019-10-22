package edu.berkeley.cs.util;

import java.util.Iterator;

public class HashSet<Key extends Comparable<Key>> implements Set<Key>, Iterable<Key> {
  private HashMap<Key, Boolean> map = new HashMap<>();

  @Override
  public void add(Key key) {
    map.put(key, true);
  }

  @Override
  public boolean contains(Key key) {
    return map.contains(key);
  }

  @Override
  public void remove(Key key) {
    map.delete(key);
  }

  @Override
  public void clear() {
    map.clear();
  }

  @Override
  public boolean isEmpty() {
    return map.isEmpty();
  }

  @Override
  public int size() {
    return map.size();
  }

  @Override
  public Iterator<Key> iterator() {
    return map.keys().iterator();
  }
}
