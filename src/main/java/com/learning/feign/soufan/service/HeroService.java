package com.learning.feign.soufan.service;

import com.learning.feign.soufan.service.dto.HeroDetailsDTO;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface HeroService {

    HeroDetailsDTO buscarPorNome(String nome) throws NoSuchAlgorithmException;
    List<HeroDetailsDTO> buscarTodosOsHero() throws NoSuchAlgorithmException;
}
