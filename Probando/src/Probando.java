import java.util.ArrayList;

public class Probando {
	public static void main (String[] args) {
		ArrayList<Persona> lista=new ArrayList<>();
		int a;


		for(int i=0;i<=10;i++) {
			a=(int) (Math.random()+0.5);
			if (a==0) {
				lista.add(new Alumno("Francisco", "Stimmler", 42454741, (int) (Math.random()* 10000 + 1)));
			}
			else {
				lista.add(new Profesor("Gabriel", "Pimentel", (int) (Math.random()* 20000000 + 10000000), "Programacion"));
			}
		}
		for(int i=0; i<lista.size();  i++) {
			System.out.println("Nombre: " + lista.get(i).nombre); 
			System.out.println("Apellido: " + lista.get(i).apellido);
			System.out.println("Dni: " + lista.get(i).dni);
			if(lista.get(i) instanceof Alumno) {
				System.out.println(((Alumno)lista.get(i)).nro_alumno);
			} else {
				System.out.println(((Profesor)lista.get(i)).especializacion);
			}
		}
	}
	
}

