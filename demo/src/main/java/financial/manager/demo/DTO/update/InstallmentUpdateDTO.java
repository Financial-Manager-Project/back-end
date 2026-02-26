package financial.manager.demo.DTO.update;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class InstallmentUpdateDTO {
    private double totalInstallmentValue;
    private int amountInstallment;
    private UUID category;
}
