package Task5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Occurrences occurrence = new Occurrences();

        List<String> cars = new ArrayList<>();
        cars.add("bmw");
        cars.add("audi");
        cars.add("toyota");
        cars.add("nissan");
        cars.add("opel");
        cars.add("skoda");
        cars.add("audi");
        cars.add("dodge");
        cars.add("bmw");
        cars.add("ford");
        cars.add("audi");
        cars.add("toyota");

        List<ObjectOccurrence> occurrences = occurrence.findOccurrences(cars);
        for (ObjectOccurrence occurrence1 : occurrences) {
            System.out.println("name: " + occurrence1.getName() + ", occurrence: " + occurrence1.getOccurrence());
        }
    }
}
