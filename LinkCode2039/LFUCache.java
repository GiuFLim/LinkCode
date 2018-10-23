package LinkCode2039;

import java.util.HashMap;
import java.util.Map;

/*
 * LFU是一个著名的缓存算法
实现LFU中的set 和 get
 */
public class LFUCache {
	private Map<Integer, Node> cache;
	private int capacity = 0;
	private int used = 0;

	/*
	 * @param capacity: An integer
	 */
	public LFUCache(int capacity) {
		// do initialization if necessary
		cache = new HashMap<>(capacity * 2);
		this.capacity = capacity;
	}

	/*
	 * @param key: An integer
	 * 
	 * @param value: An integer
	 * 
	 * @return: nothing
	 */
	public void set(int key, int value) {
		// write your code here
		Node n = cache.get(key);
		if (n != null) {
			n.value = value;
			n.usedTimes++;
			n.lastUsedTime = System.nanoTime();
		} else {
			n = new Node();
			n.value = value;
			n.usedTimes = 0;
			n.lastUsedTime = System.nanoTime();
			if (used < capacity) {
				cache.put(key, n);
				used++;
			} else {
				removeLast();
				cache.put(key, n);
			}
		}
	}

	/*
	 * @param key: An integer
	 * 
	 * @return: An integer
	 */
	public int get(int key) {
		// write your code here
		Node n = cache.get(key);
		if (n != null) {
			n.usedTimes = n.usedTimes + 1;
			n.lastUsedTime = System.nanoTime();
			return n.value;
		} else {
			return -1;
		}
	}

	private void removeLast() {
		int minCount = Integer.MAX_VALUE;
		long time = System.nanoTime();

		Integer k = null;
		for (Map.Entry<Integer, Node> entry : cache.entrySet()) {
			if (entry.getValue().usedTimes < minCount
					|| (entry.getValue().usedTimes == minCount && entry.getValue().lastUsedTime < time)) {
				k = entry.getKey();
				minCount = entry.getValue().usedTimes;
				time = entry.getValue().lastUsedTime;
			}
		}
		cache.remove(k);
	}

	public class Node {
		public int value;
		public int usedTimes;
		public long lastUsedTime;
	}
}
