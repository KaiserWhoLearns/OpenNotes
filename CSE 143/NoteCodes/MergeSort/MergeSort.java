import java.util.*;
public class MergeSort {
	public static void main(String[] args) {
		//int[] a = new int[];
		int a[] = {9, 6, 4, 1, 13, 15, 8, 2};
		mergeSort(a);
		for(int i = 0; i < a.length; i ++) {
			System.out.println(a[i]);
		}
	}

	public static void mergeSort(int[] arr) {
		if(arr.length > 1) {
		    int[] left = Arrays.copyOfRange(arr,0,arr.length / 2);
		    int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
		    mergeSort(left);
		    mergeSort(right);
		    merge(arr, left, right);
		}

	}

	public static void merge(int[] rlt, int[] left, int[] right) {
		int l = 0;
		int r = 0;
		for(int i = 0; i < rlt.length; i ++) {
			if(r >= right.length || l < left.length && left[l] < right[r]) {
				rlt[i] = left[l];
				l++;
			} else {
				rlt[i] = right[r];
				r++;
			}
		}
	}
}