public class Main
{
	public static void main(String[] args) {
	    int n=8; // 1000
	    int i=4; // Checks 4th bit is 1 or 0
	    if ((n&(1<<(i-1)))>0){ 
	        System.out.println(1);
	    }else{
	        System.out.println(0);
	    }
	}
}
