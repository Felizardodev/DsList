package com.felizardodev.dslist.Dto;

import com.felizardodev.dslist.Entities.GameList;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(){
    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getNome();
    }
}
