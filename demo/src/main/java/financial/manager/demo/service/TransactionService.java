package financial.manager.demo.service;

import java.util.List;
import java.util.UUID;

import financial.manager.demo.DTO.TransactionDTO;

interface TransactionService {
    List<TransactionDTO> getAllTransactions();
    TransactionDTO getTransactionById(UUID id);
    TransactionDTO createTransaction(TransactionDTO data);
    TransactionDTO updateTransactionById(UUID id, TransactionDTO data);
    void deleteTransactionById(UUID id);
}
