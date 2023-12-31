/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domenskiObjekti;

import java.io.Serializable;

/**
 *
 * @author Viktor
 */
public class Korisnik implements Serializable{
    
    private int korisnikId;
    private String username;
    private String password;
    private String ime;
    private String prezime;
    private String telefon;
    private TipKorisnika tipKorisnika;
    private boolean ulogovan;
    
    public Korisnik() {
    }

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

    public boolean isUlogovan() {
        return ulogovan;
    }

    public void setUlogovan(boolean ulogovan) {
        this.ulogovan = ulogovan;
    }

    

    public int getKorisnikId() {
        return korisnikId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getTelefon() {
        return telefon;
    }

    public TipKorisnika getTipKorisnika() {
        return tipKorisnika;
    }

    public void setKorisnikId(int korisnikId) {
        this.korisnikId = korisnikId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setTipKorisnika(TipKorisnika tipKorisnika) {
        this.tipKorisnika = tipKorisnika;
    }

    @Override
    public String toString() {
        return "Korisnik: "+ime+" "+prezime;
    }
    
    
    
    
    
}
