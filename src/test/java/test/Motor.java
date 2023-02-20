package test;
public class Motor {
	//Atributos
	
	Integer numeroCilindros;
	String tipo;
	Integer registro;
	
	//Metodos
	
	public void cambiarRegistro(Integer registro) {
		this.registro = registro;
	}
	
	public void asignarTipo(String tipo) {
		if ((tipo == "electrico" )||(tipo == "gasolina") ){
			this.tipo = tipo;
		}
	}
}
