package prjAula28;
import java.util.Scanner;
public class QuadradoVetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int i;
		int a[];
		int b[];
		a = new int [TAM];
		b = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+" número");
			a[i] = ler.nextInt();
			b[i]= a[i]*a[i];
		}
		System.out.print("B = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		ler.close();
	}

}
