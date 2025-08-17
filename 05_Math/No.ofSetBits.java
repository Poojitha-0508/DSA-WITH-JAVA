public class Main
{
	public static void main(String[] args) {
	    int n=10;
	    int cnt=0;
	    while (n>0){
	        cnt++;
	        n=(n&(n-1));
	    }
	    System.out.println(cnt);
	}
}
