package financial.manager.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import financial.manager.demo.model.Transactions;

public interface TransactionRepository extends JpaRepository<Transactions, UUID>{   
}
