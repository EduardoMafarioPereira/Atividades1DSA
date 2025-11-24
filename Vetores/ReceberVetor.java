package prjAula29Vetor;
import java.util.Scanner;
public class ReceberVetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int b[];
		int i = 0;
		
		int a[];
		a = new int [TAM];
		b = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+"º valor");
			a[i] = ler.nextInt();
		}
		System.out.print("A = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");	
		}
		System.out.println("]");
		
		for(i=0;i<TAM;i++) {	
			if(a[i] % 2 == 0) {
				b[i] = 1;
			}
			else {
				b[i] = 0;
			}
		}
		System.out.print("B = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");	
		}
		System.out.println("]");
		ler.close();

	}

}
