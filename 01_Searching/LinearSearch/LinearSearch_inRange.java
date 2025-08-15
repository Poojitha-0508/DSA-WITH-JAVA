// SEARCH FOR AN ELEMENT WITHIN A SPECIFIED RANGE IN THE ARRAY 


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int start=in.nextInt();
        int end=in.nextInt();
        int key=in.nextInt();
        int index=FindElement(arr,key,start,end);
        
        if (index!=-1){
            System.out.println("ELEMENT FOUND AT "+index+"th position");
        }else{
            System.out.println("ELEMENT NOT FOUND");
        }
    }
    public static int FindElement(int[] arr,int key,int start,int end){
        for(int i=start-1;i<end+1;i++){
            if (arr[i]==key){
                return i;
            }
        }
      return -1;
    }
}
