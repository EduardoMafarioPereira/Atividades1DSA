package prjAula26;
import java.util.Scanner;
public class Faixa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double i, Idade, Faixa1, Faixa2, Faixa3,Faixa4,Faixa5,FaixaTotal;
		i=1;
		Faixa1 = 0;
		Faixa2= 0;
		Faixa3= 0;
		Faixa4= 0;
		Faixa5= 0;
		do {
			System.out.print("Insira a idade da pessoa:");
			Idade = ler.nextInt();
			if(Idade <16) {
				Faixa1++;
			}
			else if(Idade<30) {
				Faixa2++;
			}
			else if(Idade<45) {
				Faixa3++;
			}
			else if (Idade<60) {
				Faixa4++;
			}
			else {
				Faixa5++;
			}
			System.out.println("Deseja Continuar? 1-Sim 2-Não");
			i = ler.nextInt();
		}while(i==1);
		System.out.println("Existem "+Faixa1+" na primeira faixa etária" );
		System.out.println("Existem "+Faixa2+" na segunda faixa etária" );
		System.out.println("Existem "+Faixa3+" na terceira faixa etária" );
		System.out.println("Existem "+Faixa4+" na quarta faixa etária" );
		System.out.println("Existem "+Faixa5+" na quinta faixa etária" );
		FaixaTotal = Faixa1+Faixa2+Faixa3+Faixa4+Faixa5;
		Faixa1 = (Faixa1/FaixaTotal)*100;
		Faixa2 = (Faixa2/FaixaTotal)*100;
		Faixa3 = (Faixa3/FaixaTotal)*100;
		Faixa4 = (Faixa4/FaixaTotal)*100;
		Faixa5 = (Faixa5/FaixaTotal)*100;
		System.out.println(Faixa1+"% das pessoas estão nessa faixa" );
		System.out.println(Faixa2+"% das pessoas estão nessa faixa" );
		System.out.println(Faixa3+"% das pessoas estão nessa faixa" );
		System.out.println(Faixa4+"% das pessoas estão nessa faixa" );
		System.out.println(Faixa5+"% das pessoas estão nessa faixa" );
		ler.close();
	}

}
