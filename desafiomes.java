package exercicios2703;

import java.util.Scanner;

public class desafiomes {
   public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int numero;
		System.out.println("Digite o numero do mês : ");
		numero = ler.nextInt ();
		
		if (numero == 1) {
		System.out.println("O mês correpondente é Janeiro ");
		}
		if (numero == 2) {
			System.out.println("O mês correpondente é Fevereiro ");
	    }
		if (numero == 3) {
			System.out.println("O mês correpondente é Março ");
		}
		if (numero == 4) {
			System.out.println("O mês correpondente é Abril ");
			}
		if (numero == 5) {
			System.out.println("O mês correpondente é Maio ");
			}
		if (numero == 6) {
			System.out.println("O mês correpondente é junho ");
			}
		if (numero == 7) {
			System.out.println("O mês correpondente é julho ");
			}
		if (numero == 8) {
			System.out.println("O mês correpondente é Agosto ");
			}
		if (numero == 9) {
			System.out.println("O mês correpondente é Setembro ");
			}
		if (numero == 10) {
			System.out.println("O mês correpondente é Outubro ");
			}
		if (numero == 11) {
			System.out.println("O mês correpondente é Novembro ");
			}
		if (numero == 12) {
			System.out.println("O mês correpondente é Dezembro");
			}
		else if (numero > 12){
			System.out.println("Mês inexistente");
		}
		
		else if (numero < 1) {
			System.out.println("mês inexistente");
		}
		
		
				
		ler.close();
	}

}
