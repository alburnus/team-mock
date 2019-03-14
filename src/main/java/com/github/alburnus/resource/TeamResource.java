package com.github.alburnus.resource;

import com.github.alburnus.domain.Team;
import com.github.alburnus.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
public class TeamResource {

    @Autowired
    private TeamRepository repository;

    @GetMapping(path = "/api/team")
    ResponseEntity<List<Team>> getTeams() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping(path = "/api/team/{id}")
    ResponseEntity<Team> getTeam(@PathVariable("id") Long id) {
        return ResponseEntity.ok(repository.getOne(id));
    }

    @PostMapping(path = "/api/team")
    ResponseEntity add(@RequestBody Team team) {
        System.out.println(team.toString());
        repository.save(team);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(path = "/api/team/{id}")
    ResponseEntity delete(@PathVariable("id") Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
