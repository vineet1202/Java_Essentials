package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {
    public static void main(String[] args) {
        
        /*
            public interface Map<K,V> 
            Methods - 
            put, remove, get, replace, clear, size, isEmpty
         */

         Map<String, Integer> books = new HashMap<String, Integer>();

        books.put("Data Structures With Java", 50);
		books.put("Operating System", 80);
		books.put("Let Us C", 70);
		books.put("Java Fundamentals", 40);
		
		//Displaying all the key-value pairs present in the map
		System.out.println(books);

        // books.remove(70);   //does not do anything - since value is passed not key

        books.remove("Let Us C", 70);
        System.out.println(books);

        books.replace("Operating System", 80, 100);
        System.out.println(books);
		
    }
}
