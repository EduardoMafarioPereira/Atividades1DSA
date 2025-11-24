package prjAula022;
import java.util.Scanner;
public class Site {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double produto, descontoPix, produtoPix, descontoCartao, produtoCartao;
		System.out.println("insira o valor do produto:");
		produto = ler.nextDouble();
		descontoPix = produto/100*10;
		produtoPix = produto-descontoPix;
		descontoCartao = produto/100*5;
		produtoCartao=produto-descontoCartao;
		
		System.out.println("O valor do produto pelo cartão é "+produtoCartao);
		System.out.println("O valor do produto pelo pix é "+produtoPix);
		ler.close();

	}

}
