package testxx;

import java.util.*;

public class test2 {
	public String usersLike(String input){
        String[] inputs = input.split("\n");
        int len = Integer.parseInt(inputs[0]);
        String[] stimes = inputs[1].split(" ");
        int[] times = new int[len];
        for(int i = 0;i<len;i++){
            times[i] = Integer.parseInt(stimes[i]);
        }
        int q = Integer.parseInt(inputs[2]);
        int[] output = new int[q];
        for(int i =0;i<q;i++){
            String[] search = inputs[i+3].split(" ");
            int l = Integer.parseInt(search[0]);
            int r = Integer.parseInt(search[1]);
            int k = Integer.parseInt(search[2]);
            int count = 0;
            for(int j = l; j<=r;j++){
                if(times[j-1]==k) count++;
            }
            output[i] = count;
        }
        String res = ""+output[0];
        for(int i = 1;i<q;i++) res = res+"\n"+output[i];
        return res;
    }
    public static void main(String[] args) {
    		test2 tt= new test2();
    		String x = "5\n1 2 3 3 5\n3\n1 2 1\n2 4 5\n3 5 3";
    		System.out.println(tt.usersLike(x));
    }
}