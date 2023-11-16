package com.felizardodev.dslist.Repositories;

import com.felizardodev.dslist.Entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
}
