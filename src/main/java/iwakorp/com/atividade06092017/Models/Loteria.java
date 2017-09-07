package iwakorp.com.atividade06092017.Models;

import java.util.List;

/**
 * Created by Tiago on 06/09/2017.
 */

public class Loteria {

    private List<Integer> numerosSorteados;
    private String nomeVencedor;
    private boolean statusSorteio;
    private double valorLoteria;

    public List<Integer> getNumerosSorteados() {
        return numerosSorteados;
    }

    public void setNumerosSorteados(List<Integer> numerosSorteados) {
        this.numerosSorteados = numerosSorteados;
    }

    public String getNomeVencedor() {
        return nomeVencedor;
    }

    public void setNomeVencedor(String nomeVencedor) {
        this.nomeVencedor = nomeVencedor;
    }

    public boolean isStatusSorteio() {
        return statusSorteio;
    }

    public void setStatusSorteio(boolean statusSorteio) {
        this.statusSorteio = statusSorteio;
    }

    public double getValorLoteria() {
        return valorLoteria;
    }

    public void setValorLoteria(double valorLoteria) {
        this.valorLoteria = valorLoteria;
    }

    @Override
    public String toString() {
        return "Loteria{" +
                "numerosSorteados=" + numerosSorteados +
                ", nomeVencedor='" + nomeVencedor + '\'' +
                ", statusSorteio=" + statusSorteio +
                ", valorLoteria=" + valorLoteria +
                '}';
    }
}
