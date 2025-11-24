package prjAula29Vetor;
import java.util.Scanner;
public class MerendaSenha {

	public static void main(String[] args) {

			Scanner ler = new Scanner(System.in);
			final int TAM = 10;
			int i; int a[]; int senha; int QtdPessoa;
			boolean funcional = true;
			
			a = new int [TAM];
			System.out.print("As senhas são: ");
			for(i=0;i<TAM;i++) {
				a[i] = (int) (Math.random()*100);
				System.out.print(a[i]+" ");
			}
			for(QtdPessoa = 0;QtdPessoa<TAM;QtdPessoa++) {
				System.out.println(" ");
				System.out.println("Insira sua senha:");
				senha = ler.nextInt();
				
				for(i=0;i<TAM;i++) {
					if(a[i] == senha) {
						funcional = true;
						a[i] = 10000;
						break;
					}
					else {
						funcional = false;
					}
					
					
					
				}
				if(funcional == false ) {
					System.out.println("senha errada, VAZA");
					
				}
				if(funcional == true) {
					System.out.println("senha verdadeira, Vai comer meu fi");
					
				}
			}
			ler.close();
		
		
		
		
		
		
		
	

	}

}
