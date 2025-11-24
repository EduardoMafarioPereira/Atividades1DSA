package prjAula022;
import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double base, altura, area;
		System.out.print("coloque a base do triângulo");
		base = ler.nextDouble();
				
		System.out.println("Coloque a altura do triângulo");
		altura = ler.nextDouble();
		
		area = (base*altura)/2;
		System.out.println("a área do triângulo é: "+area);
		ler.close();
		
		
	}

}
