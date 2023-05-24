package strategy;

class NotificacaoEmail implements MetodoNotificacao {
    public String notificar(Tarefa tarefa) {
        return "Enviando e-mail de notificação para a tarefa: " + tarefa.getDescricao();
    }
}
