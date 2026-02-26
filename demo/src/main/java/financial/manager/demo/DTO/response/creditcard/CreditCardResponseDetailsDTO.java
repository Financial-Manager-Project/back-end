package financial.manager.demo.DTO.response.creditcard;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import financial.manager.demo.model.Installment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreditCardResponseDetailsDTO {
    private UUID id;
    private String name;
    private double creditLimit;
    private LocalDate closingDay;
    private LocalDate dueDay;
    private List<Installment> installmentsList;
}
