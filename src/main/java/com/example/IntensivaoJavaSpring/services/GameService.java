package com.example.IntensivaoJavaSpring.services;

import com.example.IntensivaoJavaSpring.entities.Game;
import com.example.IntensivaoJavaSpring.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<Game> findAll(){
        List<Game> result = repository.findAll();
        return  result;
    }
}
