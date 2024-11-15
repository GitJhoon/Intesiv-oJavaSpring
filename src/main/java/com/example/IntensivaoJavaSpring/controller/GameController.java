package com.example.IntensivaoJavaSpring.controller;

import com.example.IntensivaoJavaSpring.entities.Game;
import com.example.IntensivaoJavaSpring.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping
    public List<Game> findAll(){
        List<Game> result = gameRepository.findAll();

        return result;
    }
}
