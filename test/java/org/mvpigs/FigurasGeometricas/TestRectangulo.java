package org.mvpigs.FigurasGeometricas;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestRectangulo {

	
	/**Define una clase Rectangulo para instanciar 
	 * objetos de esta figura geométrica, que permita calcular su área a partir de sus lados.
	 */

	@Test
	
	public void testRectangulo() {
		Rectangulo rectangulo1=new Rectangulo(10.0,5.0);
		Assert.assertEquals(50.0,rectangulo1.area(),0.01);
	}
	/**Escribe un programa que almacene en un Array objetos de tipo Círculo y Rectángulo.
	 * El programa instancia objetos de tipo Círculo y de tipo Rectángulo, define sus propiedades,
	 y los añade a un Array. 
	A continuación, muestra por pantalla el nombre y el área de todas las figuras almacenadas en el array.
	 */
	@Test
	
	public void testNombreRectangulo(){
		
		Rectangulo rectangulo1=new Rectangulo(10.0,5.0);
		Assert.assertEquals("rectángulo", rectangulo1.getNombre());
		
		
	}

}
