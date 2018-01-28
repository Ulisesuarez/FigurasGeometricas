package org.mvpigs.FigurasGeometricas;

public class Elipse extends FiguraGeometrica {
	
	private String nombre;
	private double semiejeMayor;
	private double semiejeMenor;
	
	public Elipse(double semiejeMayor,double semiejeMenor){
		
		this.semiejeMayor= semiejeMayor;
		this.semiejeMenor=semiejeMenor;
		this.nombre="elipse";
		
	}
	@Override
	public double area() {
		
		return Math.round(100*this.semiejeMayor*this.semiejeMenor*Math.PI)/100.0;
	}

	@Override
	public String getNombre() {
		
		return this.nombre;
	}

	

}
