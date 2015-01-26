package lili.dp.simple.decorator;

/**
 * Created by liguofang on 2015/1/26.
 * 具体构件角色
 */
public class ConcreteComponent implements Component {
	@Override
	public void functionA() {
		System.out.println("Function A");
	}
}
