package calculadora_de_matriz;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maior = 0, menor = 0;
		
		System.out.println("Informe o primeiro");
		int n1 = sc.nextInt();
		
		System.out.println("Informe o segundo valor");
		int n2 = sc.nextInt();
		
		System.out.println("Informe o terceiro valor");
		int n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			maior = n1;
		}else if(n1 < n2 && n1 < n3) {
			menor = n1;
		}
		if(n2 > n1 && n2 > n3) {
			maior = n2;
		}else if(n2 < n1 && n2 < n3) {
			menor = n2;
		}
		if(n3 > n1 && n3 > n2) {
			maior = n3;
		}else if(n3 < n1 && n3 < n2) {
			menor = n3;
		}
		
		System.out.println("O maior é igual a: "+maior);
		System.out.println("O menor é igual a: "+menor);
		
		
		sc.close();

	}

}
