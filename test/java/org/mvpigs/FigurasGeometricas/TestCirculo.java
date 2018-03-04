package org.mvpigs.FigurasGeometricas;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestCirculo {
	
	/** Define una clase Circulo para instanciar objetos de esta figura geométrica,
	 *  que permita calcular su área a partir de su radio.
	 */

	@Test
	public void testObject() {
		
		Circulo circulo1= new Circulo(10);
		Assert.assertEquals(314.16, circulo1.area(),0.01);
		
	}
	/**Escribe un programa que almacene en un Array objetos de tipo Círculo y Rectángulo.
	 * El programa instancia objetos de tipo Círculo y de tipo Rectángulo, define sus propiedades,
	 y los añade a un Array. 
	A continuación, muestra por pantalla el nombre y el área de todas las figuras almacenadas en el array.
	 */
	@Test
	
	public void testNombreCirculo(){
		
		Circulo circulo1=new Circulo(10.0);
		Assert.assertEquals("círculo", circulo1.getNombre());
		
		
	}
}
