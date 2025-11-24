package prjAula29Vetor;
import java.util.Scanner;
public class VetorReceber {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int b[];int a[];int c[];
		int i = 0;
		
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+"º valor");
			a[i] = ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+"º valor do segundo vetor");
			b[i] = ler.nextInt();
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
		
		for(i=0;i<TAM;i++) {	
			if(a[i] >b[i]) {
				c[i] = 1;
			}
			else if (a[i] == b[i]){
				c[i] = 0;
			}
			else {
				c[i ]= -1;
			}
		}
		System.out.print("c = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(c[i]+" ");	
		}
		System.out.println("]");
		ler.close();

	}

}
