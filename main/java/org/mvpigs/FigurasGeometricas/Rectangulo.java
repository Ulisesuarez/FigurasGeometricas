package org.mvpigs.FigurasGeometricas;

public class Rectangulo  extends FiguraGeometrica{

	private double ancho;
	private double largo;
	private String nombre;

	public Rectangulo(double ancho, double largo) {
		super();
		this.ancho=ancho;
		this.largo=largo;
		this.nombre="rectángulo";
	}

	@Override
	public double area() {
		
		return this.ancho*this.largo;
	}

	@Override
	public String getNombre() {
		
		return this.nombre;
	}
	
	

}
