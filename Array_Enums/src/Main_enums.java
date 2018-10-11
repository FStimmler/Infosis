
public class Main_enums {
	public static void main(String[] args) {

		Persona p1 = new Persona("Francisco","Stimmler",Iva.EXENTO);
		Persona p2 = new Persona("Franco","Salinas",Iva.MONOTRIBUTISTA);
		Persona p3 = new Persona("Braian","Lazarte",Iva.RESPINSCRIPTO);
		
		p1.mostrar();
		p1.asignarIva();
		System.out.println();
		p2.mostrar();
		p2.asignarIva();
		System.out.println();
		p3.mostrar();
		p3.asignarIva();

	}
	
	
}
