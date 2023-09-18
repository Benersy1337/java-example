package banco;

// Classe de Conta Poupança que herda de Conta e implementa ContaRendimento
public class ContaPoupanca extends Conta implements ContaRendimento {

    private double taxaRendimento;

    public ContaPoupanca(String titular) {
        super(titular);
        this.taxaRendimento = 0.03; // Taxa de rendimento de 3%
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public double calcularRendimento() {
        return saldo * taxaRendimento;
    }

    @Override
    public double getSaldo() {
        return saldo + calcularRendimento();
    }
}
