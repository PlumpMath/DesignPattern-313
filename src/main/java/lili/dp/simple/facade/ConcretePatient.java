package lili.dp.simple.facade;

/**
 * Created by lili on 15/1/26.
 */
public class ConcretePatient implements Patient {

    private String name;
    public ConcretePatient(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
