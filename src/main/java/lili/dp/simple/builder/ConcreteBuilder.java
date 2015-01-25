package lili.dp.simple.builder;

/**
 * Created by lili on 15/1/25.
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();
    @Override
    public void buildPart1() {
        System.out.println("build the first part");
    }

    @Override
    public void buildPart2() {
        System.out.println("build the second part");
    }

    @Override
    public Product retrieveResult() {
            return product;
    }
}
