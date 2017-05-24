import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//In this lab, we will avoid mutability while converting the code to functional style

public class B09_lab_Sample_ORG {
  public static void main(String[] args) {

    //double the even numbers and put them into a list
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println();


    List<String> names = Arrays.asList("Alice", "Bruce", "Jane", "Andrew",
     "Jake", "Kim", "Paul", "Mike");
     
    List<Character> firstLetters = new ArrayList<>();
    for(String name : names) {
      firstLetters.add(name.charAt(0));
    }                                  
    
    Collections.sort(firstLetters);
    
    StringBuilder stringOfFirstLetters = new StringBuilder();
    for(char letter : firstLetters) {
      stringOfFirstLetters.append(letter);
    }                                     
    
    System.out.println(stringOfFirstLetters);
  } 
}
