package command;

/**
 * author:chenxinchao
 * date:2017-02-22 15:39
 * desc:command
 */
public class MyReceiver implements Receiver {
	@Override public void doAction() {
		System.out.println("I'm a receiver,now begin to work");
	}
}
