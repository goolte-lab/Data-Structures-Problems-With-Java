package dsquestions.dp;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {
    static Map<Integer,Integer> hm=new HashMap<>();
    public static int climbStairs(int n) {
        if(n==0)return 1;
        if(n<0)return 0;
        if(hm.containsKey(n))return hm.get(n);
        int n1=climbStairs(n-1);
        int n2=climbStairs(n-2);
        hm.put(n,n1+n2);
        return n1+n2;
    }

    public static void main(String[]args){
        System.out.println(climbStairs(3));
    }
}
