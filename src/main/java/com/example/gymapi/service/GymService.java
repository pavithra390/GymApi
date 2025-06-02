package com.example.gymapi.service;
import com.example.gymapi.entity.Goal;
import com.example.gymapi.entity.Workout;
import com.example.gymapi.repo.GymRepoForGoal;
import com.example.gymapi.repo.GymRepoForWorkout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GymService {
    @Autowired
    GymRepoForWorkout grw;
    @Autowired
    GymRepoForGoal grg;
    public void postWorkout(Workout workout){
        grw.save(workout);
    }
    public void postGoal(Goal goal){
        grg.save(goal);}
    public List<Workout> getWorkout(String id){
       return grw.findByuserId(id);
    }
    public List<Goal> getGoal(String id){
        return grg.findByuserId(id);
    }
    public Iterable<Workout> getAllWorkouts(){
        return grw.findAll();
    }
    public Iterable<Goal> getAllGoals(){
        return grg.findAll();
    }
}
