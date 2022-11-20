package com.learning.feign.soufan.builder;

import com.learning.feign.soufan.service.dto.HeroDetailsDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class HeroBuilder {

    public HeroDetailsDTO retornaHeroCriado(){
        return HeroDetailsDTO.builder()
                .id(1009351)
                .name("Hulk")
                .description("Caught in a gamma bomb explosion while trying to save the life of a teenager," +
                        " Dr. Bruce Banner was transformed into the incredibly powerful creature called the Hulk." +
                        " An all too often misunderstood hero, the angrier the Hulk gets, the stronger the Hulk gets.")
                .modified(LocalDate.now())
                .resourceURI("http://gateway.marvel.com/v1/public/characters/1009351")
                .build();
    }


}
