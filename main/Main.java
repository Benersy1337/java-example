package main;

import banco.*;

public class Main{

    public static void main(String[] args) {
    
       // Exemplo de organização em pacotes
       ContaCorrente conta1 = new ContaCorrente("João", 1000.0);
       ContaPoupanca conta2 = new ContaPoupanca("Maria");

       // Depósitos
       conta1.depositar(500.0);
       conta2.depositar(1000.0);

       // Saques
       conta1.sacar(300.0);
       conta2.sacar(200.0);

       // Polimorfismo
       Conta conta3 = new ContaCorrente("Pedro", 2000.0);
       conta3.depositar(300);
       conta3.sacar(2400);

       // Classes abstratas e interfaces
       ContaPoupanca conta4 = new ContaPoupanca("Ana");
       conta4.depositar(1000);
       double rendimento = conta4.calcularRendimento();
      
       // Exibição de saldos
       System.out.println("Saldo da Conta 1: " + conta1.getSaldo());
       System.out.println("Saldo da Conta 2: " + conta2.getSaldo());
       System.out.println("Saldo da Conta 3: " + conta3.getSaldo());
       System.out.println("Saldo da Conta 4: " + conta4.getSaldo());
       System.out.println("Rendimento da Conta 4: " + rendimento);


    }
}



