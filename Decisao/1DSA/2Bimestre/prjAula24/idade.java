package prjAula24;
import java.util.Scanner;
public class idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoAtual, anoNascido, idade;
		System.out.println("Insira o ano atual: ");
		anoAtual = ler.nextInt();
		System.out.println("Insira o ano em que você nasceu: ");
		anoNascido = ler.nextInt();
		idade = anoAtual - anoNascido;
		if (idade <10) {
			System.out.println("Você é uma Criança");
		}
		else if (idade <18) {
			System.out.println("Você é um Adolescente");
		}
		else if (idade <60) {
			System.out.println("Você é um Adulto");
			}
		else {
					System.out.println("Você é um Idoso");
		}
		ler.close();
	}

}
