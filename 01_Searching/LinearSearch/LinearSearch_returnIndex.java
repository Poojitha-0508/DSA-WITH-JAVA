// SEARCH FOR AN ELEMENT IN THE ARRAY AND RETURN IF FOUND


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int key=in.nextInt();
        int index = FindIndex(arr,key);
        if (index!=-1){
            System.out.println("ELEMENT FOUND AT "+index+"th position");
        }else{
            System.out.println("ELEMENT NOT FOUND");
        }
    }
    public static int FindIndex(int[] arr,int key){
      for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
          return i;
        }
      }
      return -1;
    }
}
