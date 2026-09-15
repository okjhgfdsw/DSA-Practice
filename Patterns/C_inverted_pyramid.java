public class C_inverted_pyramid
{
	public static void main(String[] args) {
	   
	    int n=9;
		for(int i=0;i<n;i++){
		    for(int j=n;j>n-i;j--){
		        System.out.print(" ");
		    }
		    for(int k=0;k<n-i;k++){
		         System.out.print("* ");
		    }
		    
		    System.out.println();
		}
	}
}

// OUTPUT:
// * * * * * * * * * 
//  * * * * * * * * 
//   * * * * * * * 
//    * * * * * * 
//     * * * * * 
//      * * * * 
//       * * * 
//        * * 
//         * 
