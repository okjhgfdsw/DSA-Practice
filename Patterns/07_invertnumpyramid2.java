public class Main
{
	public static void main(String[] args) {
	    int n=5;
	   
	for(int i=5;i>=1;i--){     //loop1 for rows
	    for(int j=1;j<=i;j++){ //loop2 every time phir se initiate karta from 1 when loop1 condition satisfied
	        	System.out.print(i);//to write same element in a row
	    }System.out.println();
	}
	}
}
//using both decreative for loop
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		for(int i=5;i>0;i--){
		    for(int j=5;j>n-i;j--){
		        System.out.print(i);
		    }
		    System.out.println();
		}
	}
}
// 55555
// 4444
// 333
// 22
// 1
