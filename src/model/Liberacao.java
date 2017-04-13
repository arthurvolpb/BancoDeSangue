/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Arthur
 */
public class Liberacao {
    
    private int id;
    private String cidade;
    private String hospital;
    private String Descricao;
    private int qtd;
    private int qtdAplus;
    private int qtdAminus;
    private int qtdBplus;
    private int qtdBminus;
    private int qtdABplus;
    private int qtdABminus;
    private int qtdOplus;
    private int qtdOminus;

    public Liberacao(int id, String cidade, String hospital, String Descricao, int qtd, int qtdAplus, int qtdAminus, int qtdBplus, int qtdBminus, int qtdABminus, int qtdOplus, int qtdOminus) {
        this.id = id;
        this.cidade = cidade;
        this.hospital = hospital;
        this.Descricao = Descricao;
        this.qtd = qtd;
        this.qtdAplus = qtdAplus;
        this.qtdAminus = qtdAminus;
        this.qtdBplus = qtdBplus;
        this.qtdBminus = qtdBminus;
        this.qtdABminus = qtdABminus;
        this.qtdOplus = qtdOplus;
        this.qtdOminus = qtdOminus;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getQtdAplus() {
        return qtdAplus;
    }

    public void setQtdAplus(int qtdAplus) {
        this.qtdAplus = qtdAplus;
    }

    public int getQtdAminus() {
        return qtdAminus;
    }

    public void setQtdAminus(int qtdAminus) {
        this.qtdAminus = qtdAminus;
    }

    public int getQtdBplus() {
        return qtdBplus;
    }

    public void setQtdBplus(int qtdBplus) {
        this.qtdBplus = qtdBplus;
    }

    public int getQtdBminus() {
        return qtdBminus;
    }

    public void setQtdBminus(int qtdBminus) {
        this.qtdBminus = qtdBminus;
    }

    public int getQtdABplus() {
        return qtdABplus;
    }

    public void setQtdABplus(int qtdABplus) {
        this.qtdABplus = qtdABplus;
    }

    public int getQtdABminus() {
        return qtdABminus;
    }

    public void setQtdABminus(int qtdABminus) {
        this.qtdABminus = qtdABminus;
    }

    public int getQtdOplus() {
        return qtdOplus;
    }

    public void setQtdOplus(int qtdOplus) {
        this.qtdOplus = qtdOplus;
    }

    public int getQtdOminus() {
        return qtdOminus;
    }

    public void setQtdOminus(int qtdOminus) {
        this.qtdOminus = qtdOminus;
    }
    
    
    
}
