package financial.manager.demo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import financial.manager.demo.model.enums.MonthlyEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "monthly_goal")
public class MonthlyGoal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "monthlygoal_id")
    private UUID id;

    @Column(name = "monthlygoal_value", nullable = false)
    private double value;

    @Enumerated(EnumType.STRING)
    @Column(name = "monthly", nullable = false)
    private MonthlyEnum monthly;

    @Column(name = "time_to_end", nullable = false)
    private LocalDate timeToEnd;
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
