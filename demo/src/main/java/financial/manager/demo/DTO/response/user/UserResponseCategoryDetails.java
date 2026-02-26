package financial.manager.demo.DTO.response.user;

import java.util.List;
import java.util.Locale.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponseCategoryDetails {
    private List<Category> categoryList;
}
