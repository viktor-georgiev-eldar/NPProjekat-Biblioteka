/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import java.io.Serializable;

/**
 *
 * @author Viktor
 */
public class ServerskiOdgovor implements Serializable{
    private int operacija;
    private Object argument;
    private boolean uspesno;

    public ServerskiOdgovor() {
    }

    public ServerskiOdgovor(int operacija, Object argument, boolean uspesno) {
        this.operacija = operacija;
        this.argument = argument;
        this.uspesno = uspesno;
    }

    public boolean isUspesno() {
        return uspesno;
    }

    public void setUspesno(boolean uspesno) {
        this.uspesno = uspesno;
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
    
    
}
