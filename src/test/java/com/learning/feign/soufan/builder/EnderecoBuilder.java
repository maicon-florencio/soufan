package com.learning.feign.soufan.builder;

import com.learning.feign.soufan.service.dto.EnderecoDTO;
import org.springframework.stereotype.Component;

@Component
public class EnderecoBuilder {

    public EnderecoDTO enderecoValido(){
        return EnderecoDTO.builder()
                .cep("55034-562")
                .logradouro("2ª Travessa Guaratinguetá")
                .complemento("")
                .bairro("Caiuca")
                .cidade("Caruaru")
                .uf("PE")
                .ibge("2604106")
                .gia("")
                .codigoTelefonico("81")
                .siafi("2381").build();

    }

}
