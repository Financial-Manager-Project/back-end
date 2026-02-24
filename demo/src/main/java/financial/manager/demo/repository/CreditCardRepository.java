package financial.manager.demo.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import financial.manager.demo.model.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, UUID>{
}