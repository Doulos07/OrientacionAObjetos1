package Presupuesto.ejercicio3;

public class PresupuestoTest2 {

	public static void main(String[] args) {
		Presupuesto p = new Presupuesto(""); 
	       
	       System.out.println("Total: " + p.calcularTotal());
	       
	       Item item = new Item("leche", 50, 3);
	       p.agregarItem(item);
	       
	       item = new Item("Chocolatada", 120, 2);
	       p.agregarItem(item);
	       
	       System.out.println("Total: " + p.calcularTotal());

	}

}
