package lili.dp.simple.bridge;

/**
 * Created by liguofang on 2015/1/29.
 * 客户端调用
 */
public class Client {
public static void main(String[] args) {
	Abstraction abs = new RefinedAbstractionA();
	abs.setImp(new ConcreteImplementorA()); //等于把RefinedAbstractionA和ConcreteImplementorA组合起来了
	abs.operation();

	abs.setImp(new ConcreteImplementorB());  //等于把RefinedAbstractionA和ConcreteImplementorB组合起来了
	abs.operation();


}
}
