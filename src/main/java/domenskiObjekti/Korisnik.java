/*
 * Klasa koja predstavlja korisnika sistema.
 */
package domenskiObjekti;

import java.io.Serializable;

/**
 * Predstavlja jednog korisnika sa osnovnim informacijama.
 */
public class Korisnik implements Serializable{
    
    /**
     * Identifikator korisnika
     */
    private int korisnikId; 
    /**
     * Korisnicko ime
     */
    private String username; 
    /**
     * Lozinka
     */
    private String password; 
    /**
     * Ime korisnika
     */
    private String ime;
    /**
     * Prezime korisnika
     */
    private String prezime; 
    /**
     * Broj telefona korisnika
     */
    private String telefon; 
    /**
     * Tip korisnika
     */
    private TipKorisnika tipKorisnika; 
    /**
     * Da li je korisnik ulogovan
     */
    private boolean ulogovan; 

    /**
     * Konstruktor bez argumenata.
     */
    public Korisnik() {
    }

    /**
     * Konstruktor sa argumentima.
     * 
     * @param korisnikId Identifikator korisnika
     * @param username Korisnicko ime
     * @param password Lozinka
     * @param ime Ime korisnika
     * @param prezime Prezime korisnika
     * @param telefon Broj telefona korisnika
     * @param tipKorisnika Tip korisnika
     * @param ulogovan Status ulogovanosti korisnika
     */
    public Korisnik(int korisnikId, String username, String password, String ime, String prezime, String telefon, TipKorisnika tipKorisnika, boolean ulogovan) {
        this.korisnikId = korisnikId;
        this.username = username;
        this.password = password;
        this.ime = ime;
        this.prezime = prezime;
        this.telefon = telefon;
        this.tipKorisnika = tipKorisnika;
        this.ulogovan = ulogovan;
    }

    /**
     * Vraca status ulogovanosti korisnika.
     * 
     * @return Status ulogovanosti korisnika
     */
    public boolean isUlogovan() {
        return ulogovan;
    }

    /**
     * Postavlja status ulogovanosti korisnika.
     * 
     * @param ulogovan Novi status ulogovanosti korisnika
     */
    public void setUlogovan(boolean ulogovan) {
        this.ulogovan = ulogovan;
    }

    

    /**
     * Vraca identifikator korisnika.
     * 
     * @return Identifikator korisnika
     */
    public int getKorisnikId() {
        return korisnikId;
    }

    /**
     * Vraca korisnicko ime.
     * 
     * @return Korisnicko ime
     */
    public String getUsername() {
        return username;
    }

    /**
     * Vraća lozinku korisnika.
     * 
     * @return Lozinka korisnika
     */
    public String getPassword() {
        return password;
    }

    /**
     * Vraca ime korisnika.
     * 
     * @return Ime korisnika
     */
    public String getIme() {
        return ime;
    }

    /**
     * Vraca prezime korisnika.
     * 
     * @return Prezime korisnika
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * Vraca broj telefona korisnika.
     * 
     * @return Broj telefona korisnika
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Vraca tip korisnika.
     * 
     * @return Tip korisnika
     */
    public TipKorisnika getTipKorisnika() {
        return tipKorisnika;
    }

    /**
     * Postavlja identifikator korisnika.
     * 
     * @param korisnikId Identifikator korisnika
     * @throws IllegalArgumentException Ako je identifikator manji od nule
     */
    public void setKorisnikId(int korisnikId) {
    	if (korisnikId < 0) throw new IllegalArgumentException();
        this.korisnikId = korisnikId;
    }

    /**
     * Postavlja korisnicko ime.
     * 
     * @param username Korisnicko ime
     * @throws NullPointerException Ako je korisnicko ime null
     * @throws IllegalArgumentException Ako je duzina korisnickog imena manja od 3 karaktera
     */
    public void setUsername(String username) {
    	if (username == null) throw new NullPointerException();
    	if (username.length()<3) throw new IllegalArgumentException();
        this.username = username;
    }

    /**
     * Postavlja lozinku korisnika.
     * 
     * @param password Lozinka korisnika
     * @throws NullPointerException Ako je lozinka null
     * @throws IllegalArgumentException Ako je duzina lozinke manja od 3 karaktera
     */
    public void setPassword(String password) {
    	if (password == null) throw new NullPointerException();
    	if (password.length()<3) throw new IllegalArgumentException();
        this.password = password;
    }

    /**
     * Postavlja ime korisnika.
     * 
     * @param ime Ime korisnika
     * @throws NullPointerException Ako je ime null
     * @throws IllegalArgumentException Ako je duzina imena manja od 3 karaktera
     */
    public void setIme(String ime) {
    	if (ime == null) throw new NullPointerException();
    	if (ime.length()<3) throw new IllegalArgumentException();
        this.ime = ime;
    }

    /**
     * Postavlja prezime korisnika.
     * 
     * @param prezime Prezime korisnika
     * @throws NullPointerException Ako je prezime null
     * @throws IllegalArgumentException Ako je duzina prezimena manja od 3 karaktera
     */
    public void setPrezime(String prezime) {
    	if (prezime == null) throw new NullPointerException();
    	if (prezime.length()<3) throw new IllegalArgumentException();
        this.prezime = prezime;
    }

    /**
     * Postavlja broj telefona korisnika.
     * 
     * @param telefon Broj telefona korisnika
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * Postavlja tip korisnika.
     * 
     * @param tipKorisnika Tip korisnika
     */
    public void setTipKorisnika(TipKorisnika tipKorisnika) {
        this.tipKorisnika = tipKorisnika;
    }

    @Override
    public String toString() {
        return "Korisnik: "+ime+" "+prezime;
    }
    
    
    
    
    
}
