package financial.manager.demo.DTO.request.transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

import financial.manager.demo.model.enums.TransactionEnum;
import financial.manager.demo.model.enums.TransactionModeEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TransactionRequestDTO {
    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Description is required")
    private String description;

    @NotNull(message = "Transaction type is required")
    private TransactionEnum type;

    @NotNull(message = "Transaction mode is required")
    private TransactionModeEnum transactionMode;

    @NotNull(message = "Transaction value is required")
    private double value;

    @NotNull(message = "Bank ID is required")
    private UUID bank;
    
    @NotNull(message = "Category ID is required")
    private UUID category;
}
