package calculadora_de_matriz;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		

		System.out.println("Informe o primeiro valor: ");
		float a = sc.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		float b = sc.nextInt();
		
		if(b==0) {
			System.out.println("Não existe divisão por 0, informe outro valor");
		}else {
		
		System.out.println("Soma " + (a + b));
		System.out.println("Subtracao " + (a - b));
		System.out.println("Multiplicacao " + (a * b));
		System.out.println("Divisão " + (a / b));
		System.out.println("Resto da divisão " + (a % b));
		System.out.println("Numero elevado " + (Math.pow(a, b)));
		
		}
		sc.close();
	}

}
