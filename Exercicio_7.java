package curso_program;
import java.util.Scanner;
public class Exercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe um numero: ");
		int n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println("O numero é par");
		}else {
			System.out.println("O numero é impar");
		}
		
		
		
		
		sc.close();

	}

}
