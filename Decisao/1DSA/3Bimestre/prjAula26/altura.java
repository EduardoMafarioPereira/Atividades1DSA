package prjAula26;
import java.util.Scanner;
public class altura {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double joao, pedro;
		int i;
		i=0;
		joao =134;
		pedro = 145;
		do {
			joao= joao+2.5;
			pedro = pedro+2;
			i++;
			
		}while (joao<pedro);
		i++;
		System.out.println("joão passará a altura de pedro em "+i+" anos");
		ler.close();
	}

}
