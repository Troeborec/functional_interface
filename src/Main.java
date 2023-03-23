import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        List<Dog> dogList = Arrays.asList(
                new Dog("BibaOne", 12),
                new Dog("BibaTwo", 10),
                new Dog("One", 7),
                new Dog("Two", 7),
                new Dog("Three", 3)
        );
        Predicate<Dog> dogPredicate = new DogPredicate();

        List<Dog> filteredList = filterDogs(dogList, dogPredicate);
        System.out.println(filteredList);

        }


        public static <T>List<T> filterDogs(List<T> dogList, Predicate<T> dogPredicate) {
            List<T> result = new ArrayList<>();

            for (T t: dogList) {
                if (dogPredicate.test(t)) {
                    result.add(t);
                }
            }
            return result;
    }
}