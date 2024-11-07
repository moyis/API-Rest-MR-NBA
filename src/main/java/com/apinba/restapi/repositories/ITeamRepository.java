package com.apinba.restapi.repositories;

import com.apinba.restapi.models.TeamModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ITeamRepository extends JpaRepository<TeamModel, UUID> {


}
