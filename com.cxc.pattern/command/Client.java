package command;

/**
 * author:chenxinchao
 * date:2017-02-21 20:41
 * desc:命令者模式-- 命令者和执行者分离
 */
public class Client {
	public static void main(String[] args) {
		Receiver receiver = new MyReceiver();
		Command command = new MyCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.execCommand();
	}
}
