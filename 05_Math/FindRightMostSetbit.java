// find Rightmost set bit of a number


public class Main
{
	public static void main(String[] args) {
	    int n=8;  // 1000
	    System.out.print(n&(-n)); // 1000 & 1000 = 1000 ->8
	}
}
