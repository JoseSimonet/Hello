
import java.util.Scanner;

public class Años {
	
		private static Scanner teclado;
		
		public static void main(String[] args) {
			//Esto es una modificación..
			//Edicion.
			teclado = new Scanner(System.in);
			int AñoNac,AñoAct;
			System.out.println("Por favor introduzca su año de nacimiento: ");
			AñoNac = teclado.nextInt();
			System.out.println("Por favor introduzca el año actual: ");
			AñoAct = teclado.nextInt();
			double edad;
		//Hecho por José María
			edad = (AñoAct-AñoNac);
			
			System.out.println("Su edad es: " +edad);
		}
}
