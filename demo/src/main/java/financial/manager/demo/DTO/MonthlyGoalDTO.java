package financial.manager.demo.DTO;

import java.time.LocalDate;
import java.util.UUID;

import financial.manager.demo.model.enums.MonthlyEnum;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MonthlyGoalDTO {

    @NotBlank(message = "Value is required")
    private double value;

    @NotBlank(message = "Monthly enum is required")
    private MonthlyEnum monthly;

    @NotBlank(message = "Time to end is required")
    private LocalDate timeToEnd;

    @NotBlank(message = "User ID is required")
    private UUID userId;
}
