package org.mvpigs.FigurasGeometricas;

public class Circulo extends FiguraGeometrica {
	
	private double radio;
	private String nombre;

	public Circulo(double i) {
		super();
		
		this.setRadio(i);
		this.nombre="círculo";
		

	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.round(100*Math.pow(this.radio, 2)*Math.PI)/100.0 ;
	}

	

	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

}
