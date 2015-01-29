package lili.dp.simple.flyweight;

import java.util.Hashtable;

/**
 * Created by liguofang on 2015/1/29.
 */
public class FlyweightFactory {
	private Hashtable<String ,Flyweight> flyweights =  new Hashtable<String,Flyweight>();
	public FlyweightFactory(){}
	public Flyweight getFlyWeight(Object obj){
		Flyweight flyweight = (Flyweight) flyweights.get(obj);
		if(flyweight == null){
			flyweight = new ConcreteFlyweight((String)obj);
			flyweights.put((String) obj, flyweight);
		}
		return flyweight;
	}
	public int getFlyweightSize(){
		return flyweights.size();
	}
}