package org.mvpigs.FigurasGeometricas;

import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class TestFiguraGeometrica {

	/**Escribe un programa que almacene en un Array objetos de tipo Círculo y Rectángulo.
	 * El programa instancia objetos de tipo Círculo y de tipo Rectángulo, define sus propiedades,
	 y los añade a un Array. 
	A continuación, muestra por pantalla el nombre y el área de todas las figuras almacenadas en el array.
	 */
	

	@Test
	public void testFiguraGeometrica() {
		Circulo c1=new Circulo(10);
		Rectangulo r1 = new Rectangulo(5,10);
		ArrayList<FiguraGeometrica> figura1 = new ArrayList<FiguraGeometrica>();
		figura1.add(c1);
		
		figura1.add(r1);
		System.out.println(figura1.toArray()[0].getClass().getSuperclass());
		Assert.assertEquals(figura1.toArray()[0].getClass().getSuperclass(),figura1.toArray()[1].getClass().getSuperclass());
		
	}

}
