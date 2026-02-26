package financial.manager.demo.DTO.response.transaction;

import java.util.UUID;
import java.util.Locale.Category;

import financial.manager.demo.model.enums.TransactionEnum;
import financial.manager.demo.model.enums.TransactionModeEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TransactionResponseDetailsDTO {
    private UUID id;
    private String title;
    private String description;
    private TransactionEnum type;
    private TransactionModeEnum transactionMode;
    private double value;
    private Category category;
}
