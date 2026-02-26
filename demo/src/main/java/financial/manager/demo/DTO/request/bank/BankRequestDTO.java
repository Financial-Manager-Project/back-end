package financial.manager.demo.DTO.request.bank;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor; 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BankRequestDTO {
    @NotBlank(message = "name is required")
    private String name;
    
    @NotNull(message = "userId is required")
    private UUID user;
}
