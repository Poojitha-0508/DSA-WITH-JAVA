

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[][] arr={{1,1,0},{1,0,1},{0,0,0}};
	    flip(arr);
	    for(int[] num:arr){
	        for(int i:num){
	            System.out.println(i);
	        }
	    }
	}
	static void flip(int[][] arr){
	    for(int[] num:arr){
    	    for(int i=0;i<(arr.length+1)/2;i++){
    	        int temp=num[i]^1;
    	        num[i]=num[num.length-i-1]^1;
    	        num[num.length-i-1]=temp;
    	    }
	    }
	 	return ;

	}
}
