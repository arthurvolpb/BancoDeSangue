/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
        int resultConfere ;
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
       // doa.idFile();
        resultConfere = d.confereDoador(7);
        
        if(resultConfere == 1){
            
            System.out.println("Doador existente!");
            
        }else{
            
            System.out.println("Doador não existe!!!!!!!!");
        }

        //e.listaEstoque();
//        int op = 0;
//        int op2 = 0;
//        while (op != 5) {
//            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem-vindo ao Banco de Sangue\n"
//                    + "\n1.Doador"
//                    + "\n2.Doacao"
//                    + "\n3.Estoque"
//                    + "\n4.Liberacao"
//                    + "\n5.Sair"));
//
//            switch (op) {
//
//                case 1:
//                    op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Cadastrar Doador"
//                            + "\n2. Listar Doadores\n"
//                            + "3. voltar"));
//                    switch (op2) {
//                        case 1:
//                            String nome;
//                            String tipoSangue;
//                            String obs;
//                            d.idFile();
//                            nome = JOptionPane.showInputDialog("Informe o nome:");
//                            tipoSangue = JOptionPane.showInputDialog("Informe o tipo de sangue da pessoa:");
//                            obs = JOptionPane.showInputDialog("Observação:");
//                            d.cadastraDoador(nome, tipoSangue, obs);
//                            //d.confereDoador();
//                            
//                            if(tipoSangue.equals("a+")){
//                                e.addEstoque("a+");
//                            }
//                             if(tipoSangue.equals("a-")){
//                                e.addEstoque("a-");
//                            }
//                             if(tipoSangue.equals("b+")){
//                                e.addEstoque("b+");
//                            }
//                             if(tipoSangue.equals("b-")){
//                                e.addEstoque("b-");
//                            }
//                             if(tipoSangue.equals("ab+")){
//                                e.addEstoque("ab+");
//                            }
//                             if(tipoSangue.equals("ab-")){
//                                e.addEstoque("ab-");
//                            }
//                             if(tipoSangue.equals("o+")){
//                                e.addEstoque("o+");
//                            }
//                             if(tipoSangue.equals("o-")){
//                                e.addEstoque("o-");
//                            }
//                             
//                            break;
//                        case 2:
//                            d.listarDoador();
//
//                            break;
//                        case 3:
//
//                            break;
//                    }
//
//                    break;
//                case 2:
//                    op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Nova Doacao"
//                            + "\n2. Listar Doações"
//                            + "\n3. Voltar"));
//                    switch (op2) {
//                        case 1:
//
//                            //doa.novaDoacao(op2, tipoSangue, nomePessoa, data);
//                            
//                            break;
//                        case 2:
//                            System.out.println("2");
//                            break;
//                        case 3:
//                            break;
//                    }
//
//                    break;
//                case 3:
//                    op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Exibir estoque"
//                            + "\n2. Classificar por quantidade de tipo sanguíneo"
//                            + "3. Voltar"));
//                    switch (op2) {
//                        case 1:
//                            break;
//                        case 2:
//                            break;
//                        case 3:
//                            break;
//                    }
//
//                    break;
//
//                case 4:
//                    op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Realizar liberação de unidades de sangue"
//                            + "\n2. Exibir histórico de liberação"
//                            + "3. Voltar"));
//                    switch (op2) {
//                        case 1:
//                            break;
//                        case 2:
//                            break;
//                        case 3:
//                            break;
//                    }
//
//                    break;
//            }
//
//        }

    }

}
