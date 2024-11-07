package com.apinba.restapi.controllers;

import com.apinba.restapi.models.TeamModel;
import com.apinba.restapi.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/teams")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping
    public ArrayList<TeamModel> getTeams() {
        return this.teamService.getTeams();
    }

    @PostMapping
    public TeamModel saveTeam(@RequestBody TeamModel team) {
        return this.teamService.saveTeam(team);
    }

    @GetMapping(path = "/{id}")
    public Optional<TeamModel> getTeamById(@PathVariable UUID id){
        return this.teamService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public TeamModel updateTeamById(@RequestBody TeamModel request, @PathVariable UUID id){
        return this.teamService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteTeamById(@PathVariable UUID id){
        boolean ok = this.teamService.deleteTeamById(id);

        if(ok){
            return "Team with id " + id + "DELETED!";
        } else {
            return "Team with id " + id + "HAVEN'T DELETED PA NO SE DELETIO!";
        }
    }
}
