package lili.stringarray;

import java.util.*;

/**
 * 随机产生20个字符串并且字符串不能重复 且进行排序
 * Created by lili on 2015/3/11.
 */
public class RadomChar {
	public Set getChar(){

		Set numberSet01 = new HashSet();
		Random rdm = new Random();
		char ch;
		while(numberSet01.size()<20){
			int rdGet = Math.abs(rdm.nextInt())%26+97;//产生97到122的随机数a-z值
			ch=(char)rdGet;
			numberSet01.add(ch);
			//Set中是不能放进重复的值的，当它有20个时，就满足你的条件了
		}
		return numberSet01;
	}
	public static void main(String[] args) {
		RadomChar rd = new RadomChar();
		Set numberSet01=rd.getChar();

		Set numberSet = new TreeSet();
		numberSet.addAll(numberSet01);  //TreeSet可以自动排序
		for(Iterator it=numberSet01.iterator();it.hasNext();){
			System.out.print(it.next());
		}
		System.out.println();
		for(Iterator it=numberSet.iterator();it.hasNext();){
			System.out.print(it.next());
		}
	}

}
