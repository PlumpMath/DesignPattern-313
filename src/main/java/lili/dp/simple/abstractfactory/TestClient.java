package lili.dp.simple.abstractfactory;

/**
 * Created by lili on 15/1/25.
 */
public class TestClient {
    public static Creator creator[];

    public static void main(String[] args) {
         creator = new Creator[2];
        creator[0] = new ConcreteCreator1();
        creator[1] = new ConcreteCreator2();
        for (int i = 0; i <creator.length;i++) {
            creator[i].factoryA();
            creator[i].factoryB();
        }
    }
}
