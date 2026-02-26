package financial.manager.demo.DTO.response.monthlygoal;

import java.util.UUID;

import financial.manager.demo.model.enums.MonthlyEnum;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MonthlyGoalResponseDetailsDTO {
    private UUID id;
    private double value;
    private MonthlyEnum monthly;
    private LocalDate timeToEnd;
}
