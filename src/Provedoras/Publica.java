package Provedoras;

import java.io.*;

public class Publica extends ProvedoraMaster{
    private static final String caminho = "C:\\Users\\Marii\\Desktop\\AcademicalLife\\PUCRS\\" +
            "Semestres\\Terceiro\\SoftwareDevelopmentFundamentals\\Projetos\\DesignPatterns\\CreationalDesignPatterns\\" +
            "FactoryMethodTWO\\src\\Arquivos\\publico.txt";

    public Publica() {
        super.leArquivo(caminho);
    }

    /**
     * Escritor de arquivos padrão :D
     */

    /*private void escreveArquivo(){
        try {
            FileWriter file = new FileWriter("publico.txt", false);
            PrintWriter printer = new PrintWriter(file);

            printer.write("Hello World!");
            printer.close();
            System.out.println("Checkout 'output.txt' file :D");

        } catch (IOException e) {
            e.getCause();
        }
    }*/

    /**
     * leitor de Arquivos padrão :D
     */

    /*private String leArquivo(){
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
                return conteudo;
            } catch (IOException f) {
                f.getMessage();
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }*/
}
