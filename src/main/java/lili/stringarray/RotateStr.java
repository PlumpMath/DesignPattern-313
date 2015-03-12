package lili.stringarray;

/**
 * Created by lili on 2015/3/10.
 * Check if length(s1) == length(s2).If not, return false.
 2.  Else, concatenate s1 with itself and see whether s2 is substring of the result.
 input: s1 = apple, s2 = pleap ==> apple is a substring of pleappleap
 input: s1 = apple, s2 = ppale ==> apple is not a substring of ppaleppale
 判断s2是否为s1的旋转词
 源子串*2 ，检测子串是否包含
 */
public class RotateStr {

	public static void main(String[] args)
	{
		String str1 = "ILoveU";
		String str2 = "LoveUI";
		System.out.println(isRotation(str1,str2));

	}

	public static boolean isRotation(String str1, String str2){
		if(str1.length() != str2.length())
			return false;
		String str = str2.concat(str2);
		System.out.println("str:" + str);
		return str.contains(str1);

	}
}
