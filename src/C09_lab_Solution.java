import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class C09_lab_Solution {
  public static Stream<Integer> factors(int number) {
    return IntStream.rangeClosed(1, number)
                    .filter(i -> number % i == 0)
                    .boxed();
  } 
  
  public static void main(String[] args) { 
    List<Integer> numbers = Arrays.asList(1, 7, 8, 4, 9, 11, 18, 25);
    List<String> names = Arrays.asList("Alice", "Bruce", "Jane", "Andrew",
            "Jake", "Kim", "Paul", "Mike");

    System.out.println(
      numbers.stream()
             .flatMap(C09_lab_Solution::factors)
             .distinct()
             .sorted()
             .collect(toList()));

    // namen deel:
    System.out.println(
            names.stream()
                    .map(String::length)
                    .reduce(0, Integer::sum)
    );
    Function<String, Predicate<String>> filteren =
            l -> name -> name.startsWith(l);

    names.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);
    names.stream().filter(filteren.apply("A")).forEach(System.out::println);

    names.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);

    System.out.println(
            names.stream()
                    .flatMap(s -> Stream.of(s.split("")))
                    .collect(toList())
    );
  }
}

