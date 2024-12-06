package com.apinba.restapi.controllers.model;

import com.apinba.restapi.models.TeamModel;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.UUID;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record TeamDto(
    UUID id,
    String abbreviation,
    String city,
    String conference,
    String division,
    String fullName,
    String name) {

  public static TeamDto from(TeamModel team) {
    return new TeamDto(
        team.getId(),
        team.getAbbreviation(),
        team.getCity(),
        team.getConference(),
        team.getDivision(),
        team.getFull_name(),
        team.getName());
  }
}
