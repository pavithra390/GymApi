package com.example.gymapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Table
@Entity
public class Workout {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String userId;
    @Column
    private String exercise;
    @Column
    private int sets;
    @Column
    private int reps;
    @Column
    private int duration; // in minutes
    @Column
    private LocalDateTime timestamp;
    public Workout(Long id, String userId, String exercise, int sets, int reps, int duration, LocalDateTime timestamp) {
        this.id = id;
        this.userId = userId;
        this.exercise = exercise;
        this.sets = sets;
        this.reps = reps;
        this.duration = duration;
        this.timestamp = timestamp;
    }
    public Workout(){}
    public Long getId() {return id;}
    public String getUserId() {return userId;}
    public String getExercise() {return exercise;}
    public int getSets() {return sets;}
    public int getReps() {return reps;}
    public int getDuration() {return duration;}
    public LocalDateTime getTimestamp() {return timestamp;}




    public void setId(Long id) {this.id = id;}
    public void setUserId(String userId) {this.userId = userId;}
    public void setExercise(String exercise) {this.exercise = exercise;}
    public void setSets(int sets) {this.sets = sets;}
    public void setReps(int reps) {this.reps = reps;}
    public void setDuration(int duration) {this.duration = duration;}
    public void setTimestamp(LocalDateTime timestamp) {this.timestamp = timestamp;}
}