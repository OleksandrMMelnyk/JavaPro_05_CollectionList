import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Solutions solution = new Solutions();

        //Part 1.

        ArrayList<String> cars = new ArrayList<>();
        cars.add("bmw");
        cars.add("audi");
        cars.add("toyota");
        cars.add("nissan");
        cars.add("opel");
        cars.add("skoda");
        cars.add("seat");
        cars.add("dodge");
        cars.add("kia");
        cars.add("ford");
        cars.add("audi");
        cars.add("toyota");

        String brand = "audi";
        int countBrand = solution.countOccurance(cars,brand);

        System.out.println("\nThe brand \"" + brand + "\" occurs " + countBrand + " times.");
        System.out.println("--------------------------------------------");

        //Part 2.
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrayToList = solution.arrayToList(arr);

        System.out.println("Було Array " + java.util.Arrays.toString(arr));
        System.out.println("Стало List " + arrayToList);
        System.out.println("---------------------------------------------");

        //Part 3.
        List<Integer> inputList = List.of(1, 3, 5, 7, 9, 6, 4, 3, 2, 1, 4, 8);
        List<Integer> uniqueList = solution.findUnique(inputList);

        System.out.println("Unique numbers: " + uniqueList);
        System.out.println("---------------------------------------------");

        //Part 4.
        solution.calcOccurrence(cars);
    }
}