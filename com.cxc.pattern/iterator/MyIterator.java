package iterator;

/**
 * author:chenxinchao
 * date:2017-02-21 10:01
 * desc:iterator
 */
public class MyIterator<T> implements Iterator<T> {

	private int position = -1;
	private Collection<T> collection;

	public MyIterator(Collection<T> collection) {
		this.collection = collection;
	}

	@Override public boolean hasNext() {
		if(position < collection.size()-1){
			return true;
		}
		return false;
	}

	@Override public <T> T prev() {
		position --;
		if(position < 0 ){
			position = 0;
		}
		return collection.get(position);
	}

	@Override public <T> T  next() {
		position++;
		if(position > collection.size()-1){
			position = collection.size() - 1;
		}
		return collection.get(position);
	}
}
