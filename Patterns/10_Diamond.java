import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   
	    int n=9;
	    for(int i=1;i<=n;i++){
		    for(int j=1;j<=n-i;j++){
		        System.out.print(" ");
		    }
		    for(int k=0;k<i;k++){
		         System.out.print("* ");
		    }
		    System.out.println();
		}
		for(int l=0;l<n;l++){
		    for(int m=n;m>n-l;m--){
		        System.out.print(" ");
		    }
		    for(int o=0;o<n-l;o++){
		         System.out.print("* ");
		    }
		    
		    System.out.println();
		}
	}
}
// output:
//         * 
//        * * 
//       * * * 
//      * * * * 
//     * * * * * 
//    * * * * * * 
//   * * * * * * * 
//  * * * * * * * * 
// * * * * * * * * * 
// * * * * * * * * * 
//  * * * * * * * * 
//   * * * * * * * 
//    * * * * * * 
//     * * * * * 
//      * * * * 
//       * * * 
//        * * 
//         * 
