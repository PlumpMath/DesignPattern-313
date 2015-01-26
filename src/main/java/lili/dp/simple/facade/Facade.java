package lili.dp.simple.facade;

/**
 * Created by lili on 15/1/26.
 */
public class Facade {
    private  Patient patient;
    public Facade(Patient patient) {
        this.patient = patient;
    }

    public void dispose() {
        Registry registry = new Registry();
        Doctor doctor = new Doctor();
        Pharmacy pharmacy = new Pharmacy();

        registry.dispose(patient);
        doctor.dispose(patient);
        pharmacy.dispose(patient);

    }
}
