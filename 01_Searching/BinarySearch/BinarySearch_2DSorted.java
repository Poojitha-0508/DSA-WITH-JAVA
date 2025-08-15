// BINARYSEARCH TO FIND ANA ELEMENT IN A COMPLETELY SORTED MATRIX

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=in.nextInt();
            }        
        }
        int target=in.nextInt();
        System.out.println(Arrays.toString(FindElement(matrix,target)));
        
    }
    
    public static int[] FindElement(int[][] matrix,int target){
        int rows=matrix.length,cols=matrix[0].length;
        if(cols==0){
            return new int[]{-1,-1};

        }
        if(rows==1){
            return BinarySearch(matrix,target,0,0,cols-1);
        }
        int rowStart=0,rowEnd=matrix.length-1;
        int colStart=0,colEnd=matrix[0].length-1;
        int colMid=(colStart+colEnd)/2;
        
        while(rowStart<(rowEnd-1)){
            int rowMid=(rowStart+rowEnd)/2;
            if(matrix[rowMid][colMid]==target){
                return new int[]{rowMid,colMid};
            }
            if(matrix[rowMid][colMid]>target){
                rowEnd=rowMid;
            }else{
                rowStart=rowMid;
            }
        }
        
        if(target==matrix[rowStart][colMid]){
            return new int[]{rowStart,colMid};
        }
        if(target==matrix[rowStart+1][colMid]){
            return new int[]{rowStart+1,colMid};
        }
        
        
        if(target<=matrix[rowStart][colMid-1]){
            return BinarySearch(matrix,target,rowStart,0,colMid-1);
        }
        if(target>=matrix[rowStart][colMid+1] && target<=matrix[rowStart][colEnd]){
            return BinarySearch(matrix,target,rowStart,colMid+1,colEnd);
        }
        if(target>=matrix[rowStart+1][colMid-1] ){
            return BinarySearch(matrix,target,rowStart+1,0,colMid-1);
        }
        if(target>=matrix[rowStart+1][colMid+1] && target<=matrix[rowStart+1][colEnd]){
            return BinarySearch(matrix,target,rowStart+1,colMid+1,colEnd);
        }
        return new int[]{-1,-1};

    }
    static int[] BinarySearch(int[][] matrix,int target,int row,int colStart,int colEnd){
		while(colStart<=colEnd){
			int mid=(colStart+colEnd)/2;
			if(matrix[row][mid]==target){
				return new int[]{row,mid};
			}
			else if (matrix[row][mid]>target){
				colEnd=mid-1;
			}
			else{
				colStart=mid+1;
			}
		}
		return new int[]{-1,-1};
	}
}
