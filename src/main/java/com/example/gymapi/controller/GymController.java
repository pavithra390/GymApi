package com.example.gymapi.controller;
import com.example.gymapi.entity.Goal;
import com.example.gymapi.entity.Workout;
import com.example.gymapi.exception.UserNotFound;
import com.example.gymapi.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gym")
public class GymController {
    @Autowired
    GymService gs;

    @PostMapping("/adding/workout")
    //http://localhost:3002/gym/adding/workout
    public String addWorkout(@RequestBody Workout workout) {
        gs.postWorkout(workout);
        return "You posted your todays workout successfully!";
    }
    @GetMapping("/getting/workout/{workout_id}")
    //http://localhost:3002/gym/getting/workout/7
    public ResponseEntity<List<Workout>> getWorkout(@PathVariable("workout_id") String id) {
        List<Workout>workout=gs.getWorkout(id);
        if (workout.isEmpty()) {
            throw new UserNotFound();
        }
        return ResponseEntity.ok(workout);
    }
    @GetMapping("/getting/allUsers/WorkOuts")
    //http://localhost:3002/gym/getting/allUsers/WorkOuts
    public Iterable<Workout> getAllWorkouts() {
        return gs.getAllWorkouts();
    }
    @PostMapping("/adding/goal")
    //http://localhost:3002/gym/adding/goal
    public String addGoal(@RequestBody Goal goal) {
        gs.postGoal(goal);
        return "You posted your goal successfully!";
    }
    @GetMapping("/getting/goal/{goal_id}")
    //http://localhost:3002/gym/getting/goal/7
    public  ResponseEntity<List<Goal>> getGoal(@PathVariable("goal_id") String id) {
        List<Goal>goal= gs.getGoal(id);
        if(goal.isEmpty()){
            throw new UserNotFound();
        }
        return ResponseEntity.ok(goal);
    }
    @GetMapping("/getting/allUsers/goals")
    //http://localhost:3002/gym/getting/allUsers/goals
    public Iterable<Goal> getAllGoals() {
        return gs.getAllGoals();
    }

}
