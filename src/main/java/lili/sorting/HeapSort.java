package lili.sorting;

/**
 * Created by lili on 2015/3/11.
 * //堆排序: 利用大根堆或小根堆思想，首先建立堆，然后将堆首与堆尾交换，
 * 队尾之后为有序区
 * 要点：建堆，交换，调整堆。
 */
public class HeapSort implements SortUtil.Sort{

	public static void main(String[] args) {
		int[] arr = new int[]{38, 17, 16, 16, 7, 31, 39, 32, 2, 11};
		SortUtil.Sort sort = new HeapSort();
		sort.sort(arr);
		System.out.println("after  sorting:" + arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	/** (non-Javadoc)
	 */
	public void sort(int[] data) {
		MaxHeap h=new MaxHeap();
		h.init(data);
		for(int i=0;i<data.length;i++)
			h.remove();
		System.arraycopy(h.queue,1,data,0,data.length);
	}


	private static class MaxHeap{


		void init(int[] data){
			this.queue=new int[data.length+1];
			for(int i=0;i<data.length;i++){
				queue[++size]=data[i];
				fixUp(size);
			}
		}

		private int size=0;

		private int[] queue;

		public int get() {
			return queue[1];
		}

		public void remove() {
			SortUtil.swap(queue,1,size--);
			fixDown(1);
		}
		//fixdown
		private void fixDown(int k) {
			int j;
			while ((j = k << 1) <= size) {
				if (j < size && queue[j]<queue[j+1])
					j++;
				if (queue[k]>queue[j]) //不用交换
					break;
				SortUtil.swap(queue,j,k);
				k = j;
			}
		}
		private void fixUp(int k) {
			while (k > 1) {
				int j = k >> 1;
				if (queue[j]>queue[k])
					break;
				SortUtil.swap(queue,j,k);
				k = j;
			}
		}

	}

}
