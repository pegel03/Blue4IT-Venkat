//Let's convert this code from imperative to functional style

public class E09_lab_Sample_ORG {
  public static int fibonacciAt(int position) {
     int current = 1;
     int previous = 1;
     
     for(int i = 2; i <= position; i++) {
       int temp = previous;
       previous = current;
       current = current + temp;
     } 
     
     return current;
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

