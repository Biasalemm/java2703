package exercicios2703;

import java.util.Scanner;

public class desafioPositivoNegativo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num;
		
		System.out.println("Informe um numero");
		num = ler.nextInt ();
		
		if (num == 0) {
			System.out.println("O numero é igual a ZERO ");
			}
		if (num > 1) {
			System.out.println("O numero é Positivo ");
			}
		if (num < 0) {
			System.out.println("O numero é Negativo ");
			}
ler.close();
	}

}
