抽象工厂模式可以向客户端提供一个接口，使得客户端在不必指定产品的具体类型的情况下
，创建多个产品族中的产品对象。这就是抽象工厂模式的用意.

抽象工厂模式与工厂方法模式的最大区别就在于，工厂方法模式针对的是一个产品等级结构，
而抽象工厂模式则需要面对多个产品等级结构。
抽象工厂（AbstractFactory)角色：担任这个角色的是工厂方法模式的核心，它是与应用系统的商业逻辑无关的。
    通常使用Java接口或者抽象Java类实现，而所有的具体工厂类必须实现这个Java接口或继承这个抽象Java类。
具体工厂类（Concrete Factory)角色：这个角色直接在客户端的调用下创建产品的实例。
    这个角色含有选择合适的产品对象的逻辑，而这个逻辑是与应用系统的商业逻辑紧密相关的。
    通常使用具体Java类实现这个角色。
抽象产品（Abstract Product)角色：担任这个角色的类是工厂方法模式所创建的对象的父类，
    或它们共同拥有的接口。
具体产品（Concrete Product)角色：抽象工厂模式创建的任何产品对象都是某一个具体产品类的实例。
    这是客户端最终需要的东西，其内部一定充满了应用系统的商业逻辑。

