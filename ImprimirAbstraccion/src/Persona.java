
public class Persona implements Imprimible {
	public String nombre;
	public String apellido;
	public int dni;

	public Persona (String nombre, String apellido, int dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
	}

	@Override
	public String imprimir() {
		System.out.println("Nombre: " + nombre); 
		System.out.println("Apellido: " + apellido);
		System.out.println("Dni: " + dni);
		return nombre + apellido + dni;

	}

}

