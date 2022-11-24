package com.learning.feign.soufan.resource;

import com.learning.feign.soufan.service.HeroService;
import com.learning.feign.soufan.service.dto.HeroDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequestMapping("/api/heros")
public class HeroResource {

    @Autowired
    private HeroService heroService;


    @GetMapping
    public ResponseEntity<HeroDetailsDTO> listaTodos() throws NoSuchAlgorithmException {
        return ResponseEntity.ok(heroService.buscarTodosOsHero());
    }

    @GetMapping("buscar-hero-por-nome/{nome}")
    public ResponseEntity<HeroDetailsDTO> buscarHeroPorNome(@PathVariable("nome") String nome) throws NoSuchAlgorithmException {
        return ResponseEntity.ok(heroService.buscarPorNome(nome));
    }

}
