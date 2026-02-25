package financial.manager.demo.DTO;

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
public class CategoryDTO {
    @NotBlank(message = "Category name is required")
    private String name;

    private UUID userId;
}
