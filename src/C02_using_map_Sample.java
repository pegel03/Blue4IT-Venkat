import java.util.*;

public class C02_using_map_Sample {
  public static void main(String[] args) { 
    List<String> names = Arrays.asList("Alice", "Bruce", "Jane", "Andrew",
     "Jake", "Kim", "Paul", "Mike");

    names.stream()
         .filter(name -> name.startsWith("A"))
         .map(String::toUpperCase)
         .forEach(System.out::println);
                                       
    //map:
    //takes Function<T, R> when called on Stream<T>
    //to return a Stream<R>
    //The result has the same number of elements  
    //Elements in output may not be elements in input
  } 
}
