package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N1_E1_main {

	public static void main(String[] args){
		
		List<String> ls = new ArrayList<String>(
				Arrays.asList("Hola", "que", "tal", "soy", "Júlia"));
		
		System.out.println(ls);
		
		List<String> lsFiltered = filterOStrings(ls);
		System.out.println(lsFiltered);
		
	}
	
	public static List<String> filterOStrings(List<String> ls){
		
		return ls.stream().filter(s -> s.contains("o")).toList();
		
	}

}
