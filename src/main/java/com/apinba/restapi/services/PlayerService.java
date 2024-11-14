package com.apinba.restapi.services;

import com.apinba.restapi.models.PlayerModel;
import com.apinba.restapi.repositories.IPlayerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final IPlayerRepository playerRepository;
    public PlayerService(IPlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Page<PlayerModel> getPlayers(Pageable pageable, String search){
        if (search == null){
            return playerRepository.findAll(pageable);
        } else {
            return playerRepository.searchByName(search, pageable);
        }
    }

    public PlayerModel savePlayer(PlayerModel player){
        return playerRepository.save(player);
    }

    public List<PlayerModel> savePlayersList(List<PlayerModel> players) {
        return playerRepository.saveAll(players);
    }

}
