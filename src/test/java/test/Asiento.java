package test;
import java.util.ArrayList;
public class Asiento {
	//Atributos
	
	String color;
	Integer precio;
	Integer registro;
	
	//Metodos
	
	public void cambiarColor(String color) {
		ArrayList<String> colores = new ArrayList<>();
		colores.add("rojo verde amarillo negro blanco");
		if (colores.contains(color)) {
		this.color = color; 
		}
	}
}
