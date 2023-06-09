import java.util.function.Predicate;

public class DogPredicate implements Predicate<Dog> {


    private static final int dogAgePredicate = 0;

    @Override
    public boolean test(Dog dog) {
        return dog.getAge() >= dogAgePredicate;
    }
}
