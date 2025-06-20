package Collections;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        List<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Burger");
        food.add("Pasta");

        System.out.println("Size : " + food.size());

        food.set(2, "Sandwich");

        if(food.contains("Shakes")){
            System.out.println("Already Present");
        }
        else food.add("Shakes");


        ListIterator<String> item = food.listIterator();

        while(item.hasNext()){
            System.out.println(item.next());
        }

        //using for-each
        System.out.println("Display using for-each : ");
        for( String foo : food){
            System.out.println(foo);
        }


        

    }
}
