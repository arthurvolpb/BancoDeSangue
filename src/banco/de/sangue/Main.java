/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.de.sangue;

import javax.swing.JOptionPane;



public class Main {


    void consultaDoacao() {

    }

    void liberacao() {

    }

    public static void main(String[] args) {

        Doador d = new Doador();
        Estoque e = new Estoque();
        Doacao doa = new Doacao();
//        int i=0;
//
//        d.cadastraDoador(0, "Arthur", "a+", "ashdjahdjasd");
//        
//        d.listarDoador();
//        e.setQtdAplus(i++);
//        System.out.println("qtd A.plus:"+e.getQtdAplus());
//        e.setQtdAplus(i++);
//        System.out.println("qtd A.plus:"+e.getQtdAplus());

           //doa.novaDoacao();
           doa.idFile();
           doa.novaDoacao(3, "a+", "Arthur", "23-12-2016");
           
           
           
                   
            //e.listaEstoque();
          

        

                 int op;
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem-vindo ao Banco de Sangue\n"
                + "\n1.Doador"
                + "\n2.Doacao"
                + "\n3.Estoque"
                + "\n4.Liberacao"));
        
        switch(op){
            
            case 1:
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Cadastrar Doador"
                        + "\n2. Listar Doadores\n"));
                
                        if(op==1){
                            d.cadastraDoador(1, "Everton", "a-", "Sangue asdhjash jasdahsjd ");
                        }else{
                            d.listarDoador();
                        }
                break;
            case 2:
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Nova Doacao"
                        + "\n2. Listar Doações"));
                break;
            case 3:
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Exibir estoque"
                        + "\n2. Classificar por quantidade de tipo sanguíneo"));
                break;
                
            case 4:
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Realizar liberação de unidades de sangue"
                        + "\n2. Exibir histórico de liberação"));
                break;
        }
    }

}
