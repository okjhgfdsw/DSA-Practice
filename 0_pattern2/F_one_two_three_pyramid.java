import java.util.*;
public class F_one_two_three_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for(int i=0;i<=n-1;i++){

            //for(int j=0;j<=i;j++){ 
                 for(int j=0;j<=n-1-i;j++){
             System.out.print(count+" ");
             count++;
            }System.out.println();
        }
    }
}
