package prjAula26;
import java.util.Scanner;
public class pares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x, i;
		i = 0;
		x=0;
		do {
			System.out.print(x+" ");
			x=x+2;
			i++;
				
		}while(i<251);
		ler.close();

	}
}
