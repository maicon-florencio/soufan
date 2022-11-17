package com.learning.feign.soufan.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
@Data
@Builder
@AllArgsConstructor
public class EnderecoDTO implements Serializable {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    @JsonProperty("localidade")
    private String cidade;

    private String uf;
    private String ibge;
    private String gia;
    @JsonProperty("ddd")
    private String codigoTelefonico;
    private String siafi;


}
