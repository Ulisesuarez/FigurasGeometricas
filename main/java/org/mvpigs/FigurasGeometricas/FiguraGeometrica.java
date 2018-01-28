package org.mvpigs.FigurasGeometricas;

public abstract class FiguraGeometrica {
	
	

	private String nombre;
	 


	public FiguraGeometrica(){
		super();
		this.nombre="";
		
		
	}

	
	public abstract double area();
	
	public abstract String getNombre();
	
	
	
}
