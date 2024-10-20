package com.vitor.algaworks.notificador;

import com.vitor.algaworks.model.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
