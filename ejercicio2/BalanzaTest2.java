package BalanzaElectronica.ejercicio2;

public class BalanzaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balanza b = new Balanza();
        
        Producto queso = new Producto();
        queso.setPeso(1.5);
        queso.setPrecioPorKilo(140);
        queso.setDescripcion("Queso");
        
        Producto jamon = new Producto();
        jamon.setPeso(0.5);
        jamon.setPrecioPorKilo(180);
        jamon.setDescripcion("Jamon");
        
        b.agregarProducto(queso);
        b.agregarProducto(jamon);
        System.out.println(b.getCantidadDeProductos());
        System.out.println(b.getPesoTotal());
        System.out.println(b.getPrecioTotal());
        
        //b.ponerEnCero();
        
        System.out.println();
        Ticket ticket = b.emitirTicket();
        System.out.println(ticket.getFecha());
        System.out.println(ticket.getCantidadDeProductos());
        System.out.println(ticket.getPrecioTotal());
        System.out.println(ticket.impuesto());
	}

}
