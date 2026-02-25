package financial.manager.demo.DTO;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreditCardDTO {
    @NotBlank(message = "Credit card name is required")
    private String name;
    
    @NotBlank(message = "Credit card number is required")
    private double credtLimit;
    
    @NotBlank(message = "Closing day is required")
    private LocalDate closingDay;
    
    @NotBlank(message = "Due day is required")
    private LocalDate dueDay;

    @NotBlank(message = "Bank ID is required")
    private UUID bankId;
}
