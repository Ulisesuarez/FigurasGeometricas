package org.mvpigs.FigurasGeometricas;

public abstract class FiguraGeometrica {
	
	

	private String nombre=null;
	 


	public FiguraGeometrica(){
		
		this.nombre="desconocido";
		
		
	}
	public FiguraGeometrica(String nombre){
		this.nombre=nombre;
	}

	
	public abstract double area();
	
	public  String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
}
	
	
	
}
