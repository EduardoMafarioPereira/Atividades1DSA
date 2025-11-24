package prjAula022;
import java.util.Scanner;
public class FestaValores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int salgados, litros, homens, mulheres;
		double bolos;
		System.out.println("Insira a quantidade homens");
		homens = ler.nextInt();
		System.out.println("Insira a quantidade de mulheres");
		mulheres = ler.nextInt();
		salgados = (homens*10)+(mulheres*6);
		litros = (homens*800)+(mulheres*600)/1000;
		bolos = ((homens+mulheres)*100)/1000;
		System.out.println("A quantidade de salgados é "+salgados);
		System.out.println("A quantidade de litros é "+litros);
		System.out.println("A quantidade de bolo é "+bolos);
		ler.close();

	}

}
