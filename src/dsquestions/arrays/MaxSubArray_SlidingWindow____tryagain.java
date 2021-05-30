package dsquestions.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray_SlidingWindow____tryagain {

    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        int i=0;
        int j=0;
        ArrayList<Integer> result=new ArrayList<>();
        List<Integer> maxWindow=new ArrayList<>(n-k+1);
        while(j<n) {
            if (maxWindow.get(i) == null) {
                maxWindow.set(i, arr[j]);
            } else {
                maxWindow.set(i, Math.max(maxWindow.get(i), arr[j]));
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                result.add(maxWindow.get(0));
                if (arr[i] == maxWindow.get(0)) {
                    maxWindow.remove(0);
                }
                i++;
                j++;
            }
        }
            return result;

        }

    public static void main(String[]args){
        System.out.println(max_of_subarrays(new int[]{1,2,3,1,4,5,2,3,6},9,3));

    }
}
