// FIND THE MAXIMUM ELEMENT IN THE GIVEN ARRAY USING LINEAR SEARCH


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println (FindMaximum(arr));
    }
    public static int FindMaximum(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
      return max;
    }
}
