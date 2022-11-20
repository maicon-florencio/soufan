package com.learning.feign.soufan.service.feign;


import com.learning.feign.soufan.service.dto.HeroDetailsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "marvel-api", url = "${feign-keys.url}")
public interface FeignnApiMarvel {

    @GetMapping("/v1/public/characters")
    HeroDetailsDTO buscarHeroPorNomeAPI(@RequestParam("name") String pName,
                                        @RequestParam("ts") String pTs,
                                        @RequestParam("apikey") String pApiKey,
                                        @RequestParam("hash") String pHash) ;


    @GetMapping("/v1/public/characters")
    List<HeroDetailsDTO> buscarTodosOsHeroAPI(@RequestParam("ts") String pTs,
                                              @RequestParam("apikey") String pApiKey,
                                              @RequestParam("hash") String pHash) ;


    default HeroDetailsDTO buscarHeroPorNome(String name, String ts, String apiKey, String hash){
        return buscarHeroPorNomeAPI(name, ts, apiKey, hash);
    }

    default List<HeroDetailsDTO> buscarTodosHeros(String ts, String apiKey, String hash){
        return buscarTodosOsHeroAPI(ts, apiKey, hash);
    }


}
