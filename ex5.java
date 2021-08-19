package calculadora_de_matriz;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um numero entre 1000 e 9999");
		int n = sc.nextInt();
		
		int n1,n2,n3,n4;
		if(n > 1000 && n <= 9999) {
			n1 = n/1000;
			n2 = (n%1000)/100;
			n3 = (n%100)/10;
			n4 = (n%10)%10;
			
			
			
			int result = n1+n3;
			int result2 = n4-n2;
			
			System.out.printf("%d + %d = %d\n",n1,n3,result);
			System.out.printf("%d - %d = %d",n4,n2,result2);
		}else {
			System.out.println("Valor invalido");
		}
		
		
	
		
		
		sc.close();
	}

}
