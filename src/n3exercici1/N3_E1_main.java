package n3exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class N3_E1_main {

	public static void main(String[] args){
		
		System.out.println("****Alumnes actuals****");
		List<Alumne> alumnes = new ArrayList<>(Arrays.asList(
				new Alumne("Pau", 20, "JAVA", 2),
				new Alumne("Sandra", 18, "PHP", 5),
				new Alumne("Raul", 42, "DADES", 8),
				new Alumne("Carla", 26, "JAVA", 10),
				new Alumne("Teresa", 23, "DADES", 7),
				new Alumne("Joan", 30, "PHP", 3),
				new Alumne("Marta", 24, "DADES", 3),
				new Alumne("Marc", 35, "PHP", 9),
				new Alumne("Júlia", 26, "JAVA", 8),
				new Alumne("Berta", 19, "DADES", 5)));
		
		alumnes.forEach(a->System.out.println(
				"L'alumne/a " + a.getNom() + " té " + a.getEdat() + " anys."));
	}

}
