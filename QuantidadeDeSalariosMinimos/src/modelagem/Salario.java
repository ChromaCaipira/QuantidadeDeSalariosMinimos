package modelagem;

public class Salario {
	private double salMin = 788.00;
	private double sal;
	
	public Salario(double salario) {
		this.sal = salario;
	}
	
	public double salariosMin() {
		double resultado = this.sal / this.salMin; //Com uma simples regra de 3, é possível achar o resultado
		return resultado;
	}
}