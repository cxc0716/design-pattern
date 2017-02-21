package adapter.forclass;

/**
 * author:chenxinchao
 * date:2017-02-20 19:40
 * desc:adapter
 */
public class Test {
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		System.out.println(adapter.get());
		System.out.println(adapter.getAll());
	}
}
