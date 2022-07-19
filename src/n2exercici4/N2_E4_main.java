package n2exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class N2_E4_main {

	public static void main(String[] args){
		
		System.out.println("****Llista original****");
		List<String> list = new ArrayList<String>(
				Arrays.asList("Marc", "10", "Pau", "23", "1", "Teresa", 
						"Ruben", "78", "39", "Fiona"));
		
		System.out.println(list);
		System.out.println();
		
		System.out.println("****Llista endreçada segons el primer caràcter i si contenen la 'e'****");
		List<String> listSorted = sortList(list);
		System.out.println(listSorted);
		System.out.println();
		
		System.out.println("****Modifico les 'a' per '4'****");
		listSorted = listSorted.stream().map(n->{
			String letter = n.contains("a")? n.replace("a", "4") : n;
			return letter;
			}).toList();
		
		System.out.println(listSorted);
	    System.out.println();
	    
		System.out.println("****Filtro perquè quedin els números****");
		listSorted = listSorted.stream().filter(s -> isInteger(s)).toList();
		System.out.println(listSorted);
	}
	
	public static List<String> sortList(List<String> names){
		
	    Comparator<String> charComparator
	      = (s1, s2) -> String.valueOf(s1.charAt(0)).compareTo(String.valueOf(s2.charAt(0)));
	    
	    Comparator<String> eComparator
	      = (s3, s4) -> { 
	    	  boolean eS3 = s3.contains("e");
	    	  boolean eS4 = s4.contains("e");
	    	  
	    	  if (eS3 && eS4) {
	    		  return 0;
	    	  } else if (eS3 && !eS4) {
	    		  return -1;
	    	  } else {
	    		  return 1;
	    	  }
	    	  
	      };
	      
	    names.sort(charComparator);
	    names.sort(eComparator);
	    return names;

	}
	
	public static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch(Exception e) {
			return false;
		}
	}

}
