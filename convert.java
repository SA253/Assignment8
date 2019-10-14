package assignment;
import java.util.*;
import java.util.stream.*;

public class convert {
	public static <T> List<T> convertALtoLL(List<T> aL) 
    { 
  
        
        List<T> lL = new LinkedList<>(aL); 
  
         
        return lL; 
    } 

	public static void main(String[] args) {
		 List<String> aL = Arrays.asList("Geeks", 
                 "forGeeks", 
                 "A computer Portal"); 

// Print the ArrayList 
System.out.println("ArrayList: " + aL); 

// convert the ArrayList to LinkedList 
List<String> 
lL = convertALtoLL(aL); 

// Print the LinkedList 
System.out.println("LinkedList: " + lL); 
} 
		

	}


