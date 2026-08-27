public class Main
{
	public static void main(String[] args) {
	    int n=5;
	   
	for(int i=1;i<=n;i++){     //loop1 for rows
	    for(int j=1;j<=n+1-i;j++){ //if you have to print num from 1 hence i=1 and j=1 
	        	System.out.print(j);//so for 1-5 ------5+1-1 According to condition in for loop
	    }System.out.println();//here we do +1 we do -1 if we start from 0 like previous Q 
	}
	}
}
// 12345
// 1234
// 123
// 12
// 1
