package BalanzaElectronica.ejercicio2;

//import java.util.Date; { Esta Obsoleto no Utilizar }
import java.time.LocalDate;

public class Ticket extends Balanza{
	
	private LocalDate fecha;
	
	
	
	Ticket (int cant, double precio, double peso) {
		super(cant, precio, peso);
		fecha = LocalDate.now();
	}
	
	
	public double impuesto () {
		return getPrecioTotal()*0.21;
	}

	//(getPrecioTotal()+(getPrecioTotal()*21)/100);
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	
}
