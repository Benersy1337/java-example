package hookMethod;

import java.util.List;
import java.util.ArrayList;


// HOOK METHOD - IMPOSTO SOBRE TIPO DE NOTA FISCAL

public abstract class NotaFiscal{

    private int numNotaFiscal;
    private double valorNotaFiscal;
    private static List<Integer> numerosDeNotaFiscalUtilizados = new ArrayList<>();


    public NotaFiscal(int numNotaFiscal, double valorNotaFiscal) {
        if (numerosDeNotaFiscalUtilizados.contains(numNotaFiscal)) {
            System.out.println("Número de Nota Fiscal já criado");
        } else {
            this.numNotaFiscal = numNotaFiscal;
            numerosDeNotaFiscalUtilizados.add(numNotaFiscal);
        }
        this.valorNotaFiscal = valorNotaFiscal;
    }

    public double impostoTotal(){
        return impostoAnual() * 12;
    }

    // HOOK METHOD
    protected abstract double impostoAnual();
    
    public int getNumNotaFiscal() {
        return numNotaFiscal;
    }

    public void setNumNotaFiscal(int numNotaFiscal) {
        if (numerosDeNotaFiscalUtilizados.contains(numNotaFiscal)) {
            System.out.println("Número de Nota Fiscal já criado");
        } else {
            this.numNotaFiscal = numNotaFiscal;
            numerosDeNotaFiscalUtilizados.add(numNotaFiscal);
        }
    }

    public double getValorNotaFiscal() {
        return valorNotaFiscal;
    }

    public void setValorNotaFiscal(double valorNotaFiscal) {
        this.valorNotaFiscal = valorNotaFiscal;
    }

}
