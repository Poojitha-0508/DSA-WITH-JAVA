public class Main
{
	public static void main(String[] args) {
	    int n=6; // 110
	    int i=3; //Reset 3rd bit (1->0 or 0->1)
	    System.out.println(n^(1<<(i-1))); // 110 ^ 100 -> 010 = 2
	}
}
