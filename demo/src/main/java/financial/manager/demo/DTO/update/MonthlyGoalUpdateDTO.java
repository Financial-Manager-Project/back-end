package financial.manager.demo.DTO.update;

import java.time.LocalDate;

import financial.manager.demo.model.enums.MonthlyEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MonthlyGoalUpdateDTO {
    private double value;
    private MonthlyEnum monthly;
    private LocalDate timeToEnd;
}
