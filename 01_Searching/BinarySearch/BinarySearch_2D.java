// BINARY SEARCH TO FIND AN ELEMENT IN 2D ARRAY WHEN ALL ROWS AND ALL COLUMNS ARE SORTED
/*
EX:
{{10,25,38,43},
 {15,27,39,49},
 {17,29,49,50},
 {18,34,47,52}}
*/

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
        System.out.println(Arrays.toString(FindElement(arr,key)));
        
    }
    
    public static int[] FindElement(int[][] arr,int key){
        int row=0,col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if (arr[row][col]==key){
                return new int[]{row,col};
            }
            if(arr[row][col]>key){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};

    }
}
