package financial.manager.demo.DTO.request.bank;

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
public class BankRequestBasicDTO {
    @NotNull(message = "id is required")
    private UUID id;
}