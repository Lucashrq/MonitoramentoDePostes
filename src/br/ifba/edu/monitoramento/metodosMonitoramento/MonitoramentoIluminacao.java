package br.ifba.edu.monitoramento.metodosMonitoramento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.ifba.edu.monitoramento.objetoMonitorado.PontoIluminacao;

public class MonitoramentoIluminacao {

    // Método para gerar automaticamente dados de monitoramento para N pontos de iluminação
    public static List<PontoIluminacao> gerarDados(int N) {
        List<PontoIluminacao> pontos = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int tempoLuzAcesa = (int) (Math.random() * 1440); // Tempo aleatório entre 0 e 1440 minutos (24 horas)
            boolean luzAcesa = Math.random() < 0.5; // 50% de chance de estar acesa
            int qualidadeIluminacao = (int) (Math.random() * 3) + 1; // Qualidade aleatória entre 1 e 3
            
            // Cria um novo ponto de iluminação com os dados gerados aleatoriamente e adiciona à lista
            pontos.add(new PontoIluminacao(i, luzAcesa, tempoLuzAcesa, qualidadeIluminacao));
        }
        return pontos;
    }

    // Método para imprimir a lista de pontos de iluminação
    public static void imprimirLista(List<PontoIluminacao> pontos) {
        for (PontoIluminacao ponto : pontos) {
            System.out.println("Ponto " + ponto.id + ": Luz acesa = " + ponto.luzAcesa + ", Tempo luz acesa = "
                    + ponto.tempoLuzAcesa + " minutos, Qualidade iluminação = " + ponto.descricaoQualidade);
        }
    }

    // Método para ordenar a lista de pontos de iluminação pelo tempo de luz acesa
    public static void ordenarPorTempo(List<PontoIluminacao> pontos) {
        Collections.sort(pontos, new Comparator<PontoIluminacao>() {
            @Override
            public int compare(PontoIluminacao ponto1, PontoIluminacao ponto2) {
                return Integer.compare(ponto1.tempoLuzAcesa, ponto2.tempoLuzAcesa);
            }
        });
    }

    // Método para realizar a funcionalidade extra com complexidade O(N!)
    public static void funcionalidadeExtra(List<PontoIluminacao> pontos) {
        permutacao(pontos, 0);
    }

    // Método auxiliar para gerar todas as permutações dos pontos de iluminação
    private static void permutacao(List<PontoIluminacao> pontos, int index) {
        if (index == pontos.size() - 1) {
            System.out.println("Permutação: " + pontos);
        } else {
            for (int i = index; i < pontos.size(); i++) {
                Collections.swap(pontos, i, index);
                permutacao(pontos, index + 1);
                Collections.swap(pontos, i, index);
            }
        }
    }
}
