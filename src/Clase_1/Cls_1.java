package Clase_1;

public class Cls_1 {

	public static void main(String[] args) {
		
		String nombre = "Carlos";
		char letra = 'a';
		int numero = 4;
		String numer2 = '4';
		
		System.out.println(numero);
		System.out.println(numer2);
		
		int suma = numero + 1;
		System.out.println(suma);
		
		String suma2 = numer2 +"b";
		System.out.println(suma2);

		
		if(suma >= 5) {
			System.out.println("el numero es mayor o igual que 5");
		}
		
		for (int i = 0; i <= 100; i++) {
			if(i%2 == 0) {
				System.out.print(i + " ");
				System.out.println("es par");
			}else {
				System.out.print(i);
				System.out.println("es impar");
			}
		}
		
		
		

	}

}
