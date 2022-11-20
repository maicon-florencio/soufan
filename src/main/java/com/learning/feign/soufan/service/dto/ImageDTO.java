package com.learning.feign.soufan.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
@AllArgsConstructor
public class ImageDTO implements Serializable {

    private String path;
    private String extension;
}
