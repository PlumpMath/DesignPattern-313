package lili.interview.basic;

/**
 * Created by lili on 15/2/22.
 * Implement an algorithm to determine if a string has all unique characters What if you can not use additional data structures?
 * 实现一个算法判断一个字符串是否所有字符都是唯一的。
 */
public class UniqueChars {
    /**
     * 假设char set 是ASCII
     * O(n)算法复杂度
     * @param str
     * @return
     */
    public static boolean isUniqueChars2(String str) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i<str.length(); i++) {
            int val = str.charAt(i);
            System.out.println("=========" + val);
            if(char_set[val]) return false;
            char_set[val] =true;
        }
        return true;
    }

    /**
     * 字符串是小写的 'a-z'
     * @param str
     * @return
     */
    public static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i< str.length(); ++i) {
            int val = str.charAt(i) -'a';
            if ((checker & (i <<val)) >0) return false;
            checker |= (1<<val);

        }
        return true;
    }

    public  static  void main(String[] args) {
//        System.out.println("=========" + isUniqueChars2("abcxcd"));
        System.out.println("=========" + isUniqueChars2("abcxcd"));
    }
}
