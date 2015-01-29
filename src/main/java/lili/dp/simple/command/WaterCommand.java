package lili.dp.simple.command;

/**
 * Created by liguofang on 2015/1/29.
 * 浇水执行
 */
public class WaterCommand implements ICommand{
	@Override
	public void exec() {
		System.out.println("----浇水-----");
	}
}
