package com.felizardodev.dslist.Repositories;

import com.felizardodev.dslist.Entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> { //o Long é referente ao ID
}
