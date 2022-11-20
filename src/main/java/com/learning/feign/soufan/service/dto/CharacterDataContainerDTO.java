package com.learning.feign.soufan.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class CharacterDataContainerDTO implements Serializable {
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<CharacterDTO> results;

}
