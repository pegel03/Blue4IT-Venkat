import java.util.*;
import static java.util.stream.Collectors.joining;

public class B09_lab_Solution {
  public static void main(String[] args) { 
    List<String> names = Arrays.asList("Alice", "Bruce", "Jane", "Andrew",
     "Jake", "Kim", "Paul", "Mike");
    
    System.out.println(
      names.stream()
           .map(name -> name.substring(0, 1))
           .sorted()
           .collect(joining()));
  } 
}
