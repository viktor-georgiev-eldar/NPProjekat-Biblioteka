/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import domenskiObjekti.Korisnik;
import java.io.Serializable;

/**
 *
 * @author agro
 */
public class KlijentskiZahtev implements Serializable{
    private int operacija;
    private Object argument;
    private Korisnik posiljalac;

    public KlijentskiZahtev() {
    }

    public KlijentskiZahtev(int operacija, Object argument, Korisnik posiljalac) {
        this.operacija = operacija;
        this.argument = argument;
        this.posiljalac = posiljalac;
    }

    

    public int getOperacija() {
        return operacija;
    }

    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }

    public Object getArgument() {
        return argument;
    }

    public void setArgument(Object argument) {
        this.argument = argument;
    }

    public Korisnik getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(Korisnik posiljalac) {
        this.posiljalac = posiljalac;
    }
    
}
