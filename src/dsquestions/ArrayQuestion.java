package dsquestions;

public class ArrayQuestion {
	/*
	 * Input-{ 4, 3, 7, 8 }; 
	 * Output- 3 4 7 8 
	 * Input-{ 4, 1, 3, 7, 6, 8, 5, 2, 10, 9, 11, 12,13 };
	 * Output-{5 4 1 3 7 6 8 2 10 9 11 12 13}
	 */
	private static int[] processArray(int input1, int input2, int[] arr) {
		if(input2>arr.length)
			input2=input2%arr.length;
		if(input2==0)
			return arr;
		int x = arr[input2 - 1];
		int i;
		for (i = input2 - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[i] = x;
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 4,3,7,8};
		int arr1[] = { 4, 1, 3, 7, 6, 8, 5, 2, 10, 9, 11, 12, 13 };
		int temp[];
		temp = processArray(4, 10, arr);
		temp = processArray(10, 7, arr1);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
