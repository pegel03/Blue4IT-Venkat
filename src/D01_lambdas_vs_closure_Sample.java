import java.util.*;

public class D01_lambdas_vs_closure_Sample {
  public static void main(String[] args) { 
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    numbers.forEach(e -> System.out.println(e * 2));     
    //above is a lambda expression

    int factor = 3;

    numbers.forEach(e -> System.out.println(e * factor));
    //has a factor which is not defined within the lambda expression
    //so this lambda has to close-over the defining scope
    //to bind to the factor variable.
    
    //because it has to close-over, it is called a
    //closure.
    
    //that scope is called lexical scoping.
    
    
    //lambda are stateless
    //closure carry a state with them.
  } 
}

