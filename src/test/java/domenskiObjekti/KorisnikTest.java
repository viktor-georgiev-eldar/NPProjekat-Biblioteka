package domenskiObjekti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KorisnikTest {

	private Korisnik korisnik;
	
	@BeforeEach
	void setUp() throws Exception {
		korisnik = new Korisnik();
	}

	@AfterEach
	void tearDown() throws Exception {
		korisnik = null;
	}

	@Test
	void testKorisnik() {
		korisnik = new Korisnik(1, "Viktor", "ProjekatNP", "Viktor", "Georgiev", "061235869", TipKorisnika.ADMINISTRATOR, false);
		
		assertEquals(1,korisnik.getKorisnikId());
		assertEquals("Viktor",korisnik.getUsername());
		assertEquals("ProjekatNP",korisnik.getPassword());
		assertEquals("Viktor",korisnik.getIme());
		assertEquals("Georgiev",korisnik.getPrezime());
		assertEquals("061235869",korisnik.getTelefon());
		assertEquals(TipKorisnika.ADMINISTRATOR,korisnik.getTipKorisnika());
		assertEquals(false,korisnik.isUlogovan());
	}
	
	@Test
	void testSetKorisnikIdOK() {
		korisnik.setKorisnikId(1);
		assertEquals(1, korisnik.getKorisnikId());
	}
	
	@Test
	void testSetKorisnikIdNeispravno() {
		assertThrows(IllegalArgumentException.class, ()->korisnik.setKorisnikId(-1));
	}
	
	@Test
	void testSetUsernameOK() {
		korisnik.setUsername("Viktor");
		assertEquals("Viktor", korisnik.getUsername());
	}

	@Test
	void testSetUsernameNull() {
		assertThrows(NullPointerException.class, ()->korisnik.setUsername(null));
	}
	
	@Test
	void testSetUsernameNeispravno() {
		assertThrows(IllegalArgumentException.class, ()->korisnik.setUsername("Vi"));
	}
	
	@Test
	void testSetPasswordOK() {
		korisnik.setPassword("ProjekatNP");
		assertEquals("ProjekatNP", korisnik.getPassword());
	}

	@Test
	void testSetPasswordNull() {
		assertThrows(NullPointerException.class, ()->korisnik.setPassword(null));
	}
	
	@Test
	void testSetPasswordNeispravno() {
		assertThrows(IllegalArgumentException.class, ()->korisnik.setPassword("Pr"));
	}
	
	@Test
	void testSetImeOK() {
		korisnik.setIme("Viktor");
		assertEquals("Viktor", korisnik.getIme());
	}
	
	@Test
	void testSetPrezimeOK() {
		korisnik.setPrezime("Georgiev");
		assertEquals("Georgiev", korisnik.getPrezime());
	}
	
	@Test
	void testSetTelefonOK() {
		korisnik.setTelefon("061235869");
		assertEquals("061235869", korisnik.getTelefon());
	}
	
	@Test
	void testSetTipKorisnikaOK() {
		korisnik.setTipKorisnika(TipKorisnika.ADMINISTRATOR);
		assertEquals(TipKorisnika.ADMINISTRATOR, korisnik.getTipKorisnika());
	}

}
