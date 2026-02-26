package financial.manager.demo.DTO.request.category;

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
public class CategoryRequestBasicDTO {
    @NotNull(message = "id is required")
    private UUID id;
}
