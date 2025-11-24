package prjAula24;
import java.util.Scanner;
public class gastoMedio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double distancia, tanque, consumo;
		System.out.println("Insira a distancia percorrida");
		distancia = ler.nextDouble();
		System.out.println("Insira a capacidade de tanque do seu véiculo");
		tanque = ler.nextDouble();
		consumo = distancia/tanque;
		if (consumo>10 ) {
			System.out.println("Seu carro é econômico");
		}
		else {
			System.out.println("Seu carro não é econômico");
		}
		ler.close();

	}

}
