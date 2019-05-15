package Application;

import ConcreteFactory.ProvedoraFactory;

import java.util.Scanner;

public class App {

    private static String coletaInfos(){
        Scanner in = new Scanner(System.in);
        String resposta = "";

        System.out.print("Insira a senha: ");
        resposta = in.nextLine();
        System.out.println();
        return resposta;
    }

    private static void close(){
        System.out.println("Muito obrigada pelo seu tempo!");
        System.out.println("====================Fim====================");
    }

    private static void start(){
          try {
            System.out.println("==================Bem vindo!==================");
              Thread.sleep(1000);
            System.out.println("Sinta-se em casa, não repare na bagunça hehe");
              Thread.sleep(1400);
            System.out.println("Pois bem, tenho aqui duas provedoras de informações para lhe mostrar, ");
              Thread.sleep(1400);
            System.out.println("mas isso irá depender se você sabe da palavra...");
              Thread.sleep(1500);
            System.out.println("\t\t S E C R E T A ");
              Thread.sleep(1000);
            System.out.println("\t\t\t e.e");
              Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        App.start();
        String resposta = App.coletaInfos();

        ProvedoraFactory factory = new ProvedoraFactory(resposta);
        factory.provedoraInfo();
    }
}
