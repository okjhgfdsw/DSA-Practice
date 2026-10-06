import java.util.*;
public class A_basicHashMap {
//this predefine but you can implement it
    public static void main(String[] args) {
       HashSet<Integer> number=new HashSet<>(); //only when all elements are unique
       number.add(10);
       number.add(20);
       number.add(10); // duplicate element will not considered
       number.add(30);
       System.out.println(number.size());
       if(number.contains(20)){
        System.out.println("yes");
       }
       HashMap<String,Integer> numbers=new HashMap<>(); //It has duplicate element and value may be same
       numbers.put("Aman",90);
        numbers.put("Sagar",85);
         numbers.put("Avinash",90);
       System.out.println(numbers.size());
        System.out.println(numbers.get("Aman"));
        if (numbers.containsKey("Aman")) {
            System.out.println("Aman is in the database.");
        }



    }
}