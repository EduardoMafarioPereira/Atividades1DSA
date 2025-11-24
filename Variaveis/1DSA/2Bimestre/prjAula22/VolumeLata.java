package prjAula022;
import java.util.Scanner;
public class VolumeLata {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double volume, pi, raio, altura;
		pi =3.14;
		System.out.println("Insira a altura da lata");
		altura = ler.nextDouble();
		System.out.println("Insira o raio da lata");
		raio = ler.nextDouble();
		volume = pi*(raio*raio)*altura;
		System.out.println("o volume da lata é "+volume);
		ler.close();
		

	}

}
