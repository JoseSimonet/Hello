
import java.util.Scanner;

public class A�os {
	
		private static Scanner teclado;
		
		public static void main(String[] args) {
			//Esto es una modificaci�n..
			//Edicion.
			teclado = new Scanner(System.in);
			int A�oNac,A�oAct;
			System.out.println("Por favor introduzca su a�o de nacimiento: ");
			A�oNac = teclado.nextInt();
			System.out.println("Por favor introduzca el a�o actual: ");
			A�oAct = teclado.nextInt();
			double edad;
		
			edad = (A�oAct-A�oNac);
			
			System.out.println("Su edad es: " +edad);
		}
}
