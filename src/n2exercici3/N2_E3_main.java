package n2exercici3;

public class N2_E3_main {

	public static void main(String[] args){
		
		OpInterface suma = (n1, n2)->{ return n1+n2; };
		OpInterface resta = (n1, n2)->{ return n1-n2; };
		OpInterface multiplicacio = (n1, n2)->{ return n1*n2; };
		OpInterface divisio = (n1, n2)->{ return (float)n1/n2; };
		
		System.out.println("2+4=" + suma.operacio(2,4));
		System.out.println("2-4=" + resta.operacio(2,4));
		System.out.println("2*4=" + multiplicacio.operacio(2,4));
		System.out.println("2/4=" + divisio.operacio(2,4));
	}

}
