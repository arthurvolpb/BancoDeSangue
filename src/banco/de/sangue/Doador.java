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
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class Doador extends Pessoa {

    private static final String FILENAME = "doadores.txt";


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

    public void cadastraDoador(int id, String nome, String tipoSangue, String obs) {

        this.setId(id);
        this.setNome(nome);
        this.setTipoSangue(tipoSangue);
        this.setObs(obs);
        
        
        BufferedWriter bw = null;
	FileWriter fw = null;
        		try {
			String content = nome+"\n"+tipoSangue+"\n"+obs+"\n\n";
			fw = new FileWriter(FILENAME, true);
			bw = new BufferedWriter(fw);
			bw.write(content);
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

}
