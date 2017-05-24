import java.util.*;

public class E01_being_lazy_Sample {
  public static void main(String[] args) { 
    List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);
    
    //find the double of the first even number greater than 3
    
    int result = 0;          
    for(int e : numbers) {
      if(e > 3 && e % 2 == 0) {
        result = e * 2;
        break;
      }
    }
    System.out.println(result); 
    
    //For the given problem, there are 8 units of work
    
    System.out.println(
      numbers.stream()
             .filter(E01_being_lazy_Sample::isGT3)
             .filter(E01_being_lazy_Sample::isEven)
             .map(E01_being_lazy_Sample::doubleIt)
             .findFirst());

    //this may be 21 operations instead of 8
    //and if we increase the length, this will get worse.

    //Some languages do this better than other.
    //those language will take 8 steps for this problem as well.
  } 
  public static boolean isGT3(int number) { 
    System.out.println("isGT3 called for " + number);
    return number > 3;
  }
  public static boolean isEven(int number) {
    System.out.println("isEven called for " + number);
    return number % 2 == 0;
  }
  public static int doubleIt(int number) {
    System.out.println("doubleIt called for " + number);
    return number * 2;
  }
}