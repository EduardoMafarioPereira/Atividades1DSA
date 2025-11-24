package prjAula24;
import java.util.Scanner;
public class triangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c;
		System.out.println("Insira o valor do primeiro ângulo");
		a = ler.nextDouble();
		System.out.println("Insira o valor do segundo ângulo");
		b = ler.nextDouble();
		System.out.println("Insira o valor do terceiro ângulo");
		c = ler.nextDouble();
		if (a > b+c && b> a+c && c > b+a ) {
			System.out.println("Não é triângulo");
		}
		else if (a == b && b==c)  {
			System.out.println("Triângulo equilátero");
		}
		else {
			if (a != b && b != c && a != c ) {
				System.out.println("Triângulo escaleno");
			}
			else {
				System.out.println("Triângulo isósceles");
			}
		}
		ler.close();

	}
 
} 
