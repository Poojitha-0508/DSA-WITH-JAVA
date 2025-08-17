public class Main
{
	public static void main(String[] args) {
	    int number=3;
	    int power=6;
	    int ans=1;
	    while (power>0){
	        if((power&1)==1){
	            ans*=number;
	        }
	        power=power>>1;
	        number*=number;
	    }
	    System.out.println (ans);
	}
}
