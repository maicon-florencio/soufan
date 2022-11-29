package com.learning.feign.soufan.mapperTest;

import com.learning.feign.soufan.builder.EnderecoBuilder;
import com.learning.feign.soufan.service.mapper.EnderecoMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EnderecoMapperTest {
   @Autowired
    private  EnderecoMapper enderecoMapper;
    @Autowired
    private EnderecoBuilder enderecoBuilder;

      @Test
    public void convertVoToEntity(){
        var endVo = enderecoBuilder.criarEnderecoVOValido();

        var endEntityConvertida = enderecoMapper.toEntity(endVo);

        Assertions.assertNotNull(endEntityConvertida);
        Assertions.assertTrue("95040520".equals(endEntityConvertida.getCep()));

    }

    @Test
    public void convertEntityToVO(){

        var endEntity = enderecoBuilder.criarEnderecoEntityValido();

        var endEntityConvertida = enderecoMapper.toVO(endEntity);

        Assertions.assertNotNull(endEntityConvertida);
        Assertions.assertTrue("95040520".equals(endEntityConvertida.getCep()));

    }

    @Test
    public void convertVoToEntities(){

          var entities = enderecoBuilder.gerarListaEndEntityValido();
          var VOs = enderecoMapper.toVOs(entities);

          Assertions.assertNotNull(VOs);
          Assertions.assertTrue(VOs.size() > 0);

    }
    @Test
    public void convertEntityToVOs(){

        var VOs = enderecoBuilder.gerarListaEndVOValido();
        var entities = enderecoMapper.toEntities(VOs);

        Assertions.assertNotNull(entities);
        Assertions.assertTrue(entities.size() > 0);

    }


}
