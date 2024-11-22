package com.apinba.restapi.services;

import com.apinba.restapi.models.GameModel;
import com.apinba.restapi.repositories.IGameRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final IGameRepository gameRepository;
    public GameService(IGameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Page<GameModel> getGames(Pageable pageable){
        return gameRepository.findAll(pageable);
    }

    public GameModel saveGame(GameModel gameModel){
        return gameRepository.save(gameModel);
    }

    public List<GameModel> saveGamesList(List<GameModel> games){
        return gameRepository.saveAll(games);
    }

}
