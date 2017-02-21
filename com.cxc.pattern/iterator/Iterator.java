package iterator;

/**
 * author:chenxinchao
 * date:2017-02-21 09:57
 * desc:iterator
 */
public interface Iterator<T> {
	boolean hasNext();
	<T> T prev();
	<T> T next();
}
