package com.felizardodev.dslist.Dto;

import com.felizardodev.dslist.Entities.Game;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
public class GameMinDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){
    }
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
}