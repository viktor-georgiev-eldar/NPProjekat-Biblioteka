/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import java.io.Serializable;

/**
 *	Objekat koji se koristi za kominikaciju servara ka klijentu
 *
 * @author Viktor
 */
public class ServerskiOdgovor implements Serializable{
    /**
     * id operacije
     */
    private int operacija;
    /**
     * Objekat koji se prosledjuje
     */
    private Object argument;
    /**
     * Informacije o uspesnosti operacije
     */
    private boolean uspesno;

    /**
     * Neparametrizovani konstruktor
     */
    public ServerskiOdgovor() {
    }

    /**
     * Parametrizovani konstruktor
     * 
     * @param operacija id operacije
     * @param argument objekat koji se prosledjuje
     * @param uspesno informacije o uspesnosti operacije
     */
    public ServerskiOdgovor(int operacija, Object argument, boolean uspesno) {
        this.operacija = operacija;
        this.argument = argument;
        this.uspesno = uspesno;
    }

    /**
     * Proverava da li je operacija uspesno izvrsena.
     *
     * @return True ako je operacija uspesna, inace false.
     */
    public boolean isUspesno() {
        return uspesno;
    }

    /**
     * Postavlja status uspesnosti operacije.
     *
     * @param uspesno True ako je operacija uspesna, inace false.
     */
    public void setUspesno(boolean uspesno) {
        this.uspesno = uspesno;
    }

    /**
     * Vraca vrednost operacije.
     *
     * @return Vrednost operacije.
     */
    public int getOperacija() {
        return operacija;
    }

    /**
     * Postavlja vrednost operacije.
     *
     * @param operacija Vrednost operacije koja će biti postavljena.
     */
    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }

    /**
     * Vraca argument povezan sa operacijom.
     *
     * @return Objekat argumenta.
     */
    public Object getArgument() {
        return argument;
    }

    /**
     * Postavlja argument povezan sa operacijom.
     *
     * @param argument Objekat argumenta koji će biti postavljen.
     */
    public void setArgument(Object argument) {
        this.argument = argument;
    }
    
    
}
