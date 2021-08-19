package matheus;
import java.util.Scanner;
import java.util.Locale;
public class exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int num;
		
		System.out.println("Informe o seu numero: ");
		num = sc.nextInt();
		
		System.out.println("Informe seu numero de horas trabalhadas: ");
		double numt = sc.nextDouble();
		
		System.out.println("Qual o valor recebido por hora ?: ");
		double hor = sc.nextDouble();
		
		System.out.println("Number ="+ num);
		double salary = hor * numt;
		System.out.printf("Salary = U$ %.2f", salary);
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
