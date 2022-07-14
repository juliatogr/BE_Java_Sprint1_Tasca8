package n1exercici6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class N1_E6_main {

	public static void main(String[] args){
		
		List<String> list = new ArrayList<>(
				Arrays.asList("Gener", "0", "21", "Hola", "40", "Programació", 
						"Java", "13"));
		System.out.println(list);
		list.sort(Comparator.comparing(String::length));
		System.out.println(list);
	}

}
