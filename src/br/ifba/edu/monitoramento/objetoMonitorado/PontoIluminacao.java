package br.ifba.edu.monitoramento.objetoMonitorado;

public class PontoIluminacao {
    public int id;
    public boolean luzAcesa;
    public int tempoLuzAcesa; // em minutos
    public int qualidadeDaIluminacao; // 1 = Ótima; 2 = Precisa de atenção; 3 = Sem iluminação.
    public String qualidadeIluminacao;

    public PontoIluminacao(int id, boolean luzAcesa, int tempoLuzAcesa, int qualidadeDaIluminacao) {
        this.id = id;
        this.luzAcesa = luzAcesa;
        this.tempoLuzAcesa = tempoLuzAcesa;
        this.qualidadeDaIluminacao = qualidadeDaIluminacao;
    }

}