package com.learning.feign.soufan.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HeroDTO implements Serializable {

    private Integer id;
    private String name;
    private String description;
    private LocalDate modified;
    private String resourceURI;

}
