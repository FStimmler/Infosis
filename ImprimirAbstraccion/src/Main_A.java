import java.util.ArrayList;

public class Main_A {
	public static void main (String[] args) {

		ArrayList<Imprimible> array = new ArrayList<Imprimible>();
		int a;
		for(int i=0;i<=10;i++) {
			a=(int) (Math.random()+0.5);
			if (a==0) {
				array.add(new Persona("Francisco","Stimmler",42454741));
			}
			else {
				array.add(new Animal("Caballo","Camello"));
			}
		}
		for(int i=0; i<array.size();  i++) {
			array.get(i).imprimir();	
		}


	}
}
