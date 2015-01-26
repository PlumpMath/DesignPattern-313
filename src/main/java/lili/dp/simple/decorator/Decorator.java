package lili.dp.simple.decorator;

/**
 * Created by liguofang on 2015/1/26.
 */
public class Decorator implements Component {

	//抽象构件角色的引用
	private Component component;
	public Decorator(Component component) {
		this.component = component;
	}
	@Override
	public void functionA() {
		component.functionA();

	}
}
