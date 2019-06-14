import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorterTest {
    @Test
    public void sortListOfStrings() {
        List<String> names = Arrays.asList("Bob", "Harry", "Sally", "JaQuana", "Brice", "Andrew", "John");
        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void sortListOfInts() {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 2, 3, 7, 5, 4, -3, 0, -9);
        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    public void sortListOfFloats() {
        List<Float> amounts = Arrays.asList(1.3f, 3.3f,50.3f, 3f,0.4f, -3.3f);
        Collections.sort(amounts);
        for (Float amount : amounts) {
            System.out.println(amount);
        }
    }

    @Test
    public void sortListOfUserObjectsAlwaysByNameField() {
        // I had to make User class implement Comparable<User> and override compareTo function
        User Tom = new User("Tom", 42, true);
        User April = new User("April", 32, true);
        User Susan = new User("Susan", 40, false);
        User Heidi = new User("Heidi", 46, true);
        User Stacy = new User("Stacy", 50, false);
        List<User> users = Arrays.asList(Tom, April, Susan, Heidi, Stacy);
        for (User user : users) {
            System.out.println(user.getName());
        }
        System.out.println("---------------------");
        Collections.sort(users);
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    @Test
    public void sortListOfHeroesDynamicallyByDifferentFields() {
        // Hero class does not extend Comparable<Hero>, but includes static methods that allow sorting
        Hero heMan = new Hero("He-Man", "animated", false, 300);
        Hero wolverine = new Hero("Wolverine", "both", true, 180);
        Hero spiderman = new Hero("Spider-Man", "movie", true, 130);
        Hero aquaman = new Hero("Aquaman", "movie", true, 230);
        Hero hulk = new Hero("Hulk", "movie", true, 500);
        Hero ironMan = new Hero("Iron Man", "movie", true, 350);

        List<Hero> heroes = Arrays.asList(heMan, wolverine, spiderman, aquaman, hulk, ironMan);
        Collections.sort(heroes, Hero.byName);
        for (Hero hero : heroes) {
            System.out.println(hero.getName());
        }
        System.out.println("------------------");
        Collections.sort(heroes, Hero.byWeight);
        for (Hero hero : heroes) {
            System.out.println(hero.getName());
        }
    }
}
