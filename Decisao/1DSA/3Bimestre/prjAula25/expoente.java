package prjAula25;
import java.util.Scanner;
public class expoente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int expo, base, base2, i;
		i= 1;
		System.out.println("Insira o expoente do número");
		expo = ler.nextInt();
		System.out.println("Leia o número");
		base = ler.nextInt();
		i = expo;
		base2 = base;
		do {
			base2=base2*base;
			i--;
			
		}while(i>1);
		System.out.println(base2);
		ler.close();
	}

}
