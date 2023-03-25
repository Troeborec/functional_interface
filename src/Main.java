import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Для себя");
        List<Dog> dogList = Arrays.asList(
                new Dog("BibaOne", 12),
                new Dog("BibaTwo", 10),
                new Dog("One", 7),
                new Dog("Two", 7),
                new Dog("Three", 3)
        );
        Predicate<Dog> dogPredicate = new DogPredicate();



        System.out.println("Задание №1");
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };

        Predicate<Integer> predicate1 = integer -> {
            return integer > 0;
        };
        System.out.println(predicate.test(-1));
        System.out.println(predicate1.test(12));
        System.out.println();

        System.out.println("Задание №2");
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Привет, " + s);
            }
        };
        consumer.accept("Олег");

        Consumer<String> consumer1 = s -> {
            System.out.println("Привет, " + s);
        };

        consumer1.accept("Шоня");
        System.out.println();

        System.out.println("Задание №3");
       Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };

        Function<Double, Long> function1 = aDouble -> {
            return Math.round(aDouble);
        };

        System.out.println(function.apply(2.35689515465464));
        System.out.println(function1.apply(5.3698446546543241));
        System.out.println();

        System.out.println("Задание №4");

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };

        Supplier<Integer> supplier1 = () -> (int) (Math.random() * 100);

        System.out.println(supplier.get());
        System.out.println(supplier1.get());
        System.out.println();
    }
}






