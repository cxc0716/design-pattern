package adapter.forclass;

/**
 * author:chenxinchao
 * date:2017-02-20 19:39
 * desc:adapter
 */
public class Adapter extends ClassA implements Targetable {
	@Override public String get() {
		return super.get();
	}

	@Override public String getAll() {
		return "hello-get-all";
	}
}
