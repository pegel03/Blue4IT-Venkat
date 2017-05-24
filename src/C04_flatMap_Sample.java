import java.util.*;
import static java.util.stream.Collectors.*;
import java.util.stream.*;

public class C04_flatMap_Sample {
  public static void main(String[] args) { 
    List<String> names = Arrays.asList("Alice", "Bruce", "Jane", "Andrew",
     "Jake", "Kim", "Paul", "Mike");

    System.out.println(
      names.stream()
           .map(name -> name.toUpperCase())
           .collect(toList()));
                   

    System.out.println(
      names.stream()
           .map(name -> name.split(""))
           .collect(toList()));

    System.out.println(
      names.stream()
           .flatMap(name -> Stream.of(name.split("")))
           .collect(toList()));
  }
}
