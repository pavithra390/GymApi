package com.example.gymapi.repo;
import com.example.gymapi.entity.Workout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface GymRepoForWorkout extends CrudRepository<Workout, Long> {
    List<Workout> findByuserId(String userId);
}
