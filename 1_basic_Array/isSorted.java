import java.util.*;
public class isSorted {
    static boolean sorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }return true;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
      int[] arr=new int[n]; // never initiate globle variable in loop
    for(int i=0;i<n;i++){
  arr[i]=sc.nextInt();
    }
    System.out.print(sorting(arr));
}
    
}

//logic which i learned here
//boolean return true false we can simply print it by put it function
//in sout
//logic-for arr[i] > arr[i] return true false ex for 5 element
//for loop run for 0 1 2 3 iteration becoz i+1 hai arrayoutofbound nahi hona chaiye