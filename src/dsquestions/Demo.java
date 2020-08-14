package dsquestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo {
	public static void main(String... args) {

		int input1 = 20;
		int input2 = 1;
		int input3[] = { 1, 7 };
		int arr[] = { 1, 0, 3, 0, 0, 6, 6, 6, 6 };
		int []tree = new int[arr.length];
		insertLevelOrder(arr,0,tree);
		System.err.println(Arrays.toString(tree));
//		System.err.println(Arrays.toString(cal(input1, input3)));

	}

	public static int[] cal(int input1, int[] input3) {
		int arr[] = IntStream.rangeClosed(0, input1).toArray();
		System.err.println(Arrays.toString(arr));
		for (int x : input3) {
			if (x == 1) {
				return new int[] { 0 };
			}
			delete(arr, x);
		}
		return Arrays.stream(arr).filter(x -> x != 0).toArray();
	}

	static void delete(int[] arr, int pos) {
		if (pos < arr.length) {
			arr[pos] = 0;
			delete(arr, pos * 2);
			delete(arr, pos * 2 + 1);
		}
	}
	
	public static void insertLevelOrder(int[] arr, int i,int []tree) {
		
		// Base case for recursion 
		
		if (i < arr.length) {
			if(arr[i]!=0)
			tree[i]=arr[i];
			insertLevelOrder(arr, 2 * i+1,tree);
			insertLevelOrder(arr,  2 * i + 2,tree);
		}
	}

}
