package ElInversor.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	
	private String nombre;
	private List <Inversiones> inversiones;
	
	
	public Inversor (String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<>();
	}
	
	public List<Inversiones> getInversiones (){
		return inversiones;
	}
	
	public void addInversion (Inversiones inversiones) {
		this.inversiones.add(inversiones);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double inversionTotal () {
		return this.inversiones.stream().mapToDouble((inversiones -> inversiones.valorActual())).sum();
	}
	
	
	
}
