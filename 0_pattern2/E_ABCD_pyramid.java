import java.util.*;
public class E_ABCD_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n-1;i++){
        
        for(int j=0;j<=n-i-1;j++){
            char letter=(char) ('A'+j); //if here put i then different pyramid 
            System.out.print(letter);
        }System.out.println();
        }
        for(int i=0;i<=n-1;i++){
        
        for(int j=0;j<=i;j++){
            char letter=(char) ('A'+j); //if here put i then different pyramid 
            System.out.print(letter);
        }System.out.println();
        }
    }
}
