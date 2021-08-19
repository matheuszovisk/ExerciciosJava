package teste;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int v[] = new int [10];
		
		
		int soma = 0;
		for(int i = 1; i<=v.length; i++) {
			System.out.println("Informe um numero: ");
			int n = sc.nextInt();
			soma += n;
		}
		
		
	System.out.println("soma = "+ soma);
	System.out.println("media = "+ soma/2);

	
		
		
		sc.close();
	}

}
