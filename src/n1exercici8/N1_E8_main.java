package n1exercici8;

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
