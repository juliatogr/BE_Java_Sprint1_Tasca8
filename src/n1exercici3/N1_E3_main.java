package n1exercici3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N1_E3_main {

	public static void main(String[] args){
		
		List<String> ls = new ArrayList<String>(
				Arrays.asList("Gener", "Febrer", "Mar?", "Abril", "Maig", "Juny", 
						"Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"));
		
		ls.forEach(s->System.out.println(s));
	}

}
