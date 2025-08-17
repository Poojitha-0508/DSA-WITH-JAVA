
public class Main
{
	public static void main(String[] args) {
	    int n=6; // 110
	    int i=2; // Unset 2nd bit 
	    System.out.println(n&(~(1<<(i-1)))); // 110 & 101 -> 100 = 4
	}
}
