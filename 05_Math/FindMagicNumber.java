// FIND MAGIC NUMBER (EX: MAGIC NO. FOR 5 : 5 -> 101 -> 1*(5^3)+0*(5^2)+1*(5^1) -> 125 + 0 + 5 = 130)


public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    int base=5;
	    int ans=0;
	    while(n>0){
	        int last=n&1;
	        ans=ans+(last*base);
	        base=base*5;
	        n=n>>1;
	        
	    }
	    System.out.print(ans);
	}
}
