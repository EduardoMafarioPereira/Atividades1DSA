package prjAula08;
import java.util.Scanner;
public class IdadeAlturaPeso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i,idade, idadeVelho,idadeMaior, idadeMenor;
		double altura = 0, alturaSoma = 0;
		double pesoQuarenta, peso; 
		pesoQuarenta = 0;
		peso = 0;
		idadeVelho=0; idadeMaior=0; idadeMenor=300;
		
		
		for(i=0;i<25;i++) {
			System.out.println("Insira sua idade:");
			idade = ler.nextInt();
			System.out.println("Insira sua altura em metros");
			altura = ler.nextDouble();
			System.out.println("Insira seu peso");
			peso = ler.nextInt();
			
			if(idade>50) {
				idadeVelho++;
			}
			if(idade >9 && idade<21) {
				alturaSoma = alturaSoma +altura;
			}
			if(peso<40 ) {
				pesoQuarenta++;
			}
			
			if(idade >idadeMaior) {
				idadeMaior = idade;
			}
			if(idade<idadeMenor) {
				idadeMenor=idade;
			}			
		}
		pesoQuarenta=(pesoQuarenta/25)*100;
		alturaSoma= alturaSoma/25;
		System.out.println("A quantidade de pessoas com maior de 50 anos é: "+idadeVelho);
		System.out.println("A média de altura entre das 25 pessoas com maior de 10 anos e menor de 20 anos é de: "+alturaSoma);
		System.out.println("A porcentagem de pessoas com o peso inferior a 40  é de: "+pesoQuarenta+"%");
		System.out.println("A maior idade é de: "+idadeMaior+" anos");
		System.out.println("A menor idade é de: "+idadeMenor+" anos");
		ler.close();
	}

}
