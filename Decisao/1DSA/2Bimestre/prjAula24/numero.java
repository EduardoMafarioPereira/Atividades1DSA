package prjAula24;
import java.util.Scanner;
public class numero {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b ,c,d;
		System.out.println("Insira o valor do primero número");
		a = ler.nextInt();
		System.out.println("Insira o valor do segundo número");
		b = ler.nextInt();
		System.out.println("Insira o valor do terceiro número");
		c = ler.nextInt();
		if (a >b) {
			d = a;
			a = b;
			b = d;
		}
	
		if(b>c){
			d = b;
			b = c;
			c = d;
		}
		if (a >b) {
			d = a;
			a = b;
			b = d;
		}	
		
		
        
		System.out.println(a+", "+b+", "+c);
		ler.close();
		
	}

}
