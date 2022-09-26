package Clase_3;

public class Zoologico {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro("Mamifero", false , "Rex" , 4, "Pastor aleman");
		perro1.hablar();
		Perro perro2 = new Perro("Mamifero", false , "Firulais" , 4, "French Puddle");
		perro2.hablar();
		Perro perro3 = new Perro("Mamifero", false);
		perro3.nombre = "Rex3";
		
		Animal1 perro4 = new Perro("Mamifero" , false);
		
		perro1.nombre = "Rex2";
		perro1.hablar();
		
		perro1.setEdad(2);
		
		Perro.presentaion(perro1);
		Perro.presentaion(perro3);
		Perro.presentaion(perro2);

	}

}
