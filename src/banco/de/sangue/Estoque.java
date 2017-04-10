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
public class Estoque {
    
    private int qtdAplus;
    private int qtdAminus;
    private int qtdBplus;
    private int qtdBminus;
    private int qtdABplus;
    private int qtdABminus;
    private int qtdOplus;
    private int qtdOminus;

    public Estoque(int qtdAplus, int qtdAminus, int qtdBplus, int qtdBminus, int qtdABplus, int qtdABminus, int qtdOplus, int qtdOminus) {
        this.qtdAplus = qtdAplus;
        this.qtdAminus = qtdAminus;
        this.qtdBplus = qtdBplus;
        this.qtdBminus = qtdBminus;
        this.qtdABplus = qtdABplus;
        this.qtdABminus = qtdABminus;
        this.qtdOplus = qtdOplus;
        this.qtdOminus = qtdOminus;
    }

    public void setQtdAplus(int qtdAplus) {
        this.qtdAplus = qtdAplus;
    }

    public void setQtdAminus(int qtdAminus) {
        this.qtdAminus = qtdAminus;
    }

    public void setQtdBplus(int qtdBplus) {
        this.qtdBplus = qtdBplus;
    }

    public void setQtdBminus(int qtdBminus) {
        this.qtdBminus = qtdBminus;
    }

    public void setQtdABplus(int qtdABplus) {
        this.qtdABplus = qtdABplus;
    }

    public void setQtdABminus(int qtdABminus) {
        this.qtdABminus = qtdABminus;
    }

    public void setQtdOplus(int qtdOplus) {
        this.qtdOplus = qtdOplus;
    }

    public void setQtdOminus(int qtdOminus) {
        this.qtdOminus = qtdOminus;
    }
    
    

    public int getQtdAplus() {
        return qtdAplus;
    }

    public int getQtdAminus() {
        return qtdAminus;
    }

    public int getQtdBplus() {
        return qtdBplus;
    }

    public int getQtdBminus() {
        return qtdBminus;
    }

    public int getQtdABplus() {
        return qtdABplus;
    }

    public int getQtdABminus() {
        return qtdABminus;
    }

    public int getQtdOplus() {
        return qtdOplus;
    }

    public int getQtdOminus() {
        return qtdOminus;
    }
    

    
}
