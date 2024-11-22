package com.apinba.restapi.controllers.model;

import com.apinba.restapi.models.GameModel;
import java.util.UUID;

public record GameDto(
        UUID id,
        String date,
        int season,
        String status,
        int period,
        String time,
        boolean postseason,
        int home_team_score,
        int visitor_team_score,
        TeamDto local_team,
        TeamDto visitor_team
)
{

    public static GameDto from(GameModel game){
        return new GameDto(game.getId(), game.getDate(), game.getSeason(), game.getStatus(), game.getPeriod(), game.getTime(), game.isPostseason(), game.getHome_team_score(), game.getVisitor_team_score(), TeamDto.from(game.getLocal_team()), TeamDto.from(game.getVisitor_team()));
    }
}
