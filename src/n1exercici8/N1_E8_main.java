package n1exercici8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class N1_E8_main {

	public static void main(String[] args){
		
		RevInterface rev = (s)->{
			String txt = "";
			for (int i=s.length()-1; i>=0; i--) {
				txt = txt + String.valueOf(s.charAt(i));
			}
			return txt;
		};
		
		String cadena = "Programació";
		System.out.println(cadena);
		
		String cadenaRev = rev.reverse(cadena);
		System.out.println(cadenaRev);
	}

}
