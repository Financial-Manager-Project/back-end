package financial.manager.demo.DTO.request.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import financial.manager.demo.model.enums.UsersRoleEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRequestDTO {
    @NotNull(message = "User role is required")
    private UsersRoleEnum userRole;

    @NotBlank(message = "User name is required")
    private String UserName;

    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;
}
