package com.vitor.algaworks;

import com.vitor.algaworks.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.vitor.algaworks.service.AtivacaoCliente;

@Controller
public class MyFirstController {


    private AtivacaoCliente ativacaoCliente;

    public MyFirstController(AtivacaoCliente ativacaoCliente){
        this.ativacaoCliente = ativacaoCliente;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("João", "vitor@gmail.com","hey bro");
        ativacaoCliente.ativar(joao);
        return "Olá!";
    }
}
