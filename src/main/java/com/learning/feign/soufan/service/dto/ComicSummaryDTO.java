package com.learning.feign.soufan.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@AllArgsConstructor
@Getter
public class ComicSummaryDTO implements Serializable {

    private String resourceURI;
    private String name;
}
