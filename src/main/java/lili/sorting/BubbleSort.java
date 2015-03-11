package lili.sorting;

/**
 * 冒泡排序可以算是最经典的排序算法了
 * 两层 for 循环，里层循环中判断相邻两个元素是否逆序，是的话将两个元素交换，
 * 外层循环一次，就能将数组中剩下的元素中最小的元素“浮”到最前面，所以称之为冒泡排序。
 * Created by lili on 2015/3/11.
 */
public class BubbleSort implements SortUtil.Sort {
	@Override
	public void sort(int[] data) {
		int temp;
		for (int i =0; i<data.length;i++) {
			for (int j = data.length-1; j>i;j--) {
				if (data[j]<data[j-1]) {
					SortUtil.swap(data,j,j-1);
				}
			}
		}
	}

}

/*
*
*   照例举个简单的实例吧：

初始状态：   [24, 19, 26, 39, 36, 7, 31, 29, 38, 23]

内层第一趟： [24, 19, 26, 39, 36, 7, 31, 29, 23 , 38 ] （ 9th [23]<->8th [38 ）

内层第二趟： [24, 19, 26, 39, 36, 7, 31, 23 , 29 , 38] （ 8th [23]<->7th [29] ）

内层第三趟： [24, 19, 26, 39, 36, 7, 23 , 31 , 29, 38] （ 7th [23]<->6th [31] ）

内层第四趟： [24, 19, 26, 39, 36, 7, 23, 31, 29, 38] （ 7 、 23 都位于正确的顺序，无需交换）

内层第五趟： [24, 19, 26, 39, 7 , 36 , 23, 31, 29, 38] （ 5th [7]<->4th [36] ）

内层第六趟： [24, 19, 26, 7 , 39 , 36, 23, 31, 29, 38] （ 4th [7]<->3rd [39] ）

内层第七趟： [24, 19, 7 , 26 , 39, 36, 23, 31, 29, 38] （ 3rd [7]<->2nd [26] ）

内层第八趟： [24, 7 , 19 , 26, 39, 36, 23, 31, 29, 38] （ 2nd [7]<->1st [19] ）

内层第九趟： [7 , 24 , 19, 26, 39, 36, 23, 31, 29, 38] （ 1st [7]<->0th [24] ）

…...

其实冒泡排序跟选择排序比较相像，比较次数一样，都为 n * (n - 1) / 2 ，但是冒泡排序在挑选最小值的过程中会进行额外的交换
（冒泡排序在排序中只要发现相邻元素的顺序不对就会进行交换，与之对应的是选择排序，
只会在内层循环比较结束之后根据情况决定是否进行交换），所以在我看来，选择排序属于冒泡排序的改进版。
*
*
*
*
* */
