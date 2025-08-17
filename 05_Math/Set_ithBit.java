
public class Main
{
	public static void main(String[] args) {
	    int n=6; //110
	    int i=1; //set 1st bit 
	    System.out.println(n|(1<<(i-1))); //110 -> 111 = 7
	}
}
