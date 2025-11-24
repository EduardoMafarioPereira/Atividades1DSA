package prjAula022;
import java.util.Scanner;

public class DiaMesAno{

	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double dia,mes,ano;	
		System.out.print("insira o dia");
		dia =ler.nextDouble();
		mes= dia/30;
		ano = dia/365;
		System.out.println("voce tem "+ano+ " ano");
		System.out.println("voce tem "+mes+ " mes");
		ler.close();
		
	}

	
	
	
}
