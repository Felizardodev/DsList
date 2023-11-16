package com.felizardodev.dslist.Services;

import com.felizardodev.dslist.Dto.GameDTO;
import com.felizardodev.dslist.Dto.GameMinDTO;
import com.felizardodev.dslist.Entities.Game;
import com.felizardodev.dslist.GameMinProjection;
import com.felizardodev.dslist.Repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findALL() {
            List<Game> result = gameRepository.findAll();
            List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
            return dto;
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}

