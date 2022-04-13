package aplica��o;

import modelagem.Salario;
import java.util.Scanner;

public class App {
	private static Salario calcsal;
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe seu sal�rio: ");
			double salario = scan.nextDouble();
			
			calcsal = new Salario(salario); //Armazena o novo sal�rio, inserido pelo usu�rio, na classe Salario
			
			double qntSalMin = calcsal.salariosMin(); //Armazena a quantia de sal�rios m�nimos calculados no tal m�todo
			System.out.printf("Seu sal�rio valida em %.2f" + " sal�rio(s) m�nimo(s)", qntSalMin);
		}
	}
}