package domenskiObjekti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StavkaRacunaTest {

	private StavkaRacuna stavkaRacuna;
	
	@BeforeEach
	void setUp() throws Exception {
		stavkaRacuna = new StavkaRacuna();
	}

	@AfterEach
	void tearDown() throws Exception {
		stavkaRacuna = null;
	}

	@Test
	void testStavkaRacuna() {
		Artikal a = new Artikal(1, "sok", "jabuka", 140);
		StavkaRacuna sr = new StavkaRacuna(a, 2);
		assertEquals("sok", sr.getArtikal().getNaziv());
		assertEquals("jabuka", sr.getArtikal().getOpis());
		assertEquals(140, sr.getArtikal().getCena());
		assertEquals(1, sr.getArtikal().getArtikalId());
		assertEquals(2, sr.getKolicina());
	}
	
	@Test
	void testSetArtikalOK() {
		Artikal a = new Artikal(5, "espresso", "sa mlekom", 199.99);
		stavkaRacuna.setArtikal(a);		
		assertEquals("espresso", stavkaRacuna.getArtikal().getNaziv());
		assertEquals("sa mlekom", stavkaRacuna.getArtikal().getOpis());
		assertEquals(199.99, stavkaRacuna.getArtikal().getCena());
		assertEquals(5, stavkaRacuna.getArtikal().getArtikalId());
	}

	@Test
	void testSetArtikalNull() {
		assertThrows(NullPointerException.class, ()->stavkaRacuna.setArtikal(null));
	}
	
	@Test
	void testSetKolicinaOK() {
		stavkaRacuna.setKolicina(4);
		assertEquals(4, stavkaRacuna.getKolicina());
	}
	
	@Test
	void testSetKolicinaNeispravo() {
		assertThrows(IllegalArgumentException.class, ()->stavkaRacuna.setKolicina(-4));
	}
}
