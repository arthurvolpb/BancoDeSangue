/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.de.sangue;

/**
 *
 * @author Arthur
 */
public class Doacao {
    
    
    private Pessoa id;
    private Doador tipoSangue;
    private Pessoa nome;

    public Doacao() {

    }

    public Pessoa getId() {
        return id;
    }

    public void setId(Pessoa id) {
        this.id = id;
    }

    public Doador getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(Doador tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public Pessoa getNome() {
        return nome;
    }

    public void setNome(Pessoa nome) {
        this.nome = nome;
    }
    
    
    public void novaDoacao(int id, ){
        
    }
    

}
