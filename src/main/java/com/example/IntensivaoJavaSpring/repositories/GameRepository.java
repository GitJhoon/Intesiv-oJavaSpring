package com.example.IntensivaoJavaSpring.repositories;

import com.example.IntensivaoJavaSpring.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
