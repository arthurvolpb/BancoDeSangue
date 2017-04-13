/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Arthur
 */
public class Pessoa {

    private int id = 0;


    private String nome;
    //private Date dt_nasc;
    //private int cpf;
    //private String cidade;
    
    //construtor

            public Pessoa() {
        
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public Date getDt_nasc() {
//        return dt_nasc;
//    }
//
//    public void setDt_nasc(Date dt_nasc) {
//        this.dt_nasc = dt_nasc;
//    }

//    public int getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(int cpf) {
//        this.cpf = cpf;
//    }
//
//    public String getCidade() {
//        return cidade;
//    }
//
//    public void setCidade(String cidade) {
//        this.cidade = cidade;
//    }


    
}
