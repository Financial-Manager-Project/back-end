package financial.manager.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import financial.manager.demo.DTO.MonthlyGoalDTO;
import financial.manager.demo.model.MonthlyGoal;

@Mapper(componentModel = "spring")
public interface MonthlyGoalMapper {
    MonthlyGoalDTO toDTO(MonthlyGoalMapper monthlyGoal);

    @Mapping(target = "id", ignore = true)
    MonthlyGoal toEntity(MonthlyGoalDTO monthlyGoalDTO);
}
