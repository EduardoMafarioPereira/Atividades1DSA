package prjAula29Vetor;
import java.util.Scanner;
public class NumPalindromo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[]; int i;int invertor = TAM-1; int contar = 0;
		a = new int[TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+"º valor do primeiro vetor");
			a[i]= ler.nextInt();
			
		}
		for(i=0;i<TAM;i++) {
			if(a[i] == a[invertor]){
				contar++;
				invertor--;
				
			}
		}
		
		System.out.print("A = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		
		if(contar == 10) {
			System.out.println("Esse número é um palíndromo");
		}
		else {
			System.out.println("Não é um palíndromo");
		}
		
		
		ler.close();

	}

}
