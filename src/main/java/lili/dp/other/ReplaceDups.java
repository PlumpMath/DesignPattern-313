package lili.dp.other;

import java.util.HashMap;

/**
 * Created by liguofang on 2015/2/16.
 * Having A List of int [1,1,1,3,1,2,1,1,4,1]

 Output needed [1,5,6,3,7,2,8,9,4,10]
 Note: Need not to change value of 3,2,4
 分析
 Without much more description of what you're asking, I'm assuming that you mean to remove duplicate numbers in the array while preserving the original value when possible.
 I can do this in O(n) with the following algorithm:
 -Scan the array to figure out which numbers are already present 扫描当前数组，放到一个map中，都置为True
 -for each number, replace it if necessary using a 1-upped counted value that skips already used numbers
 *循环每个数组，如果不需要替换，则忽略，需要替换则+1，并置换。
 *
 */
public class ReplaceDups {

	public static void replaceDups(int[] arr){
		HashMap<Integer, Boolean> isSafe = new HashMap<Integer, Boolean>();
		for(int i : arr){
			isSafe.put(i, true);
		}

		int c = 1;
		for( int i = 0; i < arr.length; i++){
			Boolean isUsed = isSafe.get(arr[i]);
			if(!isUsed){
				while(isSafe.containsKey(c)){
					c++;
				}
				arr[i] = c;
				c++;
			}
			else{
				isSafe.put(arr[i], false);
			}
			System.out.print(arr[i]);
		}


	}
	public static void main(String[] args) {
	   replaceDups(new int[]{1,1,1,3,1,2,1,1,4,1});
	}
}
