package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {

        /* Hashset --
            allows 1 null value
            doesnt mantain insertion order
            uses equals() and hashcode() method
        */
        Set<String> food = new HashSet<String>();
        food.add("Pasta"); // Adding elements to the HashSet
		food.add("Noodles");
		food.add("Sandwich");
		food.add("Pasta");
		food.add("Burger");
		food.add("Noodles");
		System.out.print("Set output without the duplicates: ");
		System.out.println(food);

        // Finding the size of the HashSet
		System.out.println("The number of food items in the set: " + food.size());

		// Checking if the HashSet contains the given element
		String foodItem = "Pasta";
		if (food.contains(foodItem))
			System.out.println(foodItem + " is already ordered");
		else
			System.out.println(foodItem + " is not ordered");

		// Removing an element from the HashSet
		if(food.remove("Burger"))
		    System.out.println("Output after removing Burger from the set:" + food);

		// Traversing elements
		Iterator<String> item = food.iterator();

		while (item.hasNext())
			System.out.println(item.next());

		// Removing all the elements from the HashSet
		food.clear();
		System.out.println("After clear() => " + food);


        /* LinkedHash Set
           uses Hash Tables & Linked Lists for storing elements
           maintains insertion order
           allows null elements
           uses equals() and hashcode() methods
         */

         Set<String> uniqueSet = new LinkedHashSet<String>();

         /* Tree Set
            Tree based data structure for storing elements
            doesnt allow null values
            maintains natural ordering
            compareTo() method is used for detecting duplicates 
          */
          Set<String> uniqueItems = new TreeSet<String>();

    }
}
