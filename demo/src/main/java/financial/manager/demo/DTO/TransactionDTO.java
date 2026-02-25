package financial.manager.demo.DTO;

import java.util.UUID;

import financial.manager.demo.model.enums.TransactionEnum;
import financial.manager.demo.model.enums.TransactionModeEnum;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TransactionDTO {
    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Description is required")
    private String description;

    @NotBlank(message = "Transaction type is required")
    private TransactionEnum type;

    @NotBlank(message = "Transaction value is required")
    private double value;

    @NotBlank(message = "Transaction mode is required")
    private TransactionModeEnum transactionMode;

    @NotBlank(message = "Bank ID is required")
    private UUID bankId;

    @NotBlank(message = "Category ID is required")
    private UUID categoryId;
}
