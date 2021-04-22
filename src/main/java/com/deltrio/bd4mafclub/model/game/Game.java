package com.deltrio.bd4mafclub.model.game;

import com.deltrio.bd4mafclub.model.club.Club;
import com.deltrio.bd4mafclub.model.user.User;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDate gameDate;
    private String club;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "game_mission",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "mission_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Map<Mission, User> missions;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "game_user",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<Mission> users;

    public Game() {

    }
}
