package financial.manager.demo.DTO.update;

import java.util.UUID;

import financial.manager.demo.model.enums.TransactionEnum;
import financial.manager.demo.model.enums.TransactionModeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TransactionUpdateDTO {
    private String title;
    private String description;
    private TransactionEnum type;
    private TransactionModeEnum transactionMode;
    private double value;
    private UUID category;
}
