// AN ARRAY CONSITING NUMBERS +VE AND -VE SIGNS, AND ONLY ONE NUMBER APPEARS WITH ONE SIGN. IDENTIFY IT

public class Main
{
	public static void main(String[] args) {
	    int[] arr={-2,3,2,-3,-4,4,5,-6,6};
	    int sum=0;
	    for(int num:arr){
	        sum=sum+num;
	    }
	    System.out.println(sum);
	}
}
