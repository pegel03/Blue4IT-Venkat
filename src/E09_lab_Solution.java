import java.util.stream.*;

public class E09_lab_Solution {
  private static int[] computeNext(int[] pair, int[] ignore) {
      return new int[] { pair[1], pair[0] + pair[1] };
  }

  public static int fibonacciAt(int position) {
    return  
      IntStream.rangeClosed(0, position)
               .mapToObj(i -> new int[]{})
               .reduce(new int[]{1, 0}, 
                  E09_lab_Solution::computeNext)[1];
  } 
  
  public static void main(String[] args) { 
    System.out.println(fibonacciAt(0)); // 1
    System.out.println(fibonacciAt(1)); //1
    System.out.println(fibonacciAt(2)); //2
    System.out.println(fibonacciAt(3)); //3
    System.out.println(fibonacciAt(5)); //8
    System.out.println(fibonacciAt(10)); //89
    System.out.println(fibonacciAt(21)); //17711
  } 
}

