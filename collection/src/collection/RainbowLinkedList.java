//Q.2)WAP to create LinkedList to store Rainbow colors.

package collection;
import java.util.LinkedList;

public class RainbowLinkedList {

    public static void main(String[] args) {

        // Create a LinkedList to store rainbow colors
        LinkedList<String> rainbowList = new LinkedList<>();

        // Add rainbow colors to the list
        rainbowList.add("Red");
        rainbowList.add("Orange");
        rainbowList.add("Yellow");
        rainbowList.add("Green");
        rainbowList.add("Blue");
        rainbowList.add("Indigo");
        rainbowList.add("Violet");

        // Print the list of rainbow colors
        System.out.println("Rainbow colors:");
        for (String color : rainbowList) {
            System.out.println(color);
        }
    }
}