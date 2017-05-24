import java.util.*;

//Given a collection of numbers, this program prints in sorted order
//the set of all the factors for the given numbers.

//Let's change this to functional style
// Doe dat ook maar met een Predicate:) Oew, Predicates geven alleen true of false terug...
// Sommeer de lengte van de namen.
// Filter de namen op A. Doe dit ook met een predicat.
// Maak de namen uppercase.
// Split de namen per letter en geeft terug als enkelvoudige list.

public class C09_lab_Sample_ORG {
  public static List<Integer> factors(int number) {
    List<Integer> result = new ArrayList<>();
    
    for(int i = 1; i <= number; i++) {
      if(number % i == 0) result.add(i);
    }                                   
    
    return result;
  } 
  
  public static void main(String[] args) { 
    List<Integer> numbers = Arrays.asList(1, 7, 8, 4, 9, 11, 18, 25);
    List<String> names = Arrays.asList("Alice", "Bruce", "Jane", "Andrew",
            "Jake", "Kim", "Paul", "Mike");

    Set<Integer> factorsOfAll = new HashSet<>();
    
    for(int number : numbers) {
      factorsOfAll.addAll(factors(number));
    }                                   
    
    List<Integer> listOfFactorsOfAll = new ArrayList<>(factorsOfAll);                   
    
    Collections.sort(listOfFactorsOfAll);                   
    
    System.out.println(listOfFactorsOfAll);
  } 
}

