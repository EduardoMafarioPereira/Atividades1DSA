package prjAula28;
import java.util.Scanner;
public class InvertidoVetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[]; int b[]; int i;int invertor = TAM-1;
		a = new int[TAM];
		b = new int[TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+"º valor do primeiro vetor");
			a[i]= ler.nextInt();
			
		}
		for(i=0;i<TAM;i++) {
			b[invertor] = a[i];
			invertor--;
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
		ler.close();

	}

}
