package Provedoras;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Privada extends ProvedoraMaster{
    private static final String caminho = "C:\\Users\\Marii\\Desktop\\AcademicalLife\\PUCRS\\" +
            "Semestres\\Terceiro\\SoftwareDevelopmentFundamentals\\Projetos\\DesignPatterns\\CreationalDesignPatterns\\" +
            "FactoryMethodTWO\\src\\Arquivos\\confidencial.txt";

    public Privada() {
        super.leArquivo(caminho);
    }
}
