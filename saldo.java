package exercicios2703;

import java.util.Scanner;

public class saldo { 
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		String sen,log,cpf;
		double val,saldf,saldo=7689;

		System.out.println("Seja Bem vindo, vamos iniciar seu cadastro? ");
		log = ler.nextLine();
		System.out.println("Digite seu CPF: ");
		cpf = ler.nextLine();
        
        
		if (cpf.equals( "43155048824")) {
			System.out.println("Digite sua senha: ");
			sen = ler.nextLine();
			System.out.println();
			if (sen.equals("246680")) {
				System.out.println("ACESSO AUTORIZADO");
				System.out.println("Seu saldo atual é de R$:" + saldo);
				System.out.println("Qual valor você deseja sacar?");
				val = ler.nextDouble();
				if (val <= saldo) {
					saldf = saldo - val;
					System.out.println("Seu saldo foi alterado, o valor atual é " + saldf);	
				}
				else {
					System.out.println("saldo insuficiente"); }
			}
			else {
				System.err.println("Senha incorreta");}
		}
		else { 
			System.out.println("CPF inválido");
		}

		ler.close();
	}
}