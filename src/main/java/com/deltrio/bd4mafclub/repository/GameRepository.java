package com.deltrio.bd4mafclub.repository;

import com.deltrio.bd4mafclub.model.game.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface GameRepository extends JpaRepository<Game, Integer> {
    Game findGameByGameDate(LocalDate gameDate);
    Optional<Game> findById(Integer id);
}

