package com.learning.feign.soufan.builder;

import com.learning.feign.soufan.domino.Endereco;
import com.learning.feign.soufan.domino.VO.EnderecoVO;
import com.learning.feign.soufan.service.dto.EnderecoDTO;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

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



    public EnderecoVO criarEnderecoVOValido(){
        return EnderecoVO.builder()
                .id(1L)
                .logradouro("Rua Professora Viero, 243")
                .bairro("Madureira")
                .cep("95040520")
                .complemento("Residencial piazza elisabetha randon")
                .cidade("Caxias do SUl")
                .uf("RS")
                .codigoTelefonico("41")
                .build();
    }

    public Endereco criarEnderecoEntityValido(){
        return Endereco.builder()
                .id(1L)
                .logradouro("Rua Professora Viero, 243")
                .bairro("Madureira")
                .cep("95040520")
                .complemento("Residencial piazza elisabetha randon apto 204")
                .cidade("Caxias do SUl")
                .uf("RS")
                .codigoTelefonico("41")
                .build();
    }

    public List<EnderecoVO> gerarListaEndVOValido(){
        var end01 = criarEnderecoVOValido();
        var end02 = criarEnderecoVOValido();

        end02.setId(2L);
        end02.setBairro("Joao mota");
        end02.setCidade("Camocin de Sao Felix");
        var end03 = criarEnderecoVOValido();
        end03.setId(3L);
        end03.setCep("51110070");
        end03.setCidade("Recife");
        end03.setLogradouro("Rua camaratuba 117");

        return Arrays.asList(end01, end02,end03);
    }

    public List<Endereco> gerarListaEndEntityValido(){
        var end01 = criarEnderecoEntityValido();
        var end02 = criarEnderecoEntityValido();

        end02.setId(2L);
        end02.setBairro("Joao mota");
        end02.setCidade("Camocin de Sao Felix");
        var end03 = criarEnderecoEntityValido();
        end03.setId(3L);
        end03.setCep("51110070");
        end03.setCidade("Recife");
        end03.setLogradouro("Rua camaratuba 117");

        return Arrays.asList(end01, end02,end03);
    }

}
