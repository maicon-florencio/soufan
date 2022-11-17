package com.learning.feign.soufan.resource;

import com.learning.feign.soufan.service.EnderecoService;
import com.learning.feign.soufan.service.dto.EnderecoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoResource {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/buscar-por-cep/{cep}")
    public ResponseEntity<EnderecoDTO> buscarEnderecoPorCEP(@PathVariable("cep") String cep){
        return ResponseEntity.ok(enderecoService.buscarEnderecoPorCEP(cep));
    }

}
