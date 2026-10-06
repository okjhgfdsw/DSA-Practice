public class sumofallele {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
             sum=sum+arr[i];
        // int i=0;
        //    while(i<=arr.length-1){
        //     sum=sum+arr[i];
        //     i++;
        } System.out.print(sum);
        System.out.println();
         int count=0;// if initiate in loop then wrong
        for(int i=0;i<=arr.length-1;i++){ //loop is completly different world
           if(arr[i] % 2!=0){
            count++;
            }
        }System.out.print(count);
       


    }
     
}
