package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N1_E2_main {

	public static void main(String[] args){
		
		List<String> ls = new ArrayList<String>(
				Arrays.asList("Hola", "que", "tal", "soy", "Júlia", "Tortosa", 
						"y", "vivo", "en", "Barcelona", "capital"));
		
		System.out.println(ls);
		
		List<String> lsFiltered = filterOStrings(ls);
		System.out.println(lsFiltered);
	}
	
	public static List<String> filterOStrings(List<String> ls){
		
		return ls.stream().filter(s -> s.contains("o")).filter(s -> s.length()>5).toList();
		
	}

}
