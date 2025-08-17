public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=(2*n)-1;j++){
	            if(i+j==n+1 || i+j==2*n || (j>n && i==1) || (j<n && i==n)){
	                System.out.print("*");
	            }else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println ();
	    }
	}
}
