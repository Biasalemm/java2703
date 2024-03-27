package exercicios2703;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
		int num1,num2,num3;
		
		System.out.println("Digite o valor da lado a: ");
		num1 = ler.nextInt ();
		
		System.out.println("Digite o valor da lado b: ");
		num2 = ler.nextInt ();
		
		System.out.println("Digite o valor do comprimento: ");
		num3 = ler.nextInt ();
		
		if (num1 == num2 && num2 == num3 ) {
			System.out.println("Seu triangulo é EQUILÁTERO ");	
		} 
		else if (num1 == num2 || num2 == num3 ||  num3 == num1 ) {
			System.out.println("Seu triangulo é ISÓSCELES ");		
		} 
		else {
			System.out.println("Seu triangulo é ESCALENO ");	
		} 
		
		ler.close();
		
		
	}

}
