package lili.dp.simple.builder;

/**
 * Created by lili on 15/1/25.
 */
public class Director {
    private Builder builder;
    public Director (Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart1();
        builder.buildPart2();
        builder.retrieveResult();
        //以上的创建过程可以顺序依赖，这样保证每个部件都可以完整构建。
    }

    public static  void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
    }

}
