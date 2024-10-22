package BalanzaMejorada.ejercicio4;

import java.time.LocalDate;
import java.util.List;

public class Ticket extends Balanza{
	
	private LocalDate fecha;
	Ticket (){
		
	}
	
	Ticket (List<Producto>producto) {
	
	}
	
	
	public double impuesto (double total) {
		return total*0.21;
	}

	//(getPrecioTotal()+(getPrecioTotal()*21)/100);
	
	public LocalDate getFecha() {
		return this.fecha;
	}

	
	/*String text = "";
	for (Producto producto : productos) {
		text +=producto.getDescripcion()+'\n'+producto.getPeso()+'\n'+producto.getPrecioPorKilo()+'\n'+producto.precio();
	}*/
	
}
