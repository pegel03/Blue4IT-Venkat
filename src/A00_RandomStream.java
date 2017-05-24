import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by pegel03 on 7-3-17.
 */
public class A00_RandomStream {

    public static void main(String... args) {
        generateNr1(10);
        generateNr2();
    }

    private static void generateNr2() {
        randomStream(10).limit(10).forEach(x->System.out.print(x));
    }

    private static Stream<Long> randomStream(int i) {
        return Stream.generate(Math::random).map(x -> x * i).map(Math::round);
    }

    private static void generateNr1(int range) {
        System.out.println(Stream.generate(Math::random)
                .map(n -> n * range)
                .map(Math::round)
                .limit(10)
                .collect(Collectors.toList()));
    }
}
