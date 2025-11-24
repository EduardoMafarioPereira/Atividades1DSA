package prjAula29Vetor;
import java.util.Scanner;	
public class NumeroPar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10; int a[];int i;int b;
		
		a =new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+"º elemento");
			a[i] = ler.nextInt();
			
		}
		for(i=0;i<TAM;i++) {
			System.out.println(" ");
			System.out.println(" ");
			System.out.print(a[i]+":");
			for(b=0;b<=a[i];b= b+2) {
				
				System.out.print(" "+b);
			}
		}
		ler.close();
		
		
		
	}

}
