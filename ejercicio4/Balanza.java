package BalanzaMejorada.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos = new ArrayList<Producto>();
	
	
	public Balanza(Producto prod) {
		productos.add(prod);
	}

	
	public Balanza() {

	}

	
	public void ponerEnCero () {
		this.productos.clear();
	}
	

	public void agregarProducto (Producto prod) {
		this.productos.add(prod);
	}

	
	public List<Producto> getProductos(){
		return productos;
	}
	
	
	public Ticket emitirTicket (){
		Ticket ticket = new Ticket (productos);
		ponerEnCero();
		return ticket;
	}

}
