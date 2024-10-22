package ElInversor.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversiones{

	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresesDiarios;
	
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresesDiarios) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresesDiarios = porcentajeDeInteresesDiarios;
	}
	
	
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}



	public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
	}



	public double getMontoDepositado() {
		return montoDepositado;
	}



	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}



	public double getPorcentajeDeInteresesDiarios() {
		return porcentajeDeInteresesDiarios;
	}



	public void setPorcentajeDeInteresesDiarios(double porcentajeDeInteresesDiarios) {
		this.porcentajeDeInteresesDiarios = porcentajeDeInteresesDiarios;
	}


	public long diasTranscurridos() {
		LocalDate diaActual = LocalDate.now();
		long dias = ChronoUnit.DAYS.between(getFechaDeConstitucion(), diaActual);
		return dias;
	}

	public double valorActual() {
		return this.montoDepositado * (1 + this.porcentajeDeInteresesDiarios * diasTranscurridos());
	}
	
	
}
