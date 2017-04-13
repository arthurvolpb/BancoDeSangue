/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class Doador extends Pessoa {

    private static final String FILENAME = "doadores.txt";
    private static final String FILENAME2 = "id_doador.txt";


    private String tipoSangue;
    private String obs;

    public Doador() {

    }

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

    public void cadastraDoador( String nome, String tipoSangue, String obs) {

        this.setId(this.getId());
        this.setNome(nome);
        this.setTipoSangue(tipoSangue);
        this.setObs(obs);
        
        
        
        BufferedWriter bw = null;
	FileWriter fw = null;
        		try {
                       
			fw = new FileWriter(FILENAME, true);
			bw = new BufferedWriter(fw);
			bw.write(String.valueOf(getId()));
                        bw.newLine();
                        bw.write(getNome());
                        bw.newLine();
                        bw.write(getTipoSangue());
                        bw.newLine();
                        bw.write(getObs()+"\n");
                        System.out.println("Doador cadastrado com sucesso!");
                        idFile();

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

    public void listarDoador() {
        
        String nomeArq = "doadores.txt"; //Nome do arquivo
        String linha = "";
        File arq = new File(nomeArq);
        //VariÃ¡veis para armazenar os dados dos desputados
        
        //String[] nome = new String[100];

        int i = -1;

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
                    i++;
//                    linha = leitor.readLine();
//                    nome[i] = linha;
//                    linha = leitor.readLine();
//                    nome[i] = linha;
                    System.out.println(linha);
                    linha = leitor.readLine();
                    

                }
            } catch (Exception erro) {
            }

        } //Se nao existir
        else {
            JOptionPane.showMessageDialog(null, "Arquivo nao existe!", "Erro", 0);
        }

    }
    
     public void idFile(){
        
        String nomeArq = "id_doador.txt"; //Nome do arquivo
        String linha = "";
        File arq = new File(nomeArq);
        
        int i = 0;
        int idDoador = 0;

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
                    idDoador = Integer.parseInt(linha);
                    i++;
                    

                }
            } catch (Exception erro) {
            }

        } //Se nao existir
        else {
            
            JOptionPane.showMessageDialog(null, "Arquivo nao existe!", "Erro", 0);
        
        }
        
        idDoador++;

        this.setId(idDoador);

                BufferedWriter bw = null;
                FileWriter fw = null;
        		try {

			fw = new FileWriter(FILENAME2);
			bw = new BufferedWriter(fw);
			bw.write( String.valueOf(idDoador) );
                       
			

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
                        
               //System.out.println("ID doador:"+this.getId());
   
    }
    
     
    public int confereDoador(int x){
        
        String nomeArq = "doadores.txt"; //Nome do arquivo
        String linha = "";
        String id = "";
        File arq = new File(nomeArq);
        int result=0;
        //VariÃ¡veis para armazenar os dados dos desputados
        
        
        int idPessoa[]=new int[100];
        
        String[] nome = new String[100];
        String[] tipoSang = new String[100];
        String[] obs = new String[100];
        int i = 0;
        
        // Teste arquivo existe
        if (arq.exists()) {
            //tentando ler arquivo
            try {
                //abrindo arquivo para leitura
                FileReader reader = new FileReader(nomeArq);
                //leitor do arquivo
                BufferedReader leitor = new BufferedReader(reader);
                //Inserindo os dados do arquivo nas variÃ¡veis
                //
                while (linha != null) {

                    linha = leitor.readLine();
                    idPessoa[i] = Integer.parseInt(linha);
                    linha = leitor.readLine();
                    nome[i] = linha;
                    linha = leitor.readLine();
                    tipoSang[i] = linha;
                    linha = leitor.readLine();
                    obs[i] = linha;

                    i++;
                    
                }
            } catch (Exception erro) {
            }

        } //Se nao existir
        else {
            JOptionPane.showMessageDialog(null, "Arquivo nao existe!", "Erro", 0);
        }
 
        for (i = 0; i < 10; i++) {
            if(idPessoa[i]==x){
                result = 1;
            }          
        }
       

        
        return result; 
    }

    public void sacar(float v){

        int x=0;
		 if (x == 1){

			 if(x > v){
				 x = x - x;
                         }else{ 
				 System.out.println("Saldo insuficiente");
			 }
			 
                 }else{
				 System.out.println("Impossível sacar, conta inexistente");
			 		}

			 	
			}
    
    //public int confereCPF(int x)
}



   
