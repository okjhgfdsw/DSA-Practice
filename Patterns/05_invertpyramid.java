public class Main
{
	public static void main(String[] args) {
	    int n=5;
	   //always try to use i=0 amd n-1 in looping problem to avoid complexity
	for(int i=0;i<=n-1;i++){     //loop1 for rows
	    for(int j=0;j<=n-1-i;j++){ // loop2 have logic n-1-i dont do i-- 
	        	System.out.print("*");
	    }System.out.println();
	}
	}
}
// *****
// ****
// ***
// **
// *
