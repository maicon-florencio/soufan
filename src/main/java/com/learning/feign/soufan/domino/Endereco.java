package com.learning.feign.soufan.domino;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Endereco implements Serializable {

    private Long id;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String codigoTelefonico;
}
