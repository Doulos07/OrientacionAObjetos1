package BalanzaMejorada.ejercicio4;

public class ProductoTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Producto queso = new Producto();
	        
	        queso.setDescripcion("queso");
	        if(queso.getDescripcion().equals("queso")){
	            System.out.println(queso.getDescripcion());
	        }
	        queso.setPrecioPorKilo(250);
	        if(queso.getPrecioPorKilo() == 250) {
	            System.out.println(queso.getPrecioPorKilo());
	        }
	        queso.setPeso(2);
	        if(queso.getPeso() == 2){
	        System.out.println(queso.getPeso());
	        }
	        if(queso.getPrecioPorKilo() == 500){
	            System.out.println(queso.getPrecioPorKilo());
	        }
	}

}
