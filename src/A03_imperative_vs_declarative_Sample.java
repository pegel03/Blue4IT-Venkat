import java.util.*;

public class A03_imperative_vs_declarative_Sample {
  public static void main(String[] args) { 
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                     
    //Imperative style
    int total = 0;          
    for(int e : numbers) {
      total += e * 2;
    }
    System.out.println(total); 
    
    //two smells of imperative style
    //1. mutability
    //2. telling what and how
    
    //declarative style
    //avoid explicit mutability
    //avoid telling how
    
    System.out.println(
      numbers.stream()
             .mapToInt(e -> e * 2)
             .sum());
    
  } 
}
