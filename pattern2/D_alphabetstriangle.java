import java.util.*;
public class D_alphabetstriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            char letter=(char)('A'+n-i);
            for(int j=0;j<i;j++){
System.out.print((char) (letter+j));
            }System.out.println();
        }
        for(int i=0;i<n;i++){
            char letter=(char)('A'+i);
            for(int j=0;j<=i;j++){
System.out.print((char) (letter));
            }System.out.println();
        }
    }
}
