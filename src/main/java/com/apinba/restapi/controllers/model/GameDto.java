package com.apinba.restapi.controllers.model;

import com.apinba.restapi.models.GameModel;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.UUID;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record GameDto(
    UUID id,
    String date,
    int season,
    String status,
    int period,
    String time,
    boolean postseason,
    int homeTeamScore,
    int visitorTeamScore,
    TeamDto localTeam,
    TeamDto visitorTeam) {

  public static GameDto from(GameModel game) {
    return new GameDto(
        game.getId(),
        game.getDate(),
        game.getSeason(),
        game.getStatus(),
        game.getPeriod(),
        game.getTime(),
        game.isPostseason(),
        game.getHome_team_score(),
        game.getVisitor_team_score(),
        TeamDto.from(game.getLocal_team()),
        TeamDto.from(game.getVisitor_team()));
  }
}
