package com.learning.feign.soufan.rest;

import com.learning.feign.soufan.builder.HeroBuilder;
import com.learning.feign.soufan.util.HashUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.NoSuchAlgorithmException;

@SpringBootTest
@AutoConfigureMockMvc
public class HeroResourceTestInt {

    @Value("${key-name-acess.public}")
    String keyPublic;
    @Value("${key-name-acess.private}")
    String keyPrivate;

    @Autowired
    private HeroBuilder heroBuilder;


    private final String API = "/api/heros";


    public void buscarHeroPorNome(){

    }

    @Test
    public void testarCriacaoHashCode() throws NoSuchAlgorithmException {
        String code ="1".concat(keyPrivate+keyPublic);
        String md5 = HashUtil.encodeForHashPorParams(code,"MD5");
                Assertions.assertEquals(md5,"ed444529c01a26870d7b61584fccf7c4");

    }


}
