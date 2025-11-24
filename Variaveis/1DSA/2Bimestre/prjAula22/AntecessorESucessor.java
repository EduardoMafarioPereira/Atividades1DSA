package prjAula022;
import java.util.Scanner;
public class AntecessorESucessor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor1, antecessor, sucessor;
		System.out.println("Insira o número desejado:");
		valor1 = ler.nextInt();
		antecessor = valor1-1;
		sucessor = valor1+1;
		System.out.println("O sucessor desse número é: "+sucessor);
		System.out.println("O antecessor desse número é: "+antecessor);
		ler.close();
		

	}

}
