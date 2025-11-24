package prjAula022;
import java.util.Scanner;
public class IPVACarro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double precoCarro, CarroIPVA;
		System.out.println("Insira o valor do carro:");
		precoCarro = ler.nextDouble();
		CarroIPVA = precoCarro/100*4;
		System.out.println("o IPVA do carro é: "+CarroIPVA);
		ler.close();

	}

}
