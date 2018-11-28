import java.util.Scanner;

public class Fisica_main {
	static int xi=0,xf=0,vi=0,vf=0,a=0,t=0;

	public static void main (String[] args) {
		@SuppressWarnings("resource")
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



		if(!(incog2.equals("xf")||incog1.equals("xf"))) {
			System.out.println("Posicion inicial: ");
			xi = reader.nextInt();
		}if(!(incog2.equals("xf")||incog1.equals("xf"))) {
			System.out.println("Posicion final: ");
			xf = reader.nextInt();
		}if(!(incog2.equals("vi")||incog1.equals("vi"))) {
			System.out.println("Velocidad inicial: ");
			vi = reader.nextInt();
		}if(!(incog2.equals("vf")||incog1.equals("vf"))) {
			System.out.println("Velocidad final: ");
			vf = reader.nextInt();
		}if(!(incog2.equals("t")||incog1.equals("t"))) {
			System.out.println("Tiempo: ");
			t = reader.nextInt();
		}if(!(incog2.equals("a")||incog1.equals("a"))) {
			System.out.println("Aceleracion: ");
			a = reader.nextInt();
		}

		if (c_incog==1) {
			switch (incog1) {
			case "vf":
				vf=vi+a*t;
				mostrar("vf");
				break;
			case "vi":
				vi=vf-a*t;
				mostrar("vi");
				break;
			case "xi":
				xi=xf-vi*t-(a/2)*(t*t);
				mostrar("xi");
				break;
			case "xf":
				xf=xi+vi*t+(a/2)*(t*t);
				mostrar("xf");
				break;
			case "a":
				a=(vf-vi)/t;		
				mostrar("a");
				break;
			case "t":
				t=(vf-vi)/a;		
				mostrar("t");
				break;
			}
		}
		else {
			switch (incog1) {
			case "xf":
				switch(incog2) {
				case "xi":
					System.out.println("Imposible de resolver");
					break;
				case "vi":
					vi=vf-a*t;
					xf=xi+vi*t+(a/2)*(t*t);
					mostrar("vi");
					mostrar("xf");
					break;
				case "vf":
					xf=xi+vi*t+(a/2)*(t*t);
					vf=vi+a*t;
					mostrar("vf");
					mostrar("xf");
					break;
				case "t":
					t=(vf-vi)/a;
					xf=xi+vi*t+(a/2)*(t*t);
					mostrar("xf");
					mostrar("t");
					break;
				case "a":
					a=(vf-vi)/t;
					xf=xi+vi*t+(a/2)*(t*t);
					mostrar("xf");
					mostrar("t");
					break;
				}
				break;
			case "vi":
				switch(incog2) {
				case "vf":
					vi=(xf-xi-(a/2)*(t*t))/t;
					vf=vi+a*t;
					mostrar("vi");
					mostrar("vf");
					break;
				case "xi":
					vi=vf-a*t;
					xi=xf-vi*t-(a/2)*(t*t);
					mostrar("vi");
					mostrar("xi");
					break;
				case "xf":
					vi=vf-a*t;
					xf=xi+vi*t+(a/2)*(t*t);
					mostrar("vi");
					mostrar("xf");
				case "t":
					System.out.println("Muy dificil: ");
					break;
				case "a":
					System.out.println("Muy dificil: ");
					break;	
				}
				break;
			case "vf":
				switch(incog2) {
				case "vi":
					vi=(xf-xi-(a/2)*(t*t))/t;
					vf=vi+a*t;
					mostrar("vi");
					mostrar("vf");
					break;
				case "xi":
					break;
				}
				break;
			}
		}
	}

	static void mostrar(String string) {
		switch(string) {
		case "vi":
			System.out.println("Velocidad inicial: ");
			System.out.println(vi);
			break;
		case "vf":	
			System.out.println("Velocidad final: ");
			System.out.println(vf);
			break;
		case "xi":
			System.out.println("Posicion inicial: ");
			System.out.println(xi);
			break;
		case "xf":
			System.out.println("Posicion final: ");
			System.out.println(xf);
			break;
		case "t":
			System.out.println("Tiempo: ");
			System.out.println(t);
			break;
		case "a":
			System.out.println("Aceleracion: ");
			System.out.println(a);
			break;

		}
	}
}
