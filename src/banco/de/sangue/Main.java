/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.de.sangue;



public class Main {


    void consultaDoacao() {

    }

    void liberacao() {

    }

    public static void main(String[] args) {

        Doador d = new Doador();
        Estoque e = new Estoque();
//        int i=0;
//
//        d.cadastraDoador(0, "Arthur", "a+", "ashdjahdjasd");
//        
//        d.listarDoador();
//        e.setQtdAplus(i++);
//        System.out.println("qtd A.plus:"+e.getQtdAplus());
//        e.setQtdAplus(i++);
//        System.out.println("qtd A.plus:"+e.getQtdAplus());

           
            
            e.retiraEstoque("a+");
            e.retiraEstoque("a+");
            e.retiraEstoque("a+");
            e.retiraEstoque("a+");
            e.retiraEstoque("a+");
            e.retiraEstoque("a+");
            e.retiraEstoque("a+");
            e.retiraEstoque("a+");
                   
            e.listaEstoque();
          

        

//                 int op;
//        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem-vindo ao Banco de Sangue\n")
//                + "1.Doador"
//                + "2.Doacao"
//                + "3.Estoque"
//                + "4.Liberacao");
//        
//        
//        switch(op){
//            
//            case 1:
//
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//        }
    }

}
