package lili.dp.simple.decorator;

/**
 * Created by liguofang on 2015/1/26.
 * 具体装饰者角色
 */
public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component component)
	{
		super(component);
	}

	@Override
	public void functionA()
	{
		super.functionA();
		this.functionB();
	}
	//根据自己的需要扩展
	private void functionB()
	{
		System.out.println("function B");
	}
}
