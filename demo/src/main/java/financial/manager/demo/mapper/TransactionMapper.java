package financial.manager.demo.mapper;

import org.mapstruct.Mapping;

import financial.manager.demo.DTO.TransactionDTO;
import jakarta.transaction.Transaction;

public interface TransactionMapper {
    TransactionDTO toDTO(Transaction transaction);

    @Mapping(target = "id", ignore = true)
    Transaction toEntity(TransactionDTO TransactionDTO);
}
