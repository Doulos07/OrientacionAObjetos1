package GenealogiaSalvaje.ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.xml.stream.StreamFilter;

public class Mamifero extends Object{
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	private List<Mamifero> mamiferos = new ArrayList<>();
	
	Mamifero (){
	}
	
	Mamifero (String ID){
		setIdentificador(ID);
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
		mamiferos.add(padre);
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
		mamiferos.add(madre);
	}
	public Mamifero getAbueloPaterno() {
		if (esNull(madre)) {
			return null;
		}
		return this.padre.getPadre();
	}
	public Mamifero getAbuelaPaterna() {
		if (esNull(madre)) {
			return null;
		}
		return this.padre.getMadre();
	}
	public Mamifero getAbueloMaterno() {
		if (esNull(madre)) {
			return null;
		}
		return this.madre.getPadre();
	}
	public Mamifero getAbuelaMaterna() {
		if (esNull(madre)) {
			return null;
		}
		return this.madre.getMadre();
	}
	
	public boolean esNull (Mamifero mamifero) {
		if (mamifero == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean tieneComoAncestroA (Mamifero unMamifero) {
		boolean ok = mamiferos.stream().anyMatch(mamiferos -> (mamiferos == unMamifero)||(mamiferos.tieneComoAncestroA(unMamifero)));
		return ok;
	}
	//boolean ok = unMamifero.stream().anyMatch(mamifero -> mamifero.getEdad() > 10);
}
