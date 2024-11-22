package com.apinba.restapi.repositories;

import com.apinba.restapi.models.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IGameRepository extends JpaRepository<GameModel, UUID> {
}
