package financial.manager.demo.DTO.request.monthlygoal;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MonthlyGoalRequestBasicDTO {
    @NotNull(message = "id is required")
    private UUID id;
}
