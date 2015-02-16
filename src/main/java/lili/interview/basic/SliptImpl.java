package lili.interview.basic;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liguofang on 2015/2/16.
 * 自己实现一个split方法
 * 并打印结果到指定的文件中
 */
public class SliptImpl {
	public static void main(String[] args)throws Exception{
		String inputString = ",Here is some text, which is, not making, any, sense,";
		//String[] output = split(inputString, ',');
		String[] output = splitMine(inputString, ',');
		System.setOut(new PrintStream("outfile.txt"));//将输出内容到文件中。。
		for (int i = 0; i < output.length; i++) {
			System.out.println("--"+output[i]);
//						System.out.println("--output[i]");
		}
	}

	public final static String[] splitMine(String str, char separatorChar) {
		if (str == null) {
			return null;
		}
		int len = str.length();
		if (len == 0) {
			return null;
		}
		List<String> list = new ArrayList<String>();
		int temp =0;
		int fromIndex = 0;
		while (temp>=0){
			temp = str.indexOf(separatorChar,fromIndex);
			if(temp<0){
				list.add(str.substring(fromIndex,len));
				break;
			}else{
				list.add(str.substring(fromIndex,temp));
			}
			fromIndex = temp+1;
		}
		String[] arr = new String[list.size()];
		list.toArray(arr);
		return arr;
	}
}
