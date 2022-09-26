package Clase_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String lecturaConsola;
		int opcion = 0;
		int num1, num2;
		do {
			System.out.println("Indica la opcion");
			System.out.println("1. Suema");
			System.out.println("2. Resta");
			System.out.println("3. Multriplicacion");
			System.out.println("4. Division");
			System.out.println("5. Salir");
			
			lecturaConsola = reader.readLine();
			opcion = Integer.parseInt(lecturaConsola);
			
			switch(opcion) {
			
			case 1:
				System.out.println("Ingresa el primer numero");
				lecturaConsola = reader.readLine();
				num1 = Integer.parseInt(lecturaConsola);
				System.out.println("Ingresa el segundo numero");
				lecturaConsola = reader.readLine();
				num2 = Integer.parseInt(lecturaConsola);
				
				System.out.print("La suma es ");
				System.out.println(num1 + num2);
				System.out.println("");
				break;
				
			case 2:
				System.out.println("Ingresa el primer numero");
				lecturaConsola = reader.readLine();
				num1 = Integer.parseInt(lecturaConsola);
				System.out.println("Ingresa el segundo numero");
				lecturaConsola = reader.readLine();
				num2 = Integer.parseInt(lecturaConsola);
				
				System.out.print("La resta es ");
				System.out.println(num1 - num2);
				System.out.println("");
				break;
				
			case 3: 
				System.out.println("Ingresa el primer numero");
				lecturaConsola = reader.readLine();
				num1 = Integer.parseInt(lecturaConsola);
				System.out.println("Ingresa el segundo numero");
				lecturaConsola = reader.readLine();
				num2 = Integer.parseInt(lecturaConsola);
				
				System.out.print("La multriplicacion es ");
				System.out.println(num1 * num2);
				System.out.println("");
				break;
				
			case 4:
				System.out.println("Ingresa el primer numero");
				lecturaConsola = reader.readLine();
				num1 = Integer.parseInt(lecturaConsola);
				System.out.println("Ingresa el segundo numero");
				lecturaConsola = reader.readLine();
				num2 = Integer.parseInt(lecturaConsola);
				
				if (num1 == 0) {
					System.out.println("no se puede dividir entre 0");
				}
				if (num2 == 0) {
					System.out.println("no se puede dividir entre 0");
				}
				else { 
				System.out.print("La division es ");
				System.out.println(num1 / num2);
				System.out.println("");
				}
				break;
				
			case 5: 
				System.out.println("Ingresa el primer numero");
				lecturaConsola = reader.readLine();
				num1 = Integer.parseInt(lecturaConsola);
				int factorial [] = new int[num1];
				for(int i = 0; i < factorial.length; i ++) {
					factorial[i] = i + 1;
				}
				int aux = 1;
				for(int i = 0; i < factorial.length; i++) {
					System.out.println(aux + " = " + factorial[i]);
					aux = aux * factorial[i];
				}
				System.out.println("El factorial es =" + aux);
				break;

			
		default: 
			System.out.println("Opcion no disponible");
		}
		
		}

	

	}

}
