package strategy;

class NotificacaoSMS implements MetodoNotificacao {
    public String notificar(Tarefa tarefa) {
        return "Enviando SMS de notificação para a tarefa: " + tarefa.getDescricao();
    }
}