import java.util.*;

public class A01_imperative_style_Sample {

  public static boolean findNemo(List<String> names) {
    //primitive obsession
    boolean found = false;
    
    for(String name : names) {
      if(name.equals("Nemo")) {
        found = true;
        break;
      }
    }             
    
    return found;
  } 
  
  public static void main(String[] args) { 
    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");
    
    System.out.println(findNemo(names));
  } 
}
