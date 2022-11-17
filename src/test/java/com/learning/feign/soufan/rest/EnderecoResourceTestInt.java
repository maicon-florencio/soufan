package com.learning.feign.soufan.rest;

import com.learning.feign.soufan.builder.EnderecoBuilder;
import com.learning.feign.soufan.service.EnderecoService;
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

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class EnderecoResourceTestInt {

    private final String API= "/api/enderecos";

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EnderecoService enderecoService;

    @Autowired
    private EnderecoBuilder enderecoBuilder;


    @Test
    public void buscarEnderecoPorCEPValido() throws Exception {
    var dto = enderecoBuilder.enderecoValido();

        Mockito.when(enderecoService.buscarEnderecoPorCEP(Mockito.anyString())).thenReturn(dto);

        var request = MockMvcRequestBuilders.get(API.concat("/buscar-por-cep/55034562"))
                .accept(MediaType.APPLICATION_JSON);


        mockMvc.perform(request)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("cep").value("55034-562"))
                .andExpect(jsonPath("logradouro").value("2ª Travessa Guaratinguetá"))
                .andExpect(jsonPath("bairro").value("Caiuca"))
                .andExpect(jsonPath("uf").value("PE"))
                .andExpect(jsonPath("localidade").value("Caruaru"));


        Assertions.assertEquals("Caruaru", dto.getCidade());



    }

}
