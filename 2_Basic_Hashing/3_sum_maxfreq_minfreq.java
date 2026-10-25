// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
       int arr[]={1,2,2,3,3,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int currentnum=arr[i];
            int oldcount=0;
            int newcount=0;
            if(map.containsKey(currentnum)){
                oldcount=map.get(currentnum);
                
                map.put(currentnum,oldcount+1);
            }else{
                map.put(currentnum,1);
            }
        }
        int maxfreq=Integer.MIN_VALUE;
        int minfreq=Integer.MAX_VALUE;
        
        for(int num:map.keySet()){
            int freq=map.get(num);
            if(freq>maxfreq){
                maxfreq=freq;
            }
            if(freq<minfreq){
                minfreq=freq;
            }
        }
        System.out.print(minfreq+maxfreq);
    }
}
// Step 3: Step-by-Step Loop Execution
// Iteration 1: freq = 1
// First if check (for maxFreq):

// Is 1 > -2147483648? YES

// Update: maxFreq = 1

// Second if check (for minFreq):

// Is 1 < 2147483647? YES

// Update: minFreq = 1

// State at end of Iteration 1: maxFreq = 1, minFreq = 1

// Iteration 2: freq = 2
// First if check (for maxFreq):

// Is 2 > 1 (current maxFreq)? YES

// Update: maxFreq = 2

// Second if check (for minFreq):

// Is 2 < 1 (current minFreq)? NO

// minFreq stays 1.

// State at end of Iteration 2: maxFreq = 2, minFreq = 1

// Iteration 3: freq = 3
// First if check (for maxFreq):

// Is 3 > 2 (current maxFreq)? YES

// Update: maxFreq = 3

// Second if check (for minFreq):

// Is 3 < 1 (current minFreq)? NO

// minFreq stays 1.

// State at end of Iteration 3: maxFreq = 3, minFreq = 1
