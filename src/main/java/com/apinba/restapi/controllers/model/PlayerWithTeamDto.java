package com.apinba.restapi.controllers.model;

import com.apinba.restapi.models.PlayerModel;
import java.util.UUID;

public record PlayerWithTeamDto(
        UUID id,
        String first_name,
        String last_name,
        String position,
        String height,
        String weight,
        String jersey_number,
        String college,
        String country,
        int draft_year,
        int draft_round,
        int draft_number,
        TeamDto team
) {

    public static PlayerWithTeamDto from(PlayerModel player) {
        return new PlayerWithTeamDto(player.getId(), player.getFirst_name(), player.getLast_name(), player.getPosition(), player.getHeight(), player.getWeight(), player.getJersey_number(), player.getCollege(), player.getCountry(), player.getDraft_year(), player.getDraft_round(), player.getDraft_number(), TeamDto.from(player.getTeam()));
    }
}
