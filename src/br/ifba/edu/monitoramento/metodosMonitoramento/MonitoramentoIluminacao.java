package br.ifba.edu.monitoramento.metodosMonitoramento;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import br.ifba.edu.monitoramento.objetoMonitorado.PontoIluminacao;

public class MonitoramentoIluminacao {

    // Método para gerar automaticamente dados de monitoramento para N pontos de
    // iluminação
    public static List<PontoIluminacao> gerarDados(int N) {
        List<PontoIluminacao> pontos = new ArrayList<>();
        // Aqui você pode gerar os dados aleatoriamente para os N pontos de iluminação
        // Certifique-se de incluir um identificador único para cada ponto
        // e preencher os outros campos conforme necessário
        // Exemplo de geração de dados aleatórios:
        for (int i = 0; i < N; i++) {
            pontos.add(new PontoIluminacao(i, Math.random() < 0.5, (int) (Math.random() * 1440),
                    (int) (Math.random() * 100)));
        }
        return pontos;
    }

    // Método para imprimir a lista de pontos de iluminação
    public static void imprimirLista(List<PontoIluminacao> pontos) {
        for (PontoIluminacao ponto : pontos) {
            System.out.println("Ponto " + ponto.id + ": Luz acesa = " + ponto.luzAcesa + ", Tempo luz acesa = "
                    + ponto.tempoLuzAcesa + " minutos, Qualidade iluminação = " + ponto.qualidadeIluminacao);
        }
    }

    public static void ordenarPorTempo(List<PontoIluminacao> pontos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ordenarPorTempo'");
    }

}
