/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.de.sangue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;



/**
 *
 * @author Arthur
 */
public class Doacao {
    
    private int idDoacao;
    //private Pessoa id;
    private int idPessoa;
    //private Doador tipoSangue;
    private String tipoSangue;
    private String nomePessoa;
    //private Pessoa nome;
    String data;
    private static final String FILENAME = "id_doacao.txt";
    private static final String FILENAME2 = "doacao.txt";


        public Doacao() {

    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }





    public int getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(int idDoacao) {
        this.idDoacao = idDoacao;
    }




    
    public void idFile(){
        
        String nomeArq = "id_doacao.txt"; //Nome do arquivo
        String linha = "";
        File arq = new File(nomeArq);
        
        int i = 0;
        int idDoacao = 0;

        // Teste arquivo existe
        if (arq.exists()) {
            //tentando ler arquivo
            try {
                //abrindo arquivo para leitura
                FileReader reader = new FileReader(nomeArq);
                //leitor do arquivo
                BufferedReader leitor = new BufferedReader(reader);
                //Inserindo os dados do arquivo nas variÃ¡veis
                while (linha != null) {
                    
                    linha = leitor.readLine();
                    idDoacao = Integer.parseInt(linha);
                    i++;
                    

                }
            } catch (Exception erro) {
            }

        } //Se nao existir
        else {
            
            JOptionPane.showMessageDialog(null, "Arquivo nao existe!", "Erro", 0);
        
        }
        
        idDoacao++;

        this.setIdDoacao(idDoacao);
        


                BufferedWriter bw = null;
                FileWriter fw = null;
        		try {

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write( String.valueOf(idDoacao) );
                       
			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
                        
               System.out.println("ID:"+this.getIdDoacao());
   
    }
    
    public void novaDoacao(int idPessoa, String tipoSangue, String nomePessoa, String data){
            
    //private Pessoa nome;
    
        this.setIdDoacao(this.getIdDoacao());
        this.setIdPessoa(idPessoa);
        this.setNomePessoa(nomePessoa);
        this.setTipoSangue(tipoSangue);
        this.setData(data);
  
        String nomeArq = "doacao.txt"; //Nome do arquivo
        String linha = "";
        File arq = new File(nomeArq);

                BufferedWriter bw = null;
                FileWriter fw = null;
        		try {

			fw = new FileWriter(FILENAME2, true);
			bw = new BufferedWriter(fw);
			bw.write("Id Doacao: "+String.valueOf(getIdDoacao()));
                        bw.newLine();
                        bw.write("Nome Pessoa: "+getNomePessoa());
                        bw.newLine();
                        bw.write("Tipo Sanguineo: "+getTipoSangue());
                        bw.newLine();
                        bw.write("Data da coleta: "+getData()+"\n");
                        bw.newLine();
                        
                      

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

        
    }

}
