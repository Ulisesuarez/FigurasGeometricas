package org.mvpigs.FigurasGeometricas;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestElipse {

	@Test
	public void testElipse() {
		Elipse elipse1 =new Elipse(2,3);
		Assert.assertEquals(18.85, elipse1.area());
		Assert.assertEquals("elipse",elipse1.getNombre());
	}

}
