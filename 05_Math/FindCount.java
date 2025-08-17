// COUNT NO.OF BITS IN A NUMBER IN BASE B FORM


public class Main
{
	public static void main(String[] args) {
	    int n=25;
	    int base=16; 
	    int count= (int)(Math.log(n)/Math.log(base))+1; // FORMULA TO FIND NO.OF BITS IN N(number (25 here)) IN BASE B (16 here) 
	    System.out.println(count);
	}
}
