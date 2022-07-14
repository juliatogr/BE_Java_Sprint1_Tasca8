package n1exercici7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class N1_E7_main {

	public static void main(String[] args){
		
		List<String> list = new ArrayList<>(
				Arrays.asList("Gener", "0", "21", "Hola", "40", "Programació", 
						"Java", "13"));
		System.out.println(list);
		list.sort(Comparator.comparing(String::length).reversed());
		System.out.println(list);
	}

}
