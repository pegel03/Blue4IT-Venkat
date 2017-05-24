import java.util.ArrayList;
import java.util.List;

public class SubClass extends SuperClass {
   private SubClass() {
    super(10);
        System.out.println("Sub");
    }
    public static void main(String[] args) {
//        new SubClass();
        System.out.println("gestart");
        List<Integer> elements = new ArrayList<>();
        elements.add(10);
//        int fe = elements.get(1);
//        System.out.println(fe);

        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4);
        int fa = s1.indexOf(s2);
        System.out.println(fa);
    }
}
