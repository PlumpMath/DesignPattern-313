package lili.dp.simple.facade;

/**
 * Created by lili on 15/1/26.
 * 挂号
 */
public class Registry  implements  Disposer{
    @Override
    public void dispose(Patient patient) {
        System.out.println("I'm registering..my name is=" + patient.getName());
    }
}
