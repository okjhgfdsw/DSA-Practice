import java.util.*;
public class B_numbox {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size=2*n-1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top=i; // i stand for first row
                int left=j; // j stand for first column
                int bottom=size-1-i; //
                int right=size-1-j;
                int num=Math.min((Math.min(top,bottom)),(Math.min(left,right)));
                System.out.print(n-num);
            }System.out.println();
        }
    }
}
