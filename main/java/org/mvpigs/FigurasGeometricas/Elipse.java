package org.mvpigs.FigurasGeometricas;

public class Elipse extends FiguraGeometrica {
	
	private String nombre=null;
	private double semiejeMayor=0d;
	private double semiejeMenor=0d;
	private final double PI = Math.PI;
	
	public Elipse(double semiejeMayor,double semiejeMenor){
		
		this.semiejeMayor= semiejeMayor;
		this.semiejeMenor=semiejeMenor;
		this.nombre="elipse";
		
	}
	@Override
	public double area() {
		
		return Math.round(100*this.semiejeMayor*this.semiejeMenor*PI)/100.0;
	}

	@Override
	public String getNombre() {
		
		return this.nombre;
	}

	

}
