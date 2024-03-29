package map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Design and implement a data structure for Least Recently Used (LRU) cache. It
 * should support the following operations: get and set.
 * 
 * get(key) - Get the value (will always be positive) of the key if the key
 * exists in the cache, otherwise return -1. 
 * set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
 * it should invalidate the least recently used item before inserting a new item.
 * 
 * @author kevinliu
 * @solution LinkedHashMap
 * 
 */
public class LRUCache {
	private Map<Integer, Integer> map;
	private int capacity;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new LinkedHashMap<>();
	}

	public int get(int key) {
		Integer val = map.get(key);
		if (val == null) {
			return -1;
		}
		map.remove(key);
		map.put(key, val);
		return val;
	}

	public void put(int key, int value) {
		map.remove(key);
		map.put(key, value);
		if (map.size() > capacity) {
			map.remove(map.keySet().iterator().next());
		}
	}
}
