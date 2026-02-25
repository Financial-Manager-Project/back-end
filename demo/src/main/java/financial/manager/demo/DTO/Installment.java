package financial.manager.demo.DTO;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Installment {
    @NotBlank(message = "Total installment value is required")
    private double totalInstallmentValue;

    @NotBlank(message = "Amount of installments is required")
    private int amountInstallment;

    @NotBlank(message = "Category ID is required")
    private UUID categoryId;

    @NotBlank(message = "Credit card ID is required")
    private UUID creditCardId;
}
