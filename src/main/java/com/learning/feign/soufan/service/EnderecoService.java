package com.learning.feign.soufan.service;

import com.learning.feign.soufan.service.dto.EnderecoDTO;

public interface EnderecoService {

    EnderecoDTO buscarEnderecoPorCEP(String cep);
}
