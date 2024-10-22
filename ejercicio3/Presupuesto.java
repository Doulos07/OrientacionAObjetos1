package Presupuesto.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto extends Object{
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> item = new ArrayList<Item>();
	
	public Presupuesto (String cliente) {
		setCliente(cliente);
	}
	
	
	public LocalDate getFecha() {
		return fecha.now();
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	public void  agregarItem (Item item) {
		this.item.add(item);
	}
	
	public double calcularTotal () {
		double total = 0;
		for (int i = 0; i < item.size(); i++) {
			total += item.get(i).costo();
		}
		return total;
	}
}
