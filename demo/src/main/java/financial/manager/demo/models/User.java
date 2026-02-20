package financial.manager.demo.models;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
public class User {
    @NonNull
    private String userName;
    private String email;
    private UUID password;

}
