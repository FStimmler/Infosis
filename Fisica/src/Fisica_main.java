import java.util.Scanner;

public class Fisica_main {

	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		String incog1="0";
		String incog2="0";
		System.out.println("Cuantas incognitas?: ");
		int c_incog = reader.nextInt();
		if (c_incog==1) {
			System.out.println("Cual?: ");
			incog1 = reader.next();
		}else {
			System.out.println("Cuales?: ");
			incog1 = reader.next();
			System.out.println("y?: ");
			incog2 = reader.next();
		}
		System.out.println(incog1);
		if(incog1.equals("xf")) {
			System.out.println("xf");
		}


		if(!(incog2.equals("xf")||incog1.equals("xf"))) {
			System.out.println("Posicion inicial: ");
			int xi = reader.nextInt();
		}if(!(incog2.equals("xf")||incog1.equals("xf"))) {
			System.out.println("Posicion final: ");
			int xf = reader.nextInt();
		}if(incog2!="vi"||incog1!="vi") {
			System.out.println("Velocidad inicial: ");
			int vi = reader.nextInt();
		}if(incog2!="vf"||incog1!="vf") {
			System.out.println("Velocidad final: ");
			int vf = reader.nextInt();
		}if(incog2!="t"||incog1!="t") {
			System.out.println("Tiempo: ");
			int t = reader.nextInt();
		}if(incog2!="a"||incog1!="a") {
			System.out.println("Aceleracion: ");
			int a = reader.nextInt();
		}


		/*
		System.out.println("Posicion inicial: ");
		int xi = reader.nextInt();
		System.out.println("Posicion final: ");
		int xf = reader.nextInt();
		System.out.println("Velocidad inicial: ");
		int vi = reader.nextInt();
		System.out.println("Velocidad final: ");
		int vf = reader.nextInt();
		//System.out.println("Tiempo: ");
		//int t = reader.nextInt();
		System.out.println("Aceleracion: ");
		int a = reader.nextInt();

		int t =(vf-vi)/a;

		System.out.println(incog1);
	*/
	}

	void datos() {

	}

}
