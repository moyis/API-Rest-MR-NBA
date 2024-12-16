package com.apinba.restapi.services;

import com.apinba.restapi.models.GameModel;
import com.apinba.restapi.repositories.IGameRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GameService {

    private final IGameRepository gameRepository;

    public GameService(IGameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Page<GameModel> getGames(Pageable pageable, UUID id, String search) {
        if(id == null && search == null){
            return gameRepository.findAll(pageable);
        }else if (id != null && search == null){
            return gameRepository.findByTeamId(id, pageable);
        } else {
            return gameRepository.searchByName(search, pageable);
        }
    }

    public GameModel saveGame(GameModel gameModel) {
        return gameRepository.save(gameModel);
    }

    public List<GameModel> saveGamesList(List<GameModel> games) {
        return gameRepository.saveAll(games);
    }

}
