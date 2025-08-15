// LINEAR SEARCH FOR AN ELEMENT IN 2D ARRAY
// SEARCH IN 2D arrays

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }        
        }
        int key=in.nextInt();
        int[] indices=FindElement(arr,key);
        
        
        if (indices[0]!=-1){
            System.out.println("ELEMENT FOUND AT "+indices[0]+" Row and "+indices[1]+" Column");
        }else{
            System.out.println("ELEMENT NOT FOUND");
        }
        
    }
    
    public static int[] FindElement(int[][] arr,int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if (arr[i][j]==key){
                    return new int[]{i,j};
                }      
            }        
        }
        return new int[]{-1,-1};
    }
}
