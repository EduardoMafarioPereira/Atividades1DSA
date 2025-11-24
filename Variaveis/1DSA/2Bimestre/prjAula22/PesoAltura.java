package prjAula022;
import java.util.Scanner;
public class PesoAltura {
	
		public static void main(String[]args) {
			
			Scanner ler =new Scanner(System.in);
			double imc,kg,altura ;
			System.out.println("insira seu peso");
			kg =ler.nextDouble();
			System.out.println("insira sua altura");
			altura =ler.nextDouble();
			
			imc =kg/(altura*altura);
			System.out.println("voce tem de"+imc+" imc");
			ler.close();
			
			
		}

}
