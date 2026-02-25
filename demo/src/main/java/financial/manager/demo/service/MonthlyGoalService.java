package financial.manager.demo.service;

import java.util.List;
import java.util.UUID;

import financial.manager.demo.DTO.MonthlyGoalDTO;

interface MonthlyGoalService {
    List<MonthlyGoalDTO> getAllMontlhyGoal();
    MonthlyGoalDTO getMonthlyGoalById(UUID id);
    MonthlyGoalDTO createMontlhyGoal(MonthlyGoalDTO data);
    MonthlyGoalDTO updateMonthlyGoalById(UUID id, MonthlyGoalDTO data);
    void deleteMonthlyGoalById(UUID id);    
}
