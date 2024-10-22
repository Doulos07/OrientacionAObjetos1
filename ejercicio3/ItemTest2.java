package Presupuesto.ejercicio3;

public class ItemTest2 {

	public static void main(String[] args) {
		
		Item item = new Item("Azucar", 60, 2);
        System.out.println("Detalle:     " + item.getDetalle());
        System.out.println("Precio unit: " + item.getCostoUnitario());
        System.out.println("Cantidad:    " + item.getCantidad());
        System.out.println("Costo total: " + item.costo());

	}

}
