package com.learning.feign.soufan.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@AllArgsConstructor
@Setter
public class ComicListDTO implements Serializable {

    private int  available;
    private int  returned;
    private String collectionURI;
    private List<ComicSummaryDTO> items;
}
