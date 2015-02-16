package lili.dp.simple.singleton;

/**
 * Created by liguofang on 2015/2/16.
 * 通过内部类的方式来初始化
 * When the singleton class is loaded, SingletonHelper class is not loaded into memory
 * and only when someone calls the getInstance method, this class gets loaded and
 * creates the Singleton class instance.
 * This is the most widely used approach for Singleton class as it doesn’t require synchronization
 * 当主类被加载的时候，SingletonHelper没有没加载到内存，只有当getInstance方法被调用的时候
 * 这个类才会被加载且创建Singleton类实例。
 * 这种是使用比较多的方式，因为不需要进行同步。
 */
public class Singleton {
	private Singleton(){}

	private static class SinletonHelper{
		private static final Singleton m_instance= new Singleton();
	}
	public static Singleton getInstance() {
		return SinletonHelper.m_instance;
	}
}
