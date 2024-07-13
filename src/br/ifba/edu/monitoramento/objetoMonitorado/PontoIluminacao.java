package br.ifba.edu.monitoramento.objetoMonitorado;

public class PontoIluminacao {
    public int id;
    public boolean luzAcesa;
    public int tempoLuzAcesa; // em minutos
    public int qualidadeIluminacao; // 1 = Ótima; 2 = Precisa de atenção; 3 = Sem iluminação
    public String descricaoQualidade;

    public PontoIluminacao(int id, boolean luzAcesa, int tempoLuzAcesa, int qualidadeIluminacao) {
        this.id = id;
        this.luzAcesa = luzAcesa;
        this.tempoLuzAcesa = tempoLuzAcesa;
        this.qualidadeIluminacao = qualidadeIluminacao;

        switch (qualidadeIluminacao) {
            case 1:
                descricaoQualidade = "Boa";
                break;
            case 2:
                descricaoQualidade = "Fraca";
                break;
            case 3:
                descricaoQualidade = "Defeituosa";
                break;
            default:
                descricaoQualidade = "Desconhecida"; // Caso o valor não seja 1, 2 ou 3
        }
    }

    @Override
    public String toString() {
        return "Ponto " + id + ": Luz acesa = " + luzAcesa + ", Tempo luz acesa = "
                + tempoLuzAcesa + " minutos, Qualidade iluminação = " + descricaoQualidade;
    }
}
