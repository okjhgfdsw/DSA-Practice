import java.util.*;
public class G_palimdromeTriangleABCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n-1;i++){
           for(int j=0;j<=n-i;j++){
            System.out.print(" ");
           }
           char letter='A';
           for(int k=0;k<=i;k++){
            
            System.out.print(letter);
            letter++;
           }
           letter-=2;
           for(int l=0;l<i;l++){
             System.out.print(letter);
            letter--;
           }

              System.out.println();

        }
    }
}
