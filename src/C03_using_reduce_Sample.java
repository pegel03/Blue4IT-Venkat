import java.util.*;

public class C03_using_reduce_Sample {
  public static void main(String[] args) { 
    List<String> names = Arrays.asList("Alice", "Bruce", "Jane", "Andrew",
     "Jake", "Kim", "Paul", "Mike");
                   
    System.out.println(
      names.stream()
           .map(String::length)
           .reduce(0, (total, length) -> total + length));
//           .reduce(0, (total, length) -> Integer.sum(total, length)));
//           .reduce(0, Integer::sum));
// all reduce functions result to the same.

      //reduce uses BiFunction<U, T, U>
      //the output of the function, feedsback into the function
      //for further processing until all elements process

     System.out.println(
       names.stream()
            .mapToInt(String::length)
            .sum());
    
  } 
}
