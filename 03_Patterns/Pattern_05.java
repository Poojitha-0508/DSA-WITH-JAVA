import java.util.*;

public class Main
{
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
		for(int i=1;i<=(2*n);i++){
		    int col=i>n ? (2*n)-i : i;
		    for(int j=1;j<=col;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}

	}
}
