package prjAula29Vetor;
import java.util.Scanner;
public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10; int a[], i = 0, numero = 0;
		a = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+"º valor");
			a[i] = ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			for(numero= 2;numero<=Math.sqrt(a[i]);numero++) {
				if (a[i] % numero ==0) {
					System.out.println("o valor "+a[i]+" é primo");
				}
				
				
			}
		}
		ler.close();

	}

}
