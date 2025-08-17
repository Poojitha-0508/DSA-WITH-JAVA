// AN ARRAY HAS NUMBERS WITH TWO OCCURENCES BUT ONLY ONE NUMBER HAS A SINGLE OCCURENCE.FIND THE NUMBER


public class Main
{
	public static void main(String[] args) {
	    int[] arr={2,3,2,3,4,4,5,6,6};
	    int xor=0;
	    for(int num:arr){
	        xor=xor^num;
	    }
	    System.out.println(xor);
	}
}
