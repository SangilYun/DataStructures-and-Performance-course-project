package guimodule;

import java.util.Arrays;

public class selection_sort {

	public static void main(String[] args) {
		int[] arr = {2,16,28,56,39,40};
		
		for(int i=0; i<arr.length-1; i++) { // don't need to check the last element.
			int minIdx = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}
}
