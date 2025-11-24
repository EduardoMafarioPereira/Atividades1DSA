package prjAula24;
import java.util.Scanner;

public class imc {
	public static void main(String[]args ) {
		Scanner ler = new Scanner(System.in);
		double imc, peso, altura;
		System.out.println("Insira sua altura em metros:");
		altura = ler.nextDouble();
		System.out.println("Insira seu peso em quilos: ");
		peso = ler.nextDouble();
		imc= peso/(altura*altura);
		if (imc <18.5) {
			System.out.println("Excesso de magreza");
			
		}
		else if(imc <25) {
			System.out.println("Peso normal");
		}
		else if(imc<30) {
			System.out.println("Excesso de peso");
		}
		else if(imc<35) {
			System.out.println("Obesidade (Grau 1)");
		}
		else if(imc<40) {
			System.out.println("Obesidade (Grau 2");
		}
		else {
			System.out.println("Obesidade (Grau3");
		}
	
					
		ler.close();
		}
	}	


