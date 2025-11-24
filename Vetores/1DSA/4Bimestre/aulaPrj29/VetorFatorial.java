package prjAula29Vetor;
import java.util.Scanner;
public class VetorFatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 15; long a[]; long b[];int i; 
		long x, y;
		a = new long [TAM];
		b= new long [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+"º elemento");
			a[i] = ler.nextInt();
		}
		
		System.out.print("A = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		
		System.out.print("B = [ ");
		for(i=0;i<TAM;i++) {
			y = 1;
			x=1;
			
			do {
				y=y*x;
				
				x++;
				}while (x<a[i]+1);
			
			b[i] = y;
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		ler.close();
		
		
		
	

	}

}
