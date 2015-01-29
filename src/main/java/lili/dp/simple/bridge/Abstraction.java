package lili.dp.simple.bridge;

/**
 * Created by liguofang on 2015/1/29.
 */
public abstract class Abstraction {
	protected Implementor imp;
	public void setImp(Implementor imp) {
		this.imp = imp;
	}

	public void operation() {
		imp.operationImp();
	}

}
