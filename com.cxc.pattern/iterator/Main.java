package iterator;

/**
 * author:chenxinchao
 * date:2017-02-21 10:23
 * desc:iterator
 */
public class Main {
	public static void main(String[] args) {
		MyCollection<String> myCollection = new MyCollection<>(3);
		myCollection.add("1");
		myCollection.add("2");
		myCollection.add("3");
		Iterator<String> iterator = myCollection.iterator();
		while (iterator.hasNext()){
			System.out.println((String)iterator.next());
		}

	}
}
