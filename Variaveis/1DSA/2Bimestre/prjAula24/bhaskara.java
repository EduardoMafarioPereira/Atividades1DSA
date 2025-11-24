package prjAula24;
import java.util.Scanner;
import java.lang.Math;
public class bhaskara {

	public static void main(String[] args) {
		double delta, x1, x2, a, b, c;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o valor de a");
		a = ler.nextDouble();
		System.out.println("Insira o valor de b");
		b = ler.nextDouble();
		System.out.println("Insira o valor de c");
		c = ler.nextDouble();
		// fórmula do delta é (b*b)-4*a*c pra descobrir a quantidade de raízes e também o delta//
		delta = (b*b)-4*a*c;
		
		if (delta<0) {
			System.out.println("Não existe raízes reais para essa função");
		}
		else if (delta==0) {
				System.out.println("Existe uma raíz real para essa equação");
			}
		else {
				System.out.println("Existem duas raízes reais para essa equação");
		}
		
		//fórmula de bhaskara pra descobrir o valor das raízes // 
		x1 = (-b+ Math.sqrt(delta))/(2*a);
		x2 = (-b- Math.sqrt(delta))/(2*a);
		System.out.println("O valor da primeira raíz é: "+x1);
		System.out.println("O valor da segunda raíz é: "+x2);
		ler.close();
	}

}
