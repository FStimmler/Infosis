
public class Alumno extends Persona{
	protected  int nro_alumno;
	
	

	public Alumno (String nombre, String apellido, int dni, int nro_alumno) {
		super(nombre, apellido, dni);
		this.nro_alumno = nro_alumno;
	}



	public int getNro_alumno() {
		return nro_alumno;
	}



	public void setNro_alumno(int nro_alumno) {
		this.nro_alumno = nro_alumno;
	}
	
}
