
package matheus;



/* Escreva uma aplicação que leia um valor numérico real que representa uma 
temperatura na escala Celsius. A aplicação deve converter tal valor em seu 
equivalente na escala Fahrenheit com o uso de uma função. A função deve retornar 
o resultado, que será impresso no programa principal.
fahrenheit = (celsius * 9)/5 + 32
 */
public class ex6_MatheusPereira {

	public static void main(String[] args) {
		double numero = Biblioteca.lerReal();
		double resultado = ePar(numero);
		System.out.printf("%.2f graus celcius em fahrenheit é: %.2f", numero, resultado);
		
	}

	private static double ePar(double numero) {
		double result = (numero * 9)/5 +32;
		return result;

}
	
}
