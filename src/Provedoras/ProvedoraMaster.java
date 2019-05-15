package Provedoras;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProvedoraMaster {


    public void leArquivo(String caminho){
        String conteudo = "";

        try {
            FileReader arquivo = new FileReader(caminho);
            BufferedReader leitor = new BufferedReader(arquivo);
            String linha = "";

            try {
                linha = leitor.readLine();
                while (linha != null){
                    conteudo += linha + "\n";
                    linha = leitor.readLine();
                }
                arquivo.close();
                System.out.println(conteudo);
            } catch (IOException f) {
                f.getMessage();
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
}
