package com.learning.feign.soufan.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CharacterDTO implements Serializable {

    private int id;
    private String name;
    private String description;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")
    private Date modified;
    private String resourceURI;
    private List<UrlDTO> urls;
    private ImageDTO thumbnail;
    private ComicListDTO comics;
    private StoryListDTO stories;
    private EventListDTO events;
    private SeriesListDTO series;


}
