package com.Rythmix.Project.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ListenHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "track_name", nullable = false)
    private String trackName;

    @Column(name = "listen_time", nullable = false)
    private LocalDateTime listenTime;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public LocalDateTime getListenTime() {
        return listenTime;
    }

    public void setListenTime(LocalDateTime listenTime) {
        this.listenTime = listenTime;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
