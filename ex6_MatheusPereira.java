
package matheus;



/* Escreva uma aplica��o que leia um valor num�rico real que representa uma 
temperatura na escala Celsius. A aplica��o deve converter tal valor em seu 
equivalente na escala Fahrenheit com o uso de uma fun��o. A fun��o deve retornar 
o resultado, que ser� impresso no programa principal.
fahrenheit = (celsius * 9)/5 + 32
 */
public class ex6_MatheusPereira {

	public static void main(String[] args) {
		double numero = Biblioteca.lerReal();
		double resultado = ePar(numero);
		System.out.printf("%.2f graus celcius em fahrenheit �: %.2f", numero, resultado);
		
	}

	private static double ePar(double numero) {
		double result = (numero * 9)/5 +32;
		return result;

}
	
}
