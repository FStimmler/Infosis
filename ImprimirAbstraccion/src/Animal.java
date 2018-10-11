
public class Animal implements Imprimible {
	public String nombre;
	public String familia;

	public Animal (String nombre, String familia) {
		this.nombre=nombre;
		this.familia=familia;
	}

	public String imprimir() {
		System.out.println("Nombre: " + nombre); 
		System.out.println("Familia: " + familia);
		
		return nombre+familia;
		
	}
}
