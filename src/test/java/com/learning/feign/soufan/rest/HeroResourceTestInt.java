package com.learning.feign.soufan.rest;

import com.learning.feign.soufan.builder.HeroBuilder;
import com.learning.feign.soufan.service.HeroService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.security.NoSuchAlgorithmException;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HeroResourceTestInt {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private HeroBuilder heroBuilder;

    @MockBean
    private HeroService heroService;


    private final String API = "/api/heros";

    @Test
    public void buscarHeroPorNome() throws Exception {
         var abombHero =  heroBuilder.retornaHeroCriado();

        Mockito.when(heroService.buscarPorNome(Mockito.anyString())).thenReturn(abombHero);

        var request = MockMvcRequestBuilders.get(API.concat("/buscar-hero-por-nome/abomb"))
                .accept(MediaType.APPLICATION_JSON);

        mockMvc.perform(request)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value(abombHero.getCode()))
                .andExpect(jsonPath("status").value(abombHero.getStatus()))
                .andExpect(jsonPath("copyright").value(abombHero.getCopyright()))
                .andExpect(jsonPath("etag").value(abombHero.getEtag()));


        Assertions.assertEquals(200, abombHero.getCode());


    }


}
