package lili.dp.simple.facade;

/**
 * Created by lili on 15/1/26.
 */
public class Doctor implements Disposer {
    @Override
    public void dispose(Patient patient) {
        System.out.println("I am diagnosing....patient is=" +patient.getName());
    }
}
