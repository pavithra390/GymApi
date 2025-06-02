package com.example.gymapi.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table
public class Goal {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String goal;
    private String progress;
    /* We can use @NoArgsConstructor, @AllArgsConstructor, @Setter and @Getter
     For creating default, parameterised constructure, setters and getters by adding Lombok dependency...
     To avoid the boilerplate code...But we can follow the regular procedure(Manually Writing) too..
     Here im following the regular procedure for creating constructors, setters and getters..
     */
    public Goal(){}
    public Goal(Long id, String userId, String goal, String progress) {
        this.id = id;
        this.userId = userId;
        this.goal = goal;
        this.progress = progress;
    }
    public Long getId() {return id;}
    public String getUserId() {return userId;}
    public String getGoal() {return goal;}
    public String getProgress() {return progress;}


    public void setId(Long id) {this.id = id;}
    public void setUserId(String userId) {this.userId = userId;}
    public void setGoal(String goal) {this.goal = goal;}
    public void setProgress(String progress) {this.progress = progress;}

}
