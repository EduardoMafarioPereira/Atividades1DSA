package prjAula23;
import java.util.Scanner;
public class SalarioLido {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double salario;
		System.out.println("Insira seu salário");
		salario = ler.nextDouble();
		if (salario <1302 ) {
			System.out.println("Seu salário está abaixo do salário mínimo no brasil");		
		}
		else {
			System.out.println("Seu salário está acima do salário mínimo no brasil");
		}
		ler.close();

	}

}
