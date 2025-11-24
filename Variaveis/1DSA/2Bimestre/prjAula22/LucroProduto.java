package prjAula022;
import java.util.Scanner;
public class LucroProduto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double precoProduto, precoVenda, quantidadeVendida, valorUnitario, lucroTotal;
		System.out.println("Insira o preço do seu produto:");
		precoProduto = ler.nextDouble();
		System.out.println("Insira o valor de venda do produto:");
		precoVenda = ler.nextDouble();
		System.out.println("Insira a quantidade vendida de produtos:");
		quantidadeVendida = ler.nextDouble();
		
		valorUnitario = precoVenda - precoProduto;
		lucroTotal = valorUnitario*quantidadeVendida;
		System.out.println("Seu lucro total foi "+lucroTotal);
		ler.close();

	}

}
