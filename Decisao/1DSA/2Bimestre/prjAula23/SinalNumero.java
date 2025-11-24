package prjAula23;
import java.util.Scanner;

public class SinalNumero {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("Insira um número pra saber seu sinal: ");
		numero = ler.nextInt();
		if (numero <0) {
			System.out.println("Seu número é negativo");
		}
		else if (numero ==0 ) {
			System.out.println("Seu número é neutro, ou seja, zero");
		}
		else {
			System.out.println("Seu número é positivo");
		}
		ler.close();
	}

}
