package n1exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N1_E4_main {

	public static void main(String[] args){
		
		List<String> ls = new ArrayList<String>(
				Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", 
						"Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"));
		
		ls.forEach(System.out::println);
	}

}
