package prjAula022;
import java.util.Scanner;
public class MetrosParaQuilometros {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double metros, quilometros;
		System.out.println("Insira a distância em metros");
		metros = ler.nextDouble();
		quilometros = metros/1000;
		System.out.println("a distância é, em quilometros "+quilometros );
		ler.close();
 
	}

}
