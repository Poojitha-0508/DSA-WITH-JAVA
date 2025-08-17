// FIND XOR OF ALL NUMBERS FROM A TO B


public class Main
{
	public static void main(String[] args) {
	    int a=3,b=9;
	    System.out.println(findXOR(b)^findXOR(a-1));
	}
	static int findXOR(int n){
	    if(n%4==0){
	        return n;
	    }
	    else if(n%4==1){
	        return 1;
	    }else if(n%4==2){
	        return n+1;
	    }else{
	        return 0;
	    }
	}
}
