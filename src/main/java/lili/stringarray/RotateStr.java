package lili.stringarray;

/**
 * Created by lili on 2015/3/10.
 * Check if length(s1) == length(s2).If not, return false.
 2.  Else, concatenate s1 with itself and see whether s2 is substring of the result.
 input: s1 = apple, s2 = pleap ==> apple is a substring of pleappleap
 input: s1 = apple, s2 = ppale ==> apple is not a substring of ppaleppale
 */
public class RotateStr {

	public static void main(String[] args)
	{
		String str = "I love U";

	}

	public static boolean isRotation(String s1, String s2){
		int len = s1.length();
		if (len == s2.length() && len >0) {
			/* concatenate s1 and s1 within new buffer */
			String s1s1 = s1+s1;
//
//			return isSubString(s1s1,s2); //TODO 判断s2是否为s1s1的子串
		}
		return false;
	}
}
