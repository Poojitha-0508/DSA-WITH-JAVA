import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
        for(int i=1;i<=n;i++){  // n rows
            for (int j=1;j<=(2*n)-1;j++){  //2n-1 cols 
                if (i==n){
                    System.out.print("*");
                }
                else{
                    if (j<=n){
                        if (i+j==n+1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    else{
                        if ((j-n+1)==i){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println ();
        }
    }
}
