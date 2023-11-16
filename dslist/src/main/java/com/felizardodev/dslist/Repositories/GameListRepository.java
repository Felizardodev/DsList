package com.felizardodev.dslist.Repositories;

import com.felizardodev.dslist.Entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
