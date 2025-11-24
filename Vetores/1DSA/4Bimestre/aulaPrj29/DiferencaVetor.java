package prjAula29Vetor;
import java.util.Scanner;
public class DiferencaVetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int i = 0;
		int Contador = 0;
		int a[], b[], c[];
		a = new int [TAM]; b = new int [TAM]; c = new int [TAM];
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
			c[i]= a[i];
		}
		for(i=0;i<TAM;i++){
			for(Contador=0;Contador<TAM;Contador++) {
				if(c[i]==b[Contador]) {
					c[i] = c[i]-b[Contador];
				}
			}
		}
		
		System.out.print("C = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(c[i]+" ");
			
		}
		System.out.println("]");
		
		
		ler.close();
		
	}

}
