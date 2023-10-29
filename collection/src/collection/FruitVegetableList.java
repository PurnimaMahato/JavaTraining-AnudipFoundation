//Q.1)WAP to create a list of Fruits and Vegetables using ArrayList.

package collection;
import java.util.ArrayList;

public class FruitVegetableList {

    public static void main(String[] args) {

        // Create an ArrayList to store fruits and vegetables
        ArrayList<String> fruitVegetableList = new ArrayList<>();

        // Add fruits to the list
        fruitVegetableList.add("Apple");
        fruitVegetableList.add("Banana");
        fruitVegetableList.add("Orange");

        // Add vegetables to the list
        fruitVegetableList.add("Potato");
        fruitVegetableList.add("Tomato");
        fruitVegetableList.add("Carrot");

        // Print the list of fruits and vegetables
        System.out.println("Fruits and vegetables:");
        for (String fruitVegetable : fruitVegetableList) {
            System.out.println(fruitVegetable);
        }
    }
}