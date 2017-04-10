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
public class Doador extends Pessoa{

    public Doador(String tipoSangue, String obs, int id, String nome) {
        super(id, nome);
        this.tipoSangue = tipoSangue;
        this.obs = obs;
    }

    private String tipoSangue;
    private String obs;
    


    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    

}
