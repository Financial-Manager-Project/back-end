package financial.manager.demo.DTO.request.monthlygoal;

import java.time.LocalDate;
import java.util.UUID;

import financial.manager.demo.model.enums.MonthlyEnum;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MonthlyGoalRequestDTO {
    @NotNull(message = "value is required")
    private double value;

    @NotNull(message = "monthly is required")
    private MonthlyEnum monthly;

    @NotNull(message = "timeToEnd is required")
    private LocalDate timeToEnd;

    @NotNull(message = "userId is required")
    private UUID user;

}
