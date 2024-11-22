package com.apinba.restapi.controllers.model;

import com.apinba.restapi.models.TeamModel;
import java.util.UUID;

public record TeamDto(

        UUID id,
        String abbreviation,

        String city,

        String conference,

        String division,

        String full_name,

        String name

        ) {

    public static TeamDto from(TeamModel team){
        return new TeamDto(team.getId(), team.getAbbreviation(), team.getCity(), team.getConference(), team.getDivision(), team.getFull_name(), team.getName());
    }
}
