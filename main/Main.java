package main;

import hookMethod.*;
import java.util.Scanner;
import java.util.Random;


public class Main{

    public static void main(String[] args) {

    
        System.out.println("=============================================================================================================");

        Scanner scanner = new Scanner(System.in);

        int menu;

        while (true) {
            System.out.println("Escolha uma opçao:");
            System.out.println("1 -> Imposto NF de Venda");
            System.out.println("2 -> Imposto NF de Transferência");
            System.out.println("3 -> Sair");

            System.out.print("Digite sua escolha: ");
            menu = scanner.nextInt();

            Random random = new Random();

            int[] numAleatorio = new int[2];

            for (int i = 0; i < 2; i++) {
                numAleatorio[i] = random.nextInt(1000);
            }


            if (menu == 1) {

                NotaFiscal tranorte = new NotaFiscalVenda(numAleatorio[0], 500);
                System.out.println("O imposto sob a NF " + tranorte.getNumNotaFiscal() + " de Venda é " + tranorte.impostoTotal());

            } else if (menu == 2) {

                NotaFiscal agroforte = new NotaFiscalTransferencia(numAleatorio[1], 500);
                System.out.println("O imposto sob a NF " + agroforte.getNumNotaFiscal() + " de Transferência é " + agroforte.impostoTotal());

            } else if (menu == 3) {
            
                break; 

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    

        scanner.close();

        System.out.println("=============================================================================================================");


    }
}



