package prjAula28;
import java.util.Scanner;
public class SomaVetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[]; int b[]; int c[]; int i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+"º valor do primeiro vetor");
			a[i]= ler.nextInt();
			
		}
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+"º valor do segundo vetor");
			b[i]= ler.nextInt();
			c[i]= a[i]+b[i];
		}
		System.out.print("A = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		System.out.print("B = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("]");
		System.out.print("C = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
	
	
		
	}

}
