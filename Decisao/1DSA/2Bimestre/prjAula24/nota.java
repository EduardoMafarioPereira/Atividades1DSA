package prjAula24;
import java.util.Scanner;
public class nota {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, notaFinal, exame, notaExaminada;
		System.out.println("Insira a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Insira a segunda nota: ");
		nota2 = ler.nextDouble();
		notaFinal = (nota1+nota2)/2;
		if (notaFinal<3) {
			System.out.println("Reprovado");
		}
		else if (notaFinal>6) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Aluno em exame, insira a nota de recuperação");
			exame = ler.nextDouble();
			notaExaminada= (notaFinal+exame)/2;
			if (notaExaminada>6) {
				System.out.println("Aprovado");
			}
			else {
				System.out.println("Reprovado");
			}		
		}
		ler.close();
	}

}
