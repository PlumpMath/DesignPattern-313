package lili.dp.simple.command;

/**
 * Created by liguofang on 2015/1/29.
 */
public class Client {
	public static void main(String[] args) {
		CommandInvoker invoker = new CommandInvoker();
		invoker.invoke(new WaterCommand());
		invoker.invoke(new WeedCommand());
	}
}
