package financial.manager.demo.DTO.response.installment;

import java.util.UUID;
import java.util.Locale.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InstallmentResponseDetailsDTO {
    private UUID id;
    private double totalInstallmentValue;
    private int amountInstallment;
    private Category category;

}
