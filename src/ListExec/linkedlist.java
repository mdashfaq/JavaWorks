package ListExec;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlist {

// Importing required classes


    // Main class
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an linked list object
        LinkedList<String> object
                = new LinkedList<String>();

        // Custom input elements
        object.add("A");
        object.add("B");
        object.addLast("C");

        // Printing the current LinkedList
        System.out.println(object);

        // Removing elements from the List object
        // using remove() and removeFirst() method
        object.remove("B");
        object.removeFirst();

        System.out.println("Linked list after "
                + "deletion: " + object);
    }
}
