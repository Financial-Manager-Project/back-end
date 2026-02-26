package financial.manager.demo.DTO.request.creditcard;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor; 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreditCardRequestDTO {
    @NotBlank(message = "name is required")
    private String name;

    @NotNull(message = "creditLimit is required")
    private double creditLimit;

    @NotNull(message = "closingDay is required")
    private LocalDate closingDay;

    @NotNull(message = "dueDay is required")
    private LocalDate dueDay;

    @NotNull(message = "bank is required")
    private UUID bank;
}