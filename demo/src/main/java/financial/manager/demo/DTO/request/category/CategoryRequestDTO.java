package financial.manager.demo.DTO.request.category;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor; 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoryRequestDTO {
    @NotBlank(message = "name is required")
    private String name;
    
    private UUID user;
}
