package financial.manager.demo.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import financial.manager.demo.model.Installment;

public interface InstallmentRepository extends JpaRepository<Installment, UUID>{    
}
