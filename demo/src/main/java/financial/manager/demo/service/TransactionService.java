package financial.manager.demo.service;

import java.util.List;
import java.util.UUID;

import financial.manager.demo.DTO.TransactionDTO;

interface TransactionService {
    List<TransactionDTO> getAllTransactions();
    TransactionDTO getTransactionById(UUID id);
}
