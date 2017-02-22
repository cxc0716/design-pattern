package command;

/**
 * author:chenxinchao
 * date:2017-02-22 15:43
 * desc:command
 */
public class Invoker {
	private Command command;

	public Invoker() {
	}

	public Invoker(Command command) {
		this.command = command;
	}
	public void execCommand(){
		command.exec();
	}
}
