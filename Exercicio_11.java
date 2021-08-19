package curso_program;
import java.util.Scanner;
public class Exercicio_11 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digita a Temperatura em Celsius: ");
        int celsius = sc.nextInt();


        double fahre = ( celsius * 9)/5 + 32;

        System.out.println("A temperatura em Fahrenheit é: "+fahre );


        sc.close();

	}

}
