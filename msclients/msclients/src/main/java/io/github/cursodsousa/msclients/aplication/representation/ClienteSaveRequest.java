package io.github.cursodsousa.msclients.aplication.representation;


import io.github.cursodsousa.msclients.domain.Cliente;
import lombok.Data;

@Data
public class ClienteSaveRequest {

    private String cpf;
    private String nome;
    private Integer idade;

    public Cliente toModel(){
        return new Cliente(cpf,nome,idade);
    }
}
