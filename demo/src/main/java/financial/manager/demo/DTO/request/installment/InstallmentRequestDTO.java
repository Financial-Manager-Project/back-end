package financial.manager.demo.DTO.request.installment;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InstallmentRequestDTO {
    @NotNull(message = "totalInstallmentValue is required")
    private double totalInstallmentValue;

    @NotNull(message = "amountInstallment is required")
    private int amountInstallment;

    @NotNull(message = "creditCard is required")
    private UUID creditCard;

    @NotNull(message = "category is required")
    private UUID category;

}
