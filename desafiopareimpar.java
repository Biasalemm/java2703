package exercicios2703;

import java.util.Scanner;

public class desafiopareimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int num; 
	
		System.out.println("Informe um numero");
		num = ler.nextInt ();
		
		if (num % 2 == 0) {
			System.out.println("O numero é Par ");
			}
		if (num  % 2 != 0) {
			System.out.println("O numero é Impar ");
			}
		
ler.close();
	}

}
