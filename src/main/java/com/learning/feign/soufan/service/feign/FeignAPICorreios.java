package com.learning.feign.soufan.service.feign;

import com.learning.feign.soufan.service.dto.EnderecoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "correios-service", url = "https://viacep.com.br/ws")
public interface FeignAPICorreios {
    @GetMapping("/{cep}/json")
    EnderecoDTO buscarEnderecoPorCepAPIJson(@PathVariable("cep") String cep);

    default EnderecoDTO buscarEnderecoPorCepJson(String cep){
      return  buscarEnderecoPorCepAPIJson(cep);
    }

}
