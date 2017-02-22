package command;

/**
 * author:chenxinchao
 * date:2017-02-22 15:40
 * desc:command
 */
public class MyCommand implements Command {

	private Receiver receiver;

	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override public void exec() {
		receiver.doAction();
	}
}
