// SEARCH FOR AN ELEMENT IN THE ARRAY AND RETURN YES IF IT IS FOUND ELSE NO


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
        boolean found = FoundElement(arr,key);
        if (found){
            System.out.println("YES,ELEMENT FOUND");
        }else{
            System.out.println("ELEMENT NOT FOUND");
        }
    }
    public static boolean FoundElement(int[] arr,int key){
      for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
          return true;
        }
      }
      return false;
    }
}
