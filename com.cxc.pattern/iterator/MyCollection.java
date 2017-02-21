package iterator;

/**
 * author:chenxinchao
 * date:2017-02-21 10:11
 * desc:iterator
 */
public class MyCollection<T> implements Collection<T> {

	private int capacity = 10;
	private Object[] array;
	private int currentCount = 0;

	public MyCollection(int capacity) {
		this.capacity = capacity;
		array = new Object[capacity];
	}

	@Override public Iterator<T> iterator() {
		return new MyIterator<T>(this);
	}

	@Override public <T> T get(int index) {
		return (T)array[index];
	}

	@Override public void add(T t) {
		if(currentCount == capacity){
			throw new RuntimeException("cannot overflow the capacity");
		}
		array[currentCount] = t;
		currentCount++;
	}

	@Override public void set(int index, T t) {
		array[index] = t;
	}

	@Override public int size() {
		return currentCount;
	}
}
