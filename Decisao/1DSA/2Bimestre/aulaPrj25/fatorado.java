package prjAula25;
import java.util.Scanner;
public class fatorado {

	public static void main(String[] args) {
	long i, n, y;
	Scanner ler = new Scanner(System.in);
	System.out.println("insira o numero que vc quer fatorar");
	n = ler.nextInt();
	i= 1;
	y = 1;
	
	do {
			y=y*i;
		
			i++;
		}while (i<n+1);
	System.out.println(y);
	ler.close();
	}
	


}
