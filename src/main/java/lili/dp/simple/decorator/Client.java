package lili.dp.simple.decorator;

/**
 * Created by liguofang on 2015/1/26.
 */
public class Client {
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// 一层套一层，进行方法组合
		Component component = new ConcreteDecorator1(new ConcreteDecorator2(
				new ConcreteComponent()));
		component.functionA();
	}
}
