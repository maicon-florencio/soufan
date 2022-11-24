package com.learning.feign.soufan.service.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Builder
@NoArgsConstructor
public class CharacterDataContainerDTO implements Serializable {
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<CharacterDTO> results;

}
