/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.de.sangue;

import java.util.Date;

/**
 *
 * @author Arthur
 */
public class UnidSangue {
    
    private int id;
    private String tipoSangue;
    private Date data;

    public UnidSangue(int id, String tipoSangue, Date data) {
        this.id = id;
        this.tipoSangue = tipoSangue;
        this.data = data;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
    
}
