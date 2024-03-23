package iteratorsAndComparators;

import java.util.*;
// Import all static methods from the Stream and collections interface
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.toCollection;
import java.util.stream.IntStream;

// Import all static methods from the Stream and collections

// import java.util.stream.*

// import static java.util.stream.*.*;

public class listIterator {
    public static void main(String[] args) {

        // Create a new ArrayList and populate it with integers from 0 to 9
        List<Integer> list = new ArrayList<>(
                IntStream.range(0, 10).boxed().collect(toCollection(ArrayList::new)));

        System.out.println("list: " + list);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= ");

        // Create a new ArrayList to store the reversed elements
        List<Integer> result = new ArrayList<>(list.size());

        // Create a ListIterator starting from the end of the list
        ListIterator<Integer> it = list.listIterator(list.size());

        // ! Iterate over the list in reverse order using the ListIterator
        while (it.hasPrevious()) {
            result.add(it.previous()); // Add each element to the result list
        }
        while (it.hasNext()) {
            result.add(it.next()); // Add each element to the result list
        }

        System.out.println("result: " + result);

        // Reverse the original list using the Collections class
        Collections.reverse(list);

        // Check if the reversed result list is equal to the reversed original list
        boolean equ = result.equals(list);
        System.out.println(equ);

    }
}