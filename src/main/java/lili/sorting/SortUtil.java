package lili.sorting;

/**
 *
 * Created by lili on 2015/3/11.
 */
public class SortUtil {
	/*插入排序*/
	public final static int INSERT = 1;
	/*冒泡排序*/
	public final static int BUBBLE = 2;
	/*选择排序*/
	public final static int SELECTION = 3;
	/*希尔排序*/
	public final static int SHELL = 4;
	/*快速排序*/
	public final static int QUICK = 5;
	/*快速排序增强*/
	public final static int IMPROVED_QUICK = 6;
	/*合并排序*/
	public final static int MERGE = 7;
	/*快速排序增强*/
	public final static int IMPROVED_MERGE = 8;
	/*堆排序*/
	public final static int HEAP = 9;

	public static void sort(int[] data) {
		sort(data, IMPROVED_QUICK);
	}
	private static String[] name={
			"insert","bubble","selection","shell","quick","improved_quick","merge","improved_merge","heap"
	};

	private static Sort[] impl=new Sort[]{
			new InsertSort(),
			new BubbleSort(),
			new SelectionSort(),
			new ShellSort(),
			new QuickSort(),
			new ImprovedQuickSort(),
			new MergeSort(),
			new ImprovedMergeSort(),
			new HeapSort()
	};

	public static String toString(int algorithm){
		return name[algorithm-1];
	}

	public static void sort(int[] data, int algorithm) {
		impl[algorithm-1].sort(data);
	}

	public static interface Sort {
		public void sort(int[] data);
	}

	public static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	public static void main(String[] args) {
		int[] data = new int[]{24, 19, 26, 39, 36, 7, 31, 29, 38, 23};
		sort(data,1);
		System.out.println("after sorting:");
		for (int i = 0; i < data.length;i++) {
			System.out.print(data[i]+",");
		}
	}
}
