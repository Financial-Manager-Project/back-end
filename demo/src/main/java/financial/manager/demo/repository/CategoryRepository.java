package financial.manager.demo.repository;

import java.util.UUID;
import java.util.Locale.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, UUID>{    
}
