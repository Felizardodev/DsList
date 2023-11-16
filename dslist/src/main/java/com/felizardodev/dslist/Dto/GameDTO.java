package com.felizardodev.dslist.Dto;

import com.felizardodev.dslist.Entities.Game;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class GameDTO {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    public GameDTO(){
    }

    public GameDTO(Game entity){
        BeanUtils.copyProperties(entity, this);
    }
}