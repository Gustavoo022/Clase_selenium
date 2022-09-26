package Clase_3;

public class Gato {

	public String nombre;
	private int edad; 
	public String raza; 
	
	public void hablar() { 
		System.out.println("Mi nombre es: " + this.nombre + "miau"); 
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Gato(String nombre, int edad, String raza) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}
	

}
