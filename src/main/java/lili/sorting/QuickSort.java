package lili.sorting;

/**
 * Created by lili on 2015/3/11.
 * 快速排序也是用归并方法实现的一个“分而治之”的排序算法，它的魅力之处在于它能在每次partition
 * （排序算法的核心所在）都能为一个数组元素确定其排序最终正确位置（一次就定位准，下次循环就不考虑这个元素了）。

 快速排序的partition操作按以下逻辑进行，假定本次排序的数组为arr：

 1） 选择一个元素（为了简单起见，就选择本次partition的第一个元素，即arr[0]）作为基准元素，
 接下来的步骤会为其确定排序完成后最终的位置；

 2） 1）  接下来需要遍历[1…n-1]对应的数组元素以帮助找到arr[0]值（以v替代）对应的位置，
 定义i为当前访问数组的索引，lt为值小于v的最大索引，gt为值大于v的最小索引，那么在遍历过程中，
 如果发现i指向的值与v相等，则将i值加1，继续下一次比较；如果i指向的值比v小，则将i和lt对应的元素进行交换，
 然后分别将两个索引加1；如果i指向的值比v大，则将i与gt对应的元素进行交换，然后i自增，gt自减。
 循环遍历完成（i > gt时结束）之后可以保证[0…lt-1]对应的值都是比v小的，[lt..gt]之间的值都是与v相等的，
 [gt+1…n-1]对应的值都是比v大的。

 3） 分别对[0…lt-1]和[gt+1…n-1]两个子数组进行排序，如此递归，直至子子子数组的长度为0。
 */
public class QuickSort implements SortUtil.Sort{

	/** (non-Javadoc)
	 */
	public void sort(int[] data) {
		quickSort(data,0,data.length-1);
	}
	private void quickSort(int[] data,int i,int j){
		int pivotIndex=(i+j)/2;
		//swap
		SortUtil.swap(data,pivotIndex,j);

		int k=partition(data,i-1,j,data[j]);
		SortUtil.swap(data,k,j);
		if((k-i)>1) quickSort(data,i,k-1);
		if((j-k)>1) quickSort(data,k+1,j);

	}

	/**
	 *
	 * @param data
	 * @param l
	 * @param r
	 * @param pivot
	 * @return
	 */
	private int partition(int[] data, int l, int r,int pivot) {
		do{
			while(data[++l]<pivot);
			while((r!=0)&&data[--r]>pivot);
			SortUtil.swap(data,l,r);
		}
		while(l<r);
		SortUtil.swap(data,l,r);
		return l;
	}
}
