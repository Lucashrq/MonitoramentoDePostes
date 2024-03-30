package br.ifba.edu.monitoramento;

import java.util.List;
import br.ifba.edu.monitoramento.objetoMonitorado.PontoIluminacao;
import br.ifba.edu.monitoramento.metodosMonitoramento.MonitoramentoIluminacao;

public class App {
    public static void main(String[] args) {
        int N = 10; // Número de pontos de iluminação
        List<PontoIluminacao> pontos = MonitoramentoIluminacao.gerarDados(N);

        System.out.println("Lista de Pontos de Iluminação:");
        MonitoramentoIluminacao.imprimirLista(pontos);

        System.out.println("\nLeituras por Ponto de Iluminação:");
        MonitoramentoIluminacao.imprimirLista(pontos);

        System.out.println("\nOrdenação por Tempo de Luz Acesa:");
        MonitoramentoIluminacao.ordenarPorTempo(pontos);
        MonitoramentoIluminacao.imprimirLista(pontos);

        // Chame o método extra da classe MonitoramentoIluminacao aqui e imprima os resultados
    }
}
