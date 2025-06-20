package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListCollection {
    public static void main(String[] args) {
        List<String> cities = new LinkedList<String>();
        
        cities.add("Milan");
        cities.add("Venice");
        cities.add("Munich");
        cities.add("Vienna");

        cities.add(3, "Prague");
        cities.remove("Munich");

        cities.set(2, "Berlin");

        System.out.println(cities.contains("Prague"));

        System.out.println(cities.get(0));

        //display
        System.out.println("Displaying list -- ");
        ListIterator<String> item = cities.listIterator();

        while(item.hasNext()){
            System.out.println(item.next());
        }
        
        cities.clear();

        System.out.println(cities);
        
    }
}
