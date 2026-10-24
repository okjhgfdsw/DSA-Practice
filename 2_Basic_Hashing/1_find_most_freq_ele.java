import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};

        // STEP 1: Count frequencies using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];

            if (map.containsKey(currentNum)) {
                int oldCount = map.get(currentNum);
                map.put(currentNum, oldCount + 1);
            } else {
                map.put(currentNum, 1);
            }
        }

        // STEP 2: Find the element with the maximum frequency
        // (If tied, keep the smaller number)
        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (int number : map.keySet()) {
            int freq = map.get(number);

            // Case 1: Found a number with a STRICTLY HIGHER frequency
            if (freq > maxFreq) {
                maxFreq = freq;
                result = number;
            } 
            // Case 2: TIE in frequency -> Pick the SMALLER number
            else if (freq == maxFreq) {
                if (number < result) {
                    result = number;
                }
            }
        }

        System.out.println("Most frequent element: " + result);
    }
}
