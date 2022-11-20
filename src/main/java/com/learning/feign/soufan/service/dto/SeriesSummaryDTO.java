package com.learning.feign.soufan.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class SeriesSummaryDTO implements Serializable {
    private String resourceURI;
    private String name;

}
