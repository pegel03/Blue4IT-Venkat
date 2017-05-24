import java.util.*;

public class C01_filter_Sample {
  public static void main(String[] args) { 
    List<String> names = Arrays.asList("Alice", "Bruce", "Jane", "Andrew",
     "Jake", "Kim", "Paul", "Mike");

    names.stream()
         .filter(name -> name.startsWith("A"))
         .forEach(System.out::println);
                                       
    //filter:
    //takes Predicate<T> when called on Stream<T>
    //The result is a subset of the input
    //0 <= # of output <= # of input
  } 
}
