package guimodule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyBuiltInSortingTest {

	public static void mysterySort(int[] vals) {
		int currInd;
		for(int pos=1; pos<vals.length;pos++) {
			currInd = pos;
			while(currInd>0 && vals[currInd] < vals[currInd-1]) {
				swap(vals, currInd, currInd-1);
				currInd = currInd-1;
			}
		}
	}
	
	public static void swap(int[] vals, int from, int to) {
		int temp = vals[from];
		vals[from]=vals[to];
		vals[to]=temp;
	}
	public static void main(String[] args) {
		Random random = new Random();

		int[] arr = new int[] {53,42,1,20,39,13};
		mysterySort(arr);
		System.out.println("New array after builtin sort" + 
				Arrays.toString(arr));
		
		
		
		List<Integer> numsToSort = new ArrayList<Integer>();
		for(int i=0; i<5; i++) {
			numsToSort.add(random.nextInt(100));
		}
		Collections.sort(numsToSort);
		System.out.println("New List after builtin sort" + 
				numsToSort.toString());

		
	}
}
