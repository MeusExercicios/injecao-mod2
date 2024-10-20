package com.vitor.algaworks.notificador;

import com.vitor.algaworks.model.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("normal")
@Component
public class Sms implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do sms %s: %s\n",
                cliente.getNome(),cliente.getEmail(),cliente.getMensagem());
    }
}
