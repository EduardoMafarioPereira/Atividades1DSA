package prjAula25;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n,i, antecessor, sucessor, atual;
		System.out.println("Insira o número de termos desejado");
		n = ler.nextInt();
		atual = 1;
		antecessor = 1;
		i=1;
		do {
			sucessor = atual + antecessor;
			atual = antecessor;
			antecessor = sucessor;
			System.out.println(atual);
			i++;
		}while(i<n);
		ler.close();
	}

}
