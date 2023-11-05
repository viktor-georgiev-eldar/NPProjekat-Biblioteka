package domenskiObjekti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtikalTest {

	private Artikal artikal;
	
	@BeforeEach
	public void setUp() throws Exception {
		artikal = new Artikal();
	}

	@AfterEach
	public void tearDown() throws Exception {
		artikal = null;
	}

	@Test
	public void testArtikal() {
		artikal = new Artikal(1, "kafa", "sa mlekom", 99.99);
		
		assertEquals(1, artikal.getArtikalId());
		assertEquals("kafa", artikal.getNaziv());
		assertEquals("sa mlekom", artikal.getOpis());
		assertEquals(99.99, artikal.getCena(),0.0001);
	}


	@Test
	public void testSetArtikalId() {
		artikal.setArtikalId(2);
		assertEquals(2, artikal.getArtikalId());
	}

	@Test
	public void testSetArtikalIdNeispravno() {
		assertThrows(java.lang.IllegalArgumentException.class, () -> artikal.setArtikalId(-2));
	}
	
	@Test
	public void testSetNazivOK() {
		artikal.setNaziv("kafa");
		assertEquals("kafa", artikal.getNaziv());
	}

	@Test
	public void testSetNazivNULL() {
		assertThrows(java.lang.NullPointerException.class, () -> artikal.setNaziv(null));
	}

	@Test
	public void testSetNazivNeispravno() {
		assertThrows(java.lang.IllegalArgumentException.class, () -> artikal.setNaziv("ka"));
	}
	
	@Test
	public void testSetCena() {
		artikal.setCena(20.43);
		assertEquals(20.43, artikal.getCena(),0.0001);
	}

	@Test
	public void testSetOpis() {
		artikal.setOpis("sa mlekom");
		assertEquals("sa mlekom", artikal.getOpis());
	}


}
