package com.apinba.restapi.repositories;

import com.apinba.restapi.models.GameModel;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGameRepository extends JpaRepository<GameModel, UUID> {
}
