package lili.dp.simple.command;

/**
 * Created by liguofang on 2015/1/29.
 * 除草执行
 */
public class WeedCommand implements ICommand {
	@Override
	public void exec() {
		System.out.println("----除草----");
	}
}
