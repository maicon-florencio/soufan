package com.learning.feign.soufan.service;

import com.learning.feign.soufan.service.dto.HeroDTO;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface HeroService {

    HeroDTO buscarPorNome(String nome) throws NoSuchAlgorithmException;
    List<HeroDTO> buscarTodosOsHero() throws NoSuchAlgorithmException;
}
