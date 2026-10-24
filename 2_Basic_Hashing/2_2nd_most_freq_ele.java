import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={56,56,56,63,63,72};
        HashMap<Integer,Integer> map=new HashMap<>();
        //hashmap predefine function used
        for(int i=0;i<arr.length;i++){
            int currentnum=arr[i];

 //Count frequency if already present change vlues key remain same
            if(map.containsKey(currentnum)){
                int oldcount=map.get(currentnum);
                int newcount=oldcount+1;
                map.put(currentnum,newcount);
            }            //first time puting keys and values
            else{
                map.put(currentnum,1);
            }
            
        }



        //find highest and secondhigest yaha real logic check hoga
        int maxfreq=-1;
        int secondmaxfreq=-1;

        for(int number:map.keySet()){
            int freq=map.get(number);
        //ex suppose freq=3 > maxfreq=-1 yes
            //secondmaxfreq=-1;
            //maxfreq=3
            //at next iteration it will 3=3 both if else failed
            //so freq=2 now else 2<3 && 2>-1
            //secondmaxfreq=2;
            //here if now you have freq=1 it not change result
            //because of this (freq>secondMaxfreq)
           if(freq>maxfreq) {
               secondmaxfreq=maxfreq; 
               //old higest become second higest
               maxfreq=freq;
               //now update the new higest freq
           }else if(freq<maxfreq && freq> secondmaxfreq){
               secondmaxfreq=freq;
           }
            
        }//If no second highest frequency exists, result is -1
        if (secondmaxfreq == -1) {
            System.out.println("Result: -1");
            return;
        }

// STEP 4: Find the smallest number that has the second highest frequency
        int result = Integer.MAX_VALUE;

        for (int number : map.keySet()) {
            int freq = map.get(number);

            if (freq == secondmaxfreq) {
                if (number < result) {
                    result = number; // Keep the smaller number
                }
            }
        }

        System.out.println("Result: " + result);


        
    }
}
