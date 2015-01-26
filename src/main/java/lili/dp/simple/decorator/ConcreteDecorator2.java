package lili.dp.simple.decorator;

/**
 * Created by liguofang on 2015/1/26.
 * 具体装饰者角色
 */
public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component component)
	{
		super(component);
	}

	//重载父类方法
	@Override
	public void functionA()
	{
		super.functionA();
		this.functionC();
	}
	//根据自己的需要扩展
	private void functionC()
	{
		System.out.println("function C");
	}
}
