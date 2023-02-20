package test;
public class Auto {
	
	public static void main(String[] args) {
		//Asiento asientos[] = new Asiento[10]; *se crea una lista con objetos Asiento*
		//Motor motor = new Motor();

	}
	//Atributos
	
	String modelo;
	Integer precio;
	Asiento asientos [];
	String marca;
	Motor motor;
	Integer registro;
	static Integer cantidadCreados;
	
	//Metodos
	
	public int cantidadAsientos() {
		int total = 0;
		for (char i = 0; i<asientos.length;i++){ 
			if(asientos[i] instanceof Asiento ){
				total ++;
			}
		}
		return total;
	}	
	public String verificarIntegridad() {
		if(registro != motor.registro){
			return "Las piezas no son originales";
		}
		else{
			for (char z = 0; z<asientos.length; z++){ 
				if(registro != asientos[z].registro){
					return "Las piezas no son originales";
				}
				else{
					return "Auto original";
				}
			}
			return "Auto original";
		}	
			
	}
	
}
