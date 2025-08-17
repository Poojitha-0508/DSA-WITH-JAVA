import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
        for(int i=1;i<=(2*n)-1;i++){  // n rows
            for (int j=1;j<=(2*n)-1;j++){  //2n-1 cols 
                if(i+j==n+1 || j-n+1==i || i-n+1==j || (3*n)-i-1==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println ();
        }
    }
}
