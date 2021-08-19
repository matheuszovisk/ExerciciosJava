package calculadora_de_matriz;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Informe o inicio: ");
		int ini = sc.nextInt();
		System.out.println("Informe o fim: ");
		int fim = sc.nextInt();
		

		for(int i=ini; i<=fim; i++) {
			if(i%2 == 0) {
				soma += i; 
				System.out.println("Numeros pares: " +i);
			}
		}
		
		System.out.println("\nA soma dos numeros pares é igual a: " + soma);
		
		sc.close();
	}

}
