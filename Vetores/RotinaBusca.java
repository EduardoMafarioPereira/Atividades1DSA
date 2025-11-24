package prjAula29Vetor;
import java.util.Scanner;
public class RotinaBusca {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int busca;
		int i = 0;
		int contador = 0;
		int a[];
		a = new int [TAM]; 
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+"º valor");
			a[i] = ler.nextInt();
		}
		
		System.out.println("Insira o valor que você deseja procurar:");
		busca = ler.nextInt();
		
		System.out.print("A = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");	
		}
		System.out.println("]");
		
		for(i=0;i<TAM;i++) {
			for(contador= 0;contador<TAM;contador++) {
				if(a[i] == busca) {
					System.out.println("o "+(i+1)+"° elemento do vetor é o seu elemento desejado");
					break;
				}
			}
			
		}
		ler.close();
		
		
	
		
		
	}

}
