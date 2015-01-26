package lili.dp.simple.facade;

/**
 * Created by lili on 15/1/26.
 */
public class Client {

    public static void main(String[] args) {
        Patient patient = new ConcretePatient("LILI");
        Facade facade = new Facade(patient);
        facade.dispose();
    }
}
