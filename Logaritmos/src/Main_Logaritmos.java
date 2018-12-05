import java.util.Scanner;

public class Main_Logaritmos {

	public static void main(String [] args) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		while(1>0) {
			System.out.println("Numero: ");
			double numero = reader.nextDouble();
			System.out.println("Base: ");
			double base = reader.nextDouble();

			double x = Math.log10(numero)/Math.log10(base);
			System.out.println(x);
			
		}
	}

}
