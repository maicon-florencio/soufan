package com.learning.feign.soufan.service.mapper;

import com.learning.feign.soufan.domino.Endereco;
import com.learning.feign.soufan.domino.VO.EnderecoVO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",uses = {})
public interface EnderecoMapper {

    EnderecoMapper INSTANCE = Mappers.getMapper(EnderecoMapper.class);

    @Mapping(source = "entity.logradouro",target = "logradouro")
    @Mapping(source = "entity.complemento",target = "complemento")
    @Mapping(source = "entity.cep",target = "cep")
    @Mapping(source = "entity.bairro",target = "bairro")
    @Mapping(source = "entity.cidade",target = "cidade")
    @Mapping(source = "entity.uf",target = "uf")
    @Mapping(source = "entity.codigoTelefonico",target = "codigoTelefonico")
    EnderecoVO toVO(Endereco entity);

    @InheritInverseConfiguration
    Endereco toEntity(EnderecoVO vo);


    List<EnderecoVO> toVOs(List<Endereco> entities);

    List<Endereco> toEntities(List<EnderecoVO> vos);


}
