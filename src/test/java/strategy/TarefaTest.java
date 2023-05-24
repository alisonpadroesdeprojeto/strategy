package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarefaTest {

    @Test
    void deveNotificarEmail() {
        NotificacaoEmail notificacaoEmail = new NotificacaoEmail();
        Tarefa tarefa = new Tarefa("Avaliar proposta comercial.", notificacaoEmail);
        assertEquals("Enviando e-mail de notificação para a tarefa: Avaliar proposta comercial.", tarefa.notificar());
    }

    @Test
    void deveNotificarSMS() {
        NotificacaoSMS notificacaoSMS = new NotificacaoSMS();
        Tarefa tarefa = new Tarefa("Reativar plano de internet.", notificacaoSMS);
        assertEquals("Enviando SMS de notificação para a tarefa: Reativar plano de internet.", tarefa.notificar());
    }
}