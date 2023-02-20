package test;
public class Asiento {
	//Atributos
	
	String color;
	Integer precio;
	Integer registro;
	
	//Metodos
	
	public void cambiarColor(String color) {
	
		String colores []= {"rojo", "verde", "amarillo", "negro", "blanco"};
		for (char i = 0; i<colores.length; i++){
			if (color == colores[i]) {
				this.color = color; 
			}
		}
	}
}
