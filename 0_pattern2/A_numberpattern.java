import java.util.Scanner;

public class A_numberpattern {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int space=2*(n-1);
        for(int i=1;i<=n;i++){

         for(int j=1;j<=i;j++) {
          System.out.print(j);
         }
         for(int k=1;k<=space;k++){
           System.out.print(" ");
         }
         for(int l=i;l>=1;l--){
          System.out.print(l);
         }
          System.out.println();
          space=space-2;
    }
}
}
