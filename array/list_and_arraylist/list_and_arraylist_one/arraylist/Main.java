import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println(cars.get(0));

    // Change Item
    cars.set(0, "Opel");
    System.out.println(cars);

    // Remove an Item
    cars.remove(0);
    System.out.println(cars);

    // Remove all elements
    cars.clear();
    System.out.println(cars);

    // To find out how m many elements an ArrayList have
    cars.size();
    System.out.println(cars.size());

    // Loop
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }

    // for-each
    for (String i : cars) {
      System.out.println(i);
    }

    // Sort
    Collections.sort(cars);
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
