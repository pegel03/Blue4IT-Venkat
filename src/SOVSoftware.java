import java.util.Arrays;
import java.util.List;

public class SOVSoftware {
    public static void main(String[] args){
        System.out.println(new SOVSoftware().getPrice());
    }
    private String getPrice() {
        List<String> opt = Arrays.asList("Mok", "Dopper", "Poen", "Raspberry Pi");
//        opt.removeIf(p -> p.startsWith("r"));
        return opt.stream()
                .filter((s) -> {return s.contains("o")?false:true;})
//        .sorted((a,b)-> b.compareTo(a))
                .findFirst().orElse("niks");
    }
}
