package edu.berkeley.cs.util;

import java.util.Iterator;
import java.util.Objects;

public class HashMap<Key, Value> implements Map<Key, Value>, Iterable<HashMap<Key, Value>.Entry> {
  /** The key and value tuple used for storage within the container */
  public class Entry {
    private Key key;
    private Value value;

    Entry(Key key, Value value) {
      this.key = key;
      this.value = value;
    }

    public Key key() {
      return key;
    }

    public Value value() {
      return value;
    }

    @Override
    public boolean equals(Object other) {
      if (!(other instanceof HashMap.Entry)) {
        return false;
      }

      return ((Entry) other).key.equals(key);
    }

    @Override
    public int hashCode() {
      return Objects.hash(key);
    }

    @Override
    public String toString() {
      return String.format("%s -> %s", key, value);
    }
  }

  protected SplayList<Entry>[] table = new SplayList[8];
  private int size = 0;

  /** Construct an empty container */
  public HashMap() {
    for (int i = 0; i < table.length; i++) {
      table[i] = new SplayList<>();
    }
  }

  /**
   * @param key the key to hash
   * @return the array index where the input key maps to
   */
  protected int hash(Key key) {
    return Math.abs(key.hashCode()) % table.length;
  }

  /**
   * Resize the container. This method creates a new backing array of the given capacity and
   * rehashes all elements into the new backing array.
   */
  private void resize(int capacity) {
    if (capacity <= 0) {
      return;
    }

    SplayList<Entry>[] oldTable = table;

    table = new SplayList[capacity];
    for (int i = 0; i < table.length; i++) {
      table[i] = new SplayList<>();
    }

    for (SplayList<Entry> list : oldTable) {
      for (Entry entry : list) {
        int index = hash(entry.key);
        table[index].insertEnd(entry);
      }
    }
  }

  /** Reset this container as if it was newly created with no elements */
  @Override
  public void clear() {
    size = 0;
    for (int i = 0; i < table.length; i++) {
      table[i] = new SplayList<>();
    }
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

  @Override
  public Iterator<HashMap<Key, Value>.Entry> iterator() {
    return new Iterator<HashMap<Key, Value>.Entry>() {
      private int index = 0;
      private Iterator<Entry> current = table[index].iterator();

      @Override
      public boolean hasNext() {
        if (index >= table.length) {
          return false;
        }

        if (current.hasNext()) {
          return true;
        }

        while (true) {
          index++;
          if (index >= table.length) {
            break;
          }

          current = table[index].iterator();
          if (current.hasNext()) {
            return true;
          }
        }

        return false;
      }

      @Override
      public Entry next() {
        return current.next();
      }
    };
  }

  /** @return the keys within the container */
  public LinkedList<Key> keys() {
    LinkedList<Key> keys = new LinkedList<>();

    for (Entry entry : this) {
      keys.insertEnd(entry.key);
    }

    return keys;
  }

  /**
   * @param key The element whose presence in this container is to be tested
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
   * @param key the key to be inserted into the container (cannot be null)
   * @param value the value associated with the input key (deletes key if null)
   */
  @Override
  public void put(Key key, Value value) {
    // TODO: complete this function
  }

  /**
   * @param key The element whose presence in this container is to be tested
   * @return true if this container contains the specified element
   */
  public boolean contains(Key key) {
    // TODO: complete this function
    return false;
  }

  /** @param key the key to delete from the container (the associated value is also deleted) */
  @Override
  public void delete(Key key) {
    // TODO: complete this function
  }
}
