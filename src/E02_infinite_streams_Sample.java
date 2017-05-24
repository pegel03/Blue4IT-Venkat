import java.util.*;
import java.util.stream.*;

public class E02_infinite_streams_Sample {
  public static double compute(int n, int k) {
    return Stream.iterate(n, e -> e + 1)
                 .filter(e -> e % 2 == 0)
                 .mapToDouble(Math::sqrt)
                 .limit(k)
                 .sum();
  } 
  
  public static void main(String[] args) {
    //given a number n and a count k,
    //return the total of sqrt of k even numbers
    //starting with n
    
    System.out.println(compute(51, 75));
  } 
}