package lili.stringarray;

import java.util.Arrays;

/**
 * Created by lili on 15/3/10.
 * 给定一个无序数组arr。如果想要让所有元素从小到大排列，求出需要排序的最短子数组长度。
 * 例如： arr = {1，5，3，4，2，6，7} 返回4，因为只有{5，3，4，2}需要排序。
 * 注：本题请尽量做到时间复杂度O(N)，额外空间复杂度O(1)

 */
public class SortArray {
    public static void main(String[] args)
    {
        int[] longs = new int[]{1,5,3,4,2,6,7,9};
        System.out.print("" + sortArrayNum(longs));

    }

    /**
     * 用冒泡或插入之类的排序算法对原数组进行排序，记录每个元素的移动距离，实际上问题就变成了求最长移动子串。
     * @param arr
     * @return
     */
    private static int sortArrayNum(int[] arr){

            int maxLength = 0;
            int recPoint = 0;
        byte[] recArr;

            if(arr.length == 0)
                return maxLength;

            recArr = new byte[arr.length];

            for(int i = 1;i < arr.length; ++i) {
                for (int j = i; j > 0; --j) {
                    if (arr[j - 1] > arr[j]) {
                        recArr[i] = 1;
                        recArr[j - 1] = 1;
                        //以下三行是排序
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    } else
                        break;
                }
            }

            maxLength = recArr[0];
            for(int i = 1;i < recArr.length; ++i){
                if(recArr[i] > 0)
                    recArr[i] = (byte) (recArr[i] + recArr[i - 1]);
                if(recArr[i] > maxLength)
                    maxLength = recArr[i];
            }

            return maxLength;
        }
}
