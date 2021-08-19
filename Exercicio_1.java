package curso_program;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Informe seu nome: ");
		nome = sc.nextLine();
		
		for(int i=0; i < 10; i++) {
			System.out.println(nome);
		}
		
		
		sc.close();
	}

}
