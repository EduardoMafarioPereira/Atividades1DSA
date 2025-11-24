package prjAula27;
import java.util.Scanner;
public class ProximoDia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia,mes, ano, i;
		
		do {
			System.out.println("Insira o dia atual");
			dia = ler.nextInt();
			System.out.println("Insira o mês atual");
			mes = ler.nextInt();
			System.out.println("Insira o ano atual");
			ano = ler.nextInt();
			dia++;
			if(dia ==32 && mes != 12 ) {
				dia=1;
				mes++;
			}
			if(dia ==32 && mes % 2 ==0 && mes !=12) {
				mes++;
				dia =1;
			}
			if(dia ==31 && mes % 2 ==0) {
				mes++;
				dia =1;
			}
			if(dia ==30 && mes ==2 && ano % 4 ==0) {
				dia = 1;
				mes++;
			}
			if(dia ==29 && mes ==2 && ano % 4 !=0) {
				dia = 1;
				mes++;
			}
			if(dia == 32 && mes >=12) {
				dia=1;
				mes=1;
				ano++;
			}
			System.out.println("O próximo dia é "+dia+"/"+mes+"/"+ano);
			System.out.println("Deseja continuar 1-sim 2-não");
			i = ler.nextInt();
		
		}while(i==1);

		System.out.println("O próximo dia é "+dia+"/"+mes+"/"+ano);
		ler.close();
	}

}
