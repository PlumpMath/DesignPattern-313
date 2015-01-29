package lili.dp.simple.flyweight;

/**
 * Created by liguofang on 2015/1/29.
 */
public class ConcreteFlyweight extends Flyweight{
	private String string;
	public ConcreteFlyweight(String str) {
		string = str;
	}
	@Override
	public void operation() {

		System.out.println("Concrete--flyweith:" + string);
	}
}
