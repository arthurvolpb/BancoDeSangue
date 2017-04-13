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
import javax.swing.JOptionPane;

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

    public Estoque() {

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
    
    private static final String FILENAME = "estoque.txt";
    
    void listaEstoque(){
        
        //this.setQtdAplus(qtdAplus);

        String nomeArq = "estoque.txt"; //Nome do arquivo
        String linha = "";
        File arq = new File(nomeArq);
        //VariÃ¡veis para armazenar os dados dos desputados
        
        //String[] nome = new String[100];

        int i = 0;
        int vetorTipoSang[]=new int[8];

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
                    vetorTipoSang[i] = Integer.parseInt(linha);
                    i++;

                }
            } catch (Exception erro) {
            }

        } //Se nao existir
        else {
            
            JOptionPane.showMessageDialog(null, "Arquivo nao existe!", "Erro", 0);
        
        }
        
        this.setQtdAplus(vetorTipoSang[0]);
        this.setQtdAminus(vetorTipoSang[1]);
        this.setQtdBplus(vetorTipoSang[2]);
        this.setQtdBminus(vetorTipoSang[3]);
        this.setQtdABplus(vetorTipoSang[4]);
        this.setQtdABminus(vetorTipoSang[5]);
        this.setQtdOplus(vetorTipoSang[6]);
        this.setQtdOminus(vetorTipoSang[7]);
        System.out.println("Unidades de Sangue A+:"+getQtdAplus());
        System.out.println("Unidades de Sangue A-:"+this.getQtdAminus());
        System.out.println("Unidades de Sangue B+:"+this.getQtdBplus());
        System.out.println("Unidades de Sangue B-:"+this.getQtdBminus());
        System.out.println("Unidades de Sangue AB+:"+this.getQtdABplus());
        System.out.println("Unidades de Sangue AB-:"+this.getQtdABminus());
        System.out.println("Unidades de Sangue O+:"+this.getQtdOplus());
        System.out.println("Unidades de Sangue O-:"+this.getQtdOminus());
        

    }
    
    void addEstoque(String tipo){
        
        String nomeArq = "estoque.txt"; //Nome do arquivo
        String linha = "";
        File arq = new File(nomeArq);
        
        int i = 0;
        int vetorTipoSang[]=new int[8];

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
                    vetorTipoSang[i] = Integer.parseInt(linha);
                    i++;

                }
            } catch (Exception erro) {
            }

        } //Se nao existir
        else {
            
            JOptionPane.showMessageDialog(null, "Arquivo nao existe!", "Erro", 0);
        
        }
        
        switch(tipo){
            case "a+":
                vetorTipoSang[0] = vetorTipoSang[0]+1;
                
                break;
            case "a-":
                vetorTipoSang[1] = vetorTipoSang[1]+1;
                break;
            case "b+":
                vetorTipoSang[2] = vetorTipoSang[2]+1;
                break;
            case "b-":
                vetorTipoSang[3] = vetorTipoSang[3]+1; 
                break;
            case "ab+":
                vetorTipoSang[4] = vetorTipoSang[4]+1;                
                break;
            case "ab-":
                vetorTipoSang[5] = vetorTipoSang[5]+1;               
                break;
            case "o+":
                vetorTipoSang[6] = vetorTipoSang[6]+1;
                break;
            case "o-":
                vetorTipoSang[7] = vetorTipoSang[7]+1;
                break;
 
        }

        this.setQtdAplus(vetorTipoSang[0]);
        this.setQtdAminus(vetorTipoSang[1]);
        this.setQtdBplus(vetorTipoSang[2]);
        this.setQtdBminus(vetorTipoSang[3]);
        this.setQtdABplus(vetorTipoSang[4]);
        this.setQtdABminus(vetorTipoSang[5]);
        this.setQtdOplus(vetorTipoSang[6]);
        this.setQtdOminus(vetorTipoSang[7]);


                BufferedWriter bw = null;
                FileWriter fw = null;
        		try {

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write( String.valueOf(vetorTipoSang[0]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[1]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[2]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[3]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[4]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[5]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[6]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[7]) );
			

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
    
    
    void retiraEstoque(String tipo){
        
        String nomeArq = "estoque.txt"; //Nome do arquivo
        String linha = "";
        File arq = new File(nomeArq);
        
        int i = 0;
        int vetorTipoSang[]=new int[8];

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
                    vetorTipoSang[i] = Integer.parseInt(linha);
                    i++;

                }
            } catch (Exception erro) {
            }

        } //Se nao existir
        else {
            
            JOptionPane.showMessageDialog(null, "Arquivo nao existe!", "Erro", 0);
        
        }
        
        switch(tipo){
            case "a+":
                vetorTipoSang[0] = vetorTipoSang[0]-1;
                
                break;
            case "a-":
                vetorTipoSang[1] = vetorTipoSang[1]-1;
                break;
            case "b+":
                vetorTipoSang[2] = vetorTipoSang[2]-1;
                break;
            case "b-":
                vetorTipoSang[3] = vetorTipoSang[3]-1; 
                break;
            case "ab+":
                vetorTipoSang[4] = vetorTipoSang[4]-1;                
                break;
            case "ab-":
                vetorTipoSang[5] = vetorTipoSang[5]-1;               
                break;
            case "o+":
                vetorTipoSang[6] = vetorTipoSang[6]-1;
                break;
            case "o-":
                vetorTipoSang[7] = vetorTipoSang[7]-1;
                break;
 
        }

        this.setQtdAplus(vetorTipoSang[0]);
        this.setQtdAminus(vetorTipoSang[1]);
        this.setQtdBplus(vetorTipoSang[2]);
        this.setQtdBminus(vetorTipoSang[3]);
        this.setQtdABplus(vetorTipoSang[4]);
        this.setQtdABminus(vetorTipoSang[5]);
        this.setQtdOplus(vetorTipoSang[6]);
        this.setQtdOminus(vetorTipoSang[7]);


                BufferedWriter bw = null;
                FileWriter fw = null;
        		try {

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write( String.valueOf(vetorTipoSang[0]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[1]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[2]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[3]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[4]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[5]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[6]) );
                        bw.newLine();
                        bw.write( String.valueOf(vetorTipoSang[7]) );
			

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
