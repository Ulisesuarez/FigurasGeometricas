package org.mvpigs.FigurasGeometricas;

public class Cuadrado extends FiguraGeometrica {

	private double lado=0d;
	private String nombre=null;

	public Cuadrado(double lado){
		
		super();
		this.lado=lado;
		this.nombre="cuadrado";
		
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(this.lado, 2);
	}

	@Override
	public String getNombre() {
		
		return super.getNombre();
	}

}
