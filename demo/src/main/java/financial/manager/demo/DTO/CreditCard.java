package financial.manager.demo.DTO;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreditCard {
    private String name;
    private double credtLimit;
    private LocalDate closingDay;
    private LocalDate dueDay;
    private UUID bankId;
}
