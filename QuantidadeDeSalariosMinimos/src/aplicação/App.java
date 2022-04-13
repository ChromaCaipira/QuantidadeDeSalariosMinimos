package aplicação;

import modelagem.Salario;
import java.util.Scanner;

public class App {
	private static Salario calcsal;
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe seu salário: ");
			double salario = scan.nextDouble();
			
			calcsal = new Salario(salario); //Armazena o novo salário, inserido pelo usuário, na classe Salario
			
			double qntSalMin = calcsal.salariosMin(); //Armazena a quantia de salários mínimos calculados no tal método
			System.out.printf("Seu salário valida em %.2f" + " salário(s) mínimo(s)", qntSalMin);
		}
	}
}