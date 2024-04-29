import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
        public static void main(String[] args) {

                List<Toy> toys1 = new ArrayList<>(List.of(
                                new Toy(1, "Конструктор", 2),
                                new Toy(2, "Робот", 2),
                                new Toy(3, "Кукла", 6)));
                List<Toy> toys2 = new ArrayList<>(List.of(
                                new Toy(1, "Конструктор", 2),
                                new Toy(2, "Робот", 2),
                                new Toy(3, "Кукла", 6)));
                List<Toy> toys3 = new ArrayList<>(List.of(
                                new Toy(1, "Конструктор", 2),
                                new Toy(2, "Робот", 2),
                                new Toy(3, "Кукла", 6)));
                ToyStore toyStore = new ToyStore();
                toyStore.put(toys1);
                toyStore.put(toys2);
                toyStore.put(toys3);
                System.out.println(toyStore.getToy());

        }

}