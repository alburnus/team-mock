package com.github.alburnus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamMember implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;
}
