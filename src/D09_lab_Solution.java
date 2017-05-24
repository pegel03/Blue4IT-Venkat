import java.util.*;
import java.util.function.*;

public class D09_lab_Solution {
  public static void main(String[] args) { 
    // Function<Integer, Predicate<String>> nameOfLength =
    //   (Integer length) -> {
    //     Predicate<String> checkLength = 
    //       (String name) -> name.length() == length;
    // 
    //   return checkLength;
    // }; 

    Function<Integer, Predicate<String>> nameOfLength =
      length -> name -> name.length() == length;

    List<String> names = Arrays.asList("Alice", "Bruce", "Jane", "Andrew",
     "Jake", "Kim", "Paul", "Mike");
    
    System.out.println("Names of Length 4:");  
    names.stream()
         .filter(nameOfLength.apply(4))
         .forEach(System.out::println);

    System.out.println("Names of Length 5:");  
    names.stream()
         .filter(nameOfLength.apply(5))
         .forEach(System.out::println);    
  } 
}
