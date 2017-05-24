import java.util.*;
import static java.util.stream.Collectors.toList;

public class B01_avoid_mutability_Sample {
  public static void main(String[] args) { 
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    //double the even numbers and put them into a list

    // List<Integer> doubleOfEven = new ArrayList<>();
    // for(int e : numbers) {
    //   if(e % 2 == 0)
    //     doubleOfEven.add(e * 2);
    // }
    // System.out.println(doubleOfEven);
                                   
    
    List<Integer> doubleOfEven = new ArrayList<>();
    numbers.stream()
           .filter(e -> e % 2 == 0)
           .map(e -> e * 2)
           .forEach(e -> doubleOfEven.add(e));
    //shared mutability is pure evil
    //any hopes of making this concurrent just disappeared.
    
    System.out.println(
      numbers.stream()
             .filter(e -> e % 2 == 0)
             .map(e -> e * 2)
             .collect(toList()));
    
    //we avoid explicit mutability by using 
    //library of functions.
  } 
}
