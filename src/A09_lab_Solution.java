import java.util.stream.*;

public class A09_lab_Solution {
  public static boolean isPrime(long number) {
    // boolean divisible = false;
    // 
    // for(long i = 2; i < number; i++) {
    //   if(number % i == 0) {
    //     divisible = true;
    //     break;
    //   }
    // }
    // 
    // return number > 1 && !divisible;
    
    return number > 1 &&
      LongStream.range(2, number)
                .noneMatch(i -> number % i == 0);
  }
    
  public static long totalOfPrimeNumbersUntil(long number) {
    // long result = 0;
    // 
    // for(long i = 1; i <= number; i++) {
    //   if(isPrime(i)) result += i;
    // }                            
    // 
    // return result;
    return LongStream.rangeClosed(1, number)
                     .filter(A09_lab_Solution::isPrime)
                     .sum();
  } 
  
  public static void main(String[] args) { 
    System.out.println(totalOfPrimeNumbersUntil(10000));
  } 
}
