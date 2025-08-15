// FIND MINIMUM ELEMENT IN THE ARRAY 


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println (FindMinimum(arr));
    }
    public static int FindMinimum(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
