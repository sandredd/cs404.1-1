package edu.berkeley.cs.util;

public interface Set<Key extends Comparable<Key>> {
  void add(Key key);

  boolean contains(Key key);

  void remove(Key key);

  void clear();

  boolean isEmpty();

  int size();
}
