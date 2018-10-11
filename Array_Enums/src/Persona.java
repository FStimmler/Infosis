
public class Persona {
	public String nombre;
	public String apellido;
	Iva iva;

	public Persona (String nombre, String apellido,Iva iva) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.iva = iva;
	}

	public void asignarIva() {

		switch (iva) {
			case RESPINSCRIPTO:
				System.out.print("Es responsable inscrtipto.");
			break;
			case MONOTRIBUTISTA:
				System.out.print("Es Monotributista.");
			break;
			case EXENTO:
				System.out.print("Es exento.");
			break;
			default:
			break;	

		}
	
		
		
		
	}
	
	
	public void mostrar() {
		System.out.print(nombre + " " + apellido + " ");
	} 


}
