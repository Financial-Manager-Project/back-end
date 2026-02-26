package financial.manager.demo.DTO.response.creditcard;

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
public class CreditCardResponseSummaryDTO {
    private UUID id;
    private String name;
    private double creditLimit;
    private LocalDate closingDay;
    private LocalDate dueDay;
}
