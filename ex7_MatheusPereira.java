package matheus;

public class ex7_MatheusPereira {

		public static void main(String[] args) {
			double a = Biblioteca.lerReal();
			double b = Biblioteca.lerReal();
			double c = Biblioteca.lerReal();
			boolean resultado = ePar(a,b,c);
			
			if(resultado) {
				System.out.println("Forma um triangulo");
			}else {
				System.out.println("Não forma");
			}
			
			
		}

		private static boolean ePar(double a, double b, double c) {
			if(a<b + c && b < a + c && c < a+b) {
				return true;
				
			}else {
				return false;
			}

	}
		
	}


