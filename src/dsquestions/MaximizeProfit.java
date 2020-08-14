package dsquestions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class MaximizeProfit {

	static class Pair {
		int index;
		int value;

		Pair(int index, int value) {
			this.index = index;
			this.value = value;
		}
	}

	public static int maximizeProfit(int input1, int[] input2, int[] input3, int input4, int input5) {

		TreeMap<Integer, Integer> first=new TreeMap<>(Collections.reverseOrder());
        TreeMap<Integer, Integer> second=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<input1;i++) {
            first.put(input2[i],i+1);
            second.put(input3[i],i+1);
        }
        System.err.println(first.toString());
        System.err.println(second.toString());
        int s=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;!(i>=input1||(input4<=0&&input5<=0));i++) {
            int input4Key= first.firstEntry().getValue();
            int input5Key= second.firstEntry().getValue();
            if((input4>0 && first.firstEntry().getKey()>second.firstEntry().getKey())|| (input5<=0 && input4>0)) {
            	System.err.println("Index from first"+i);
               if(!set.contains(input4Key)) {
                s+=first.firstEntry().getKey();
                input4--;
                first.remove(first.firstEntry().getKey());
                set.add(input4Key);
               }
               else {
            	   first.remove(first.firstEntry().getKey());
				
			}
            }else {
            	System.err.println("Index from second"+i);
                if(!set.contains(input5Key)) {
                s+=second.firstEntry().getKey();
                input5--;
                second.remove(second.firstEntry().getKey());
                set.add(input5Key);
                }
                else {
                	second.remove(second.firstEntry().getKey());
				}
            }

        }
        return s;
	}

	public static void main(String[] args) {
		int input1 = 8;
		int[] input2 = { 9133, 4829,2641,5516,2857,847,8722,7176};
		int[] input3 = { 4606,2752,3447,6298,2713,9448,2316,4898};
		int input4 = 0;
		int input5 = 4;
		System.err.println(maximizeProfit(input1, input2, input3, input4, input5));

	}

}
