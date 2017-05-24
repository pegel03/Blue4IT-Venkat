import java.util.*;
import java.util.function.*;

public class D09_lab_Sample_ORG {
  public static Predicate<String> nameOfLength(int length) {
    Predicate<String> checkLength = (String name) -> name.length() == length;
    
    return checkLength;
  } 
  
  public static void main(String[] args) { 
    //In this lab, we will move the nameOfLength function from outside to
    //here within this function, to here.

    List<String> names = Arrays.asList("Alice", "Bruce", "Jane", "Andrew",
     "Jake", "Kim", "Paul", "Mike");
    
    System.out.println("Names of Length 4:");  
    names.stream()
         .filter(nameOfLength(4))
         .forEach(System.out::println);

    System.out.println("Names of Length 5:");  
    names.stream()
         .filter(nameOfLength(5))
         .forEach(System.out::println);    
  } 
}

