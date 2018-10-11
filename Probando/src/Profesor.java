
public class Profesor extends Persona{
	protected  String especializacion;
	
	

	public Profesor (String nombre, String apellido, int dni, String especializacion) {
		super(nombre, apellido, dni);
		this.especializacion=especializacion;
	}
	

}
