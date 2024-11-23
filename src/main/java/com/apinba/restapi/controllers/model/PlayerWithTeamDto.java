package com.apinba.restapi.controllers.model;

import com.apinba.restapi.models.PlayerModel;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.UUID;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record PlayerWithTeamDto(
    UUID id,
    String firstName,
    String lastName,
    String position,
    String height,
    String weight,
    String jerseyNumber,
    String college,
    String country,
    int draftYear,
    int draftRound,
    int draftNumber,
    TeamDto team) {

  public static PlayerWithTeamDto from(PlayerModel player) {
    return new PlayerWithTeamDto(
        player.getId(),
        player.getFirst_name(),
        player.getLast_name(),
        player.getPosition(),
        player.getHeight(),
        player.getWeight(),
        player.getJersey_number(),
        player.getCollege(),
        player.getCountry(),
        player.getDraft_year(),
        player.getDraft_round(),
        player.getDraft_number(),
        TeamDto.from(player.getTeam()));
  }
}
