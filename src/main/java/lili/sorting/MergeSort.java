package lili.sorting;

/**
 * Created by lili on 2015/3/11.
 * 归并排序
 * 原理：将原序列划分为有序的两个序列，然后利用归并算法进行合并，合并之后即为有序序列
 * 要点:归并，分治
 */
public class MergeSort implements SortUtil.Sort{

	public static void main(String[] args) {
		int[] arr = new int[]{38, 17, 16, 16, 7, 31, 39, 32, 2, 11};
		SortUtil.Sort sort = new MergeSort();
		sort.sort(arr);
		System.out.println("after  sorting:" + arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	/** (non-Javadoc)
	 */
	public void sort(int[] data) {
		int[] temp=new int[data.length];
		mergeSort(data,temp,0,data.length-1);
	}

	private void mergeSort(int[] data,int[] temp,int l,int r){
		int mid=(l+r)/2;
		if(l==r) return ;
		mergeSort(data,temp,l,mid);
		mergeSort(data,temp,mid+1,r);
		for(int i=l;i<=r;i++){
			temp[i]=data[i];
		}
		int i1=l;
		int i2=mid+1;
		for(int cur=l;cur<=r;cur++){
			if(i1==mid+1)
				data[cur]=temp[i2++];
			else if(i2>r)
				data[cur]=temp[i1++];
			else if(temp[i1]<temp[i2])
				data[cur]=temp[i1++];
			else
				data[cur]=temp[i2++];
		}
	}

}
