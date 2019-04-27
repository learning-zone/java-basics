package strings;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class ListUsingRemoveAll {
	
	 // Generic function to remove elements using Predicate 
    public static <T> List<T> 
    removeElements(List<T> l, Predicate<T> p) 
    { 
  
        // Create collection using Predicate 
        Collection<T> collection = new ArrayList<>(); 
  
        for (T t : l) { 
            if (p.test(t)) { 
                collection.add(t); 
            } 
        } 
  
        // Print the list 
        System.out.println("Collection to be removed: " + collection); 
  
        // Removing 10 using List.removeAll() 
        // passing a collection 
        l.removeAll(collection); 
  
        // Return the list 
        return l; 
    } 
  
    public static void main(String[] args) 
    { 
  
        // Create a list with null values 
        List<String> l = new ArrayList<>( 
            Arrays.asList("1", "10", "15", "10", "12", "5", "10", "20")); 
  
        // Print the list  
        System.out.println("Original List: " + l); 
  
        // Creating a Predicate condition checking for 10 
        Predicate<String> is10 = i -> (i == "10"); 
  
        // Removing using Predicate 
        l = removeElements(l, is10); 
  
        // Print the list 
        System.out.println("Updated List: " + l); 
    } 
}
