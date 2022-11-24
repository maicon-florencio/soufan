package com.learning.feign.soufan.builder;

import com.learning.feign.soufan.service.dto.CharacterDTO;
import com.learning.feign.soufan.service.dto.CharacterDataContainerDTO;
import com.learning.feign.soufan.service.dto.HeroDetailsDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class HeroBuilder {

    private static final String MARVEL_COPYRIGHT = "© 2022 MARVEL";
    private static final String ETAG_ABOMB = "a0e24d410b8c2da8d79c7da95dd6b4eeeb5b2eea";



    public HeroDetailsDTO retornaHeroCriado(){
        return HeroDetailsDTO.builder()
                .code(200)
                .status("OK")
                .copyright(MARVEL_COPYRIGHT)
                .attributionText("Data provided by Marvel. © 2022 MARVEL")
                .attributionHTML("<a href=\\\"http://marvel.com\\\">Data provided by Marvel. © 2022 MARVEL</a>")
                .data(retornoCaracteristicaJustSimpleTests())
                .etag(ETAG_ABOMB)
                .build();
    }


    private CharacterDataContainerDTO retornoCaracteristicaJustSimpleTests(){
        return CharacterDataContainerDTO.builder()
                .count(1)
                .limit(20)
                .offset(0)
                .total(1)
                .results(listaChacarter())
                .build();
    }

    private List<CharacterDTO> listaChacarter(){
        CharacterDTO personagem = CharacterDTO.builder()
                .id(1017100)
                .name("A-Bomb (HAS)")
                .description("Rick Jones has been Hulk's best bud since day one," +
                        " but now he's more than a friend...he's a teammate! Transformed by a Gamma energy explosion, " +
                        "A-Bomb's thick, armored skin is just as strong and powerful as it is blue." +
                        " And when he curls into action, he uses it like a giant bowling ball of destruction! ")
                .modified(new Date())
                .resourceURI("http://gateway.marvel.com/v1/public/characters/1017100")
                .build();

        return Arrays.asList(personagem);
    }
}
