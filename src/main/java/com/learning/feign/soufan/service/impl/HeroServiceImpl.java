package com.learning.feign.soufan.service.impl;

import com.learning.feign.soufan.service.HeroService;
import com.learning.feign.soufan.service.dto.HeroDTO;
import com.learning.feign.soufan.service.feign.FeignnApiMarvel;
import com.learning.feign.soufan.util.HashUtil;
import com.learning.feign.soufan.util.HeroUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;
@Service
public class HeroServiceImpl implements HeroService {
    @Value("${key-name-acess.public}")
    private String apiKeyPu;
    @Value("${key-name-acess.private}")
    private String apiKeyPr;

    private final FeignnApiMarvel apiMarvelService;

    public HeroServiceImpl(FeignnApiMarvel apiMarvelService) {
        this.apiMarvelService = apiMarvelService;
    }

    @Override
    public HeroDTO buscarPorNome(String nome) throws NoSuchAlgorithmException {
        if(nome ==null)
            throw new RuntimeException("Value not found ");
     return apiMarvelService.buscarHeroPorNome(nome, HeroUtil.TS1,
             apiKeyPu,HashUtil.encodeForHashPorParams(criarStringToHash(),HeroUtil.MD5));
    }

    @Override
    public List<HeroDTO> buscarTodosOsHero() throws NoSuchAlgorithmException {
        return apiMarvelService.buscarTodosHeros(HeroUtil.TS1, apiKeyPu
                ,HashUtil.encodeForHashPorParams(criarStringToHash(),HeroUtil.MD5) );

    }

    private String criarStringToHash(){
        return HeroUtil.TS1.concat(apiKeyPr+apiKeyPu);
    }
}
