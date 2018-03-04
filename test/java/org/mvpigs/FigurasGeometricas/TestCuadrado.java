package org.mvpigs.FigurasGeometricas;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestCuadrado {

	
	@Test
	public void testCuadrado() {
		Cuadrado cuadrado1= new Cuadrado(2.0);
		Assert.assertEquals(4.0, cuadrado1.area());
		Assert.assertEquals("cuadrado",cuadrado1.getNombre());
	}

	
}
