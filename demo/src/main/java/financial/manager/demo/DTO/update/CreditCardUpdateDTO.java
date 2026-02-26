package financial.manager.demo.DTO.update;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CreditCardUpdateDTO {
    private String name;
    private double creditLimit;
    private LocalDate closingDay;
    private LocalDate dueDay;
}
