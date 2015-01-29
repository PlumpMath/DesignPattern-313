package lili.dp.simple.command;

/**
 * Created by liguofang on 2015/1/29.
 * 命令调用执行方法
 */
public class CommandInvoker {

	public void invoke(ICommand command) {
		command.exec();
	}
}
