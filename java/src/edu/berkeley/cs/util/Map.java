package edu.berkeley.cs.util;

import java.util.Iterator;

public interface Map<Key extends Comparable<Key>, Value> {
  void clear();

  boolean isEmpty();

  int size();

  boolean contains(Key key);

  Value get(Key key);

  void put(Key key, Value value);

  void delete(Key key);
}
