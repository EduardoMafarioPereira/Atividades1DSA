package prjAula022;
import java.util.Scanner;
public class IdadeDoUsuario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double anoAtual, anoNascido, idade;
		System.out.println("Coloque o ano atual:");
		anoAtual = ler.nextDouble();
		System.out.print("Coloque seu ano nascido:");
		anoNascido = ler.nextDouble();
		idade = anoAtual- anoNascido;
		System.out.println("Sua idade é: "+idade);
		ler.close();
	}

}
