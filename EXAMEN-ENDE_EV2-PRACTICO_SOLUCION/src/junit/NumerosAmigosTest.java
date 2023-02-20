package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosAmigosTest {

	@Test
	public void testAmigoMal() {
		NumerosAmigos na=new NumerosAmigos(221,283);
		assertFalse(na.amigo());
	}
	@Test
	public void testAmigoPerfecto() {
		NumerosAmigos na=new NumerosAmigos(220,284);
		assertTrue(na.amigo());
	}
	@Test
	public void testEsCeroN1() {
		NumerosAmigos na=new NumerosAmigos(0,283);
		assertNull(na.esN1IgualAN2());
	}
	@Test
	public void testN1yN2SonIguales() {
		NumerosAmigos na=new NumerosAmigos(220,220);
		assertEquals(na.esN1IgualAN2(),(Integer)1);
	}
	@Test
	public void testN1yN2NoSonIguales() {
		NumerosAmigos na=new NumerosAmigos(123,321);
		assertNotEquals(na.esN1IgualAN2(),(Integer)1);
	}

}
