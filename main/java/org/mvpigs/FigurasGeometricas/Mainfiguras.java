package org.mvpigs.FigurasGeometricas;

import java.util.ArrayList;

public class Mainfiguras {

	/**Escribe un programa que almacene en un Array objetos de tipo Círculo y Rectángulo.
	*El programa instancia objetos de tipo Círculo y de tipo Rectángulo, define sus 
	*propiedades, y los añade a un Array. 
	*A continuación, muestra por pantalla el nombre y el área de todas las figuras 
	*almacenadas en el array.
	*/
	public static void main(String[] args) {
		
		ArrayList<FiguraGeometrica> Figuras= new ArrayList<FiguraGeometrica>();
		
		
		Circulo primerCirculo= new Circulo(2);
		Circulo segundoCirculo= new Circulo(4);
		
		Rectangulo primerRectangulo= new Rectangulo(4,5);
		Rectangulo segundoRectangulo= new Rectangulo(3,5);
		
		Cuadrado primerCuadrado= new Cuadrado(5);
		Cuadrado segundoCuadrado= new Cuadrado(10);
		
		Elipse primeraElipse= new Elipse(2,3);
		Elipse segundaElipse= new Elipse(1,3);
		
		Figuras.add(primerCirculo);
		Figuras.add(primerRectangulo);
		Figuras.add(primerCuadrado);
		Figuras.add(primeraElipse);
		Figuras.add(segundoCirculo);
		Figuras.add(segundoRectangulo);
		Figuras.add(segundoCuadrado);
		Figuras.add(segundaElipse);
		
		
		for (FiguraGeometrica Figura : Figuras){
			
			System.out.println(Figura.getNombre());
			System.out.println(Figura.area());
			
		}
		
		
		
		
		
		
	}

}
