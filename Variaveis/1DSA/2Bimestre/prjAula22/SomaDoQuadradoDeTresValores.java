package prjAula022;
import java.util.Scanner;
public class SomaDoQuadradoDeTresValores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor1, valor2, valor3, soma;
		System.out.println("Insira o primeiro valor");
		valor1 = ler.nextInt();
		System.out.println("Insira o segundo valor");
		valor2 = ler.nextInt();
		System.out.println("Insira o terceiro valor");
		valor3 = ler.nextInt();
		soma = (valor1*valor1)+(valor2*valor2)+(valor3*valor3);
		System.out.println("A soma do quadrado dos 3 valores é: "+soma);
		ler.close();

	}

}
