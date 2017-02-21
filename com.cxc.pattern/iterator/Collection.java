package iterator;

/**
 * author:chenxinchao
 * date:2017-02-21 09:58
 * desc:iterator
 */
public interface Collection<T> {
	Iterator<T> iterator();

	<T> T get(int index);

	void add(T t);

	void set(int index,T t);

	int size();
}
