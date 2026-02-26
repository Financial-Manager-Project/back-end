package financial.manager.demo.DTO.response.user;

import java.util.List;

import financial.manager.demo.model.MonthlyGoal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponseMonthlyGoalDetails {
    private List<MonthlyGoal> monthlyGoalList;
}
