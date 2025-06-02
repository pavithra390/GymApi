package com.example.gymapi.repo;
import com.example.gymapi.entity.Goal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface GymRepoForGoal extends CrudRepository<Goal, Long> {
    List<Goal> findByuserId(String id);
}
