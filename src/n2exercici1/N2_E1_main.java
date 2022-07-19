package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N2_E1_main {

	public static void main(String[] args){
		
		List<String> names = new ArrayList<String>(
				Arrays.asList("Marc", "Andrea", "Pau", "Ana", "Joan", "Carla", 
						"Raul", "Sara", "Arnau", "Fiona"));
		
		System.out.println(names);
		
		List<String> namesFiltered = filterNames(names);
		System.out.println(namesFiltered);
	}
	
	public static List<String> filterNames(List<String> names){
		
		return names.stream().filter(s -> s.charAt(0)== 'A').filter(s -> s.length()==3).toList();
		
	}

}
