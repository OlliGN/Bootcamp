package loops;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {

        //Example with For loop
        String[] cars = {"Volvo", "BMW", "Lexus"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        //Example with For Each loop
        String[] friends = {"Ross", "Anton", "Marina"};

        for (String car : friends) {
            System.out.println(car);
        }

        //For Each loop with Iterator
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);

        for (int a : numbers) {
            System.out.println(a);
        }

        // Example with For loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
