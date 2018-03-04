package org.mvpigs.FigurasGeometricas;

public class Rectangulo  extends FiguraGeometrica{

	private double ancho=0d;
	private double largo=0d;
	private String nombre=null;
	

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
