package domenskiObjekti;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RacunTest {

	private Racun racun;
	
	@BeforeEach
	void setUp() throws Exception {
		racun = new Racun();
	}

	@AfterEach
	void tearDown() throws Exception {
		racun = null;
	}

	@Test
	void testRacun() {
		Korisnik k = new Korisnik();
		k.setIme("Viktor");
		Artikal a = new Artikal(1, "sok", "jabuka", 140);
		StavkaRacuna sr = new StavkaRacuna(a, 2);
		List<StavkaRacuna> lsr = new ArrayList<StavkaRacuna>();
		lsr.add(sr);
		racun = new Racun(4, k, lsr);
		
		assertEquals(4, racun.getRacunId());
		assertEquals("sok", racun.getListaStavki().get(0).getArtikal().getNaziv());
		assertEquals("Viktor", racun.getKorisnik().getIme());
	}
	
	@Test
	void testSetRacunIdOK() {
		racun.setRacunId(1);
		assertEquals(1, racun.getRacunId());
	}

	@Test
	void testSetRacunIdNeispravno() {
		assertThrows(IllegalArgumentException.class, ()->racun.setRacunId(-1));
	}
	
	@Test
	void testSetKorisnikOK() {
		Korisnik k = new Korisnik();
		k.setIme("Viktor");
		racun.setKorisnik(k);
		assertEquals("Viktor", racun.getKorisnik().getIme());
	}
	
	@Test
	void testSetKorisnikNull() {
		assertThrows(NullPointerException.class, ()->racun.setKorisnik(null));
	}
	
	@Test
	void testSetListaStavkiOK() {
		Artikal a = new Artikal(1, "sok", "jabuka", 140);
		StavkaRacuna sr = new StavkaRacuna(a, 2);
		List<StavkaRacuna> lsr = new ArrayList<StavkaRacuna>();
		lsr.add(sr);
		racun.setListaStavki(lsr);
		assertEquals("jabuka", racun.getListaStavki().get(0).getArtikal().getOpis());
	}
	
	@Test
	void testSetListaStavkiNull() {
		assertThrows(NullPointerException.class, ()->racun.setListaStavki(null));
	}
}
