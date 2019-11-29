package gara.implementations;


public class HashMapTest<K, V> {

  public V get(final K key) {
    int bucket = getHash(key) % getBucketSize();

    return buckets[bucket].value;
  }

  static class Entry<K, V> {
    final K key;
    V value;
    Entry<K, V> next;
    public Entry(K key, V value, Entry<K, V> next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }
    // getters, equals, hashCode and toString
  }

  Entry<K, V>[] buckets;

  public HashMapTest(int capacity) {
    this.buckets = new Entry[capacity];
  }

  public void put(K key, V value) {

    Entry<K,V> entry = new Entry(key, value, null);

    int bucket = getHash(key) % getBucketSize();
    Entry<K,V> entry1 = buckets[bucket];
    if ( entry1 != null ){
      entry1.value = value;
    }else{
      buckets[bucket] = entry;
    }
  }

  private int getBucketSize() {
    return buckets.length;
  }

  private int getHash(final K key) {
    return key.hashCode();
  }
}
