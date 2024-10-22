package VolumenYSuperficieDeSolidos.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {

	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<>();
	}
	
	public void addPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public List<Pieza> getPiezas (){
		return this.piezas;
	}

	public double getVolumenDeMaterial(String material) {
		return this.piezas.stream().filter(p -> p.getMaterial().equals(material)).
				mapToDouble(Pieza :: getVolumenDeMaterial).sum();
	} // p -> p.getVolumenDeMaterial() tambien sirve, utilizo la otra por legibilidad
	
	public double getSuperficieDeColor(String color) {
		return this.piezas.stream().filter(p -> p.getColor().equals(color)).
				mapToDouble(Pieza :: getSuperficieDeColor).sum();
	}
}
