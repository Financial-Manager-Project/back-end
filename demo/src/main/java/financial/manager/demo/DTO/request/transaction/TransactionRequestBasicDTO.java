package financial.manager.demo.DTO.request.transaction;

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
public class TransactionRequestBasicDTO {
    @NotNull(message = "id is required")
    private UUID id;
}
