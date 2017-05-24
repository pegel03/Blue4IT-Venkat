import java.util.*;

public class A02_declarative_style_Sample {

  public static boolean findNemo(List<String> names) {
    // boolean found = false;
    // 
    // for(String name : names) {
    //   if(name.equals("Nemo")) {
    //     found = true;
    //     break;
    //   }
    // }             
    // 
    // return found;
                               
    //declarative style
    return names.contains("Nemo");
  } 
  
  public static void main(String[] args) { 
    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");
    
    System.out.println("Declarative Nemo found is " + findNemo(names));
  } 
}
