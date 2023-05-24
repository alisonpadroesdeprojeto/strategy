package strategy;

class Tarefa {
    private String descricao;

    private MetodoNotificacao metodoNotificacao;

    public Tarefa(String descricao, MetodoNotificacao metodoNotificacao) {
        this.setDescricao(descricao);
        this.setMetodoNotificacao(metodoNotificacao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public MetodoNotificacao getMetodoNotificacao() {
        return metodoNotificacao;
    }

    public void setMetodoNotificacao(MetodoNotificacao metodoNotificacao) {
        this.metodoNotificacao = metodoNotificacao;
    }

    public String notificar() {
        return this.getMetodoNotificacao().notificar(this);
    }
}