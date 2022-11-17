package com.learning.feign.soufan.service.impl;

import com.learning.feign.soufan.service.EnderecoService;
import com.learning.feign.soufan.service.dto.EnderecoDTO;
import com.learning.feign.soufan.service.feign.FeignAPICorreios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private FeignAPICorreios correiosAPI;

    @Override
    public EnderecoDTO buscarEnderecoPorCEP(String cep) {
        if(cep.isEmpty())
            throw  new IllegalArgumentException("Argument not found");

        return correiosAPI.buscarEnderecoPorCepJson(cep);
    }
}
