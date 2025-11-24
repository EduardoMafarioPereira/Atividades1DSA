package prjAula022;
import java.util.Scanner;

public class VolumeCubo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double volume, aresta;
		System.out.println("Insira a medida das arestas");
		aresta = ler.nextDouble();
		volume = aresta*aresta*aresta;
		System.out.println("o volume da lata é "+volume);
		ler.close();
	}

}
