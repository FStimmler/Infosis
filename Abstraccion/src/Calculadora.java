
public abstract class Calculadora {
	public Calculadora(){
		
	}
	
	abstract int sumar(int n1, int n2);
	
	abstract int resta(int n1, int n2);
	
	abstract int mul(int n1, int n2);
	
	double div(double n1, double n2) {
		return n1/n2;
	}


}
