package lili.dp.simple.facade;

/**
 * Created by lili on 15/1/26.
 */
public class Pharmacy implements Disposer {
    @Override
    public void dispose(Patient patient) {
        System.out.println("I am giving medicines...patient is=" + patient.getName());
    }
}
