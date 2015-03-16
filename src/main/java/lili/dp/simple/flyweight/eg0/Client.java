package lili.dp.simple.flyweight.eg0;

/**
 * Created by liguofang on 2015/1/29.
 */
public class Client {
	public static void main(String[] args){
		System.out.println("The FlyWeight Pattern!");
		FlyweightPattern fp = new FlyweightPattern();
		fp.showFlyweight();
	}
}
