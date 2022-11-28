package com.learning.feign.soufan.domino;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco implements Serializable {

    private Long id;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String ibge;
    private String gia;
    private String codigoTelefonico;
    private String siafi;
}
