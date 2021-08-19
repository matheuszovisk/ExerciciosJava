package teste;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double v[] = new double[20];
		
		double soma = 0;
		for(int i=0; i<v.length; i++) {
			System.out.println("Informe um numero real");
			double n = sc.nextDouble();
			soma += n;
		}
		
		System.out.println("Soma = " + soma);
		System.out.println("Media = " + soma/2);
		
		
		
		sc.close();

	}

}
