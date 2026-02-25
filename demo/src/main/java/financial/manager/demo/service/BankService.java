package financial.manager.demo.service;

import java.util.List;
import java.util.UUID;

import financial.manager.demo.DTO.BankDTO;

interface BankService {
    List<BankDTO> getAllBank();
    BankDTO getBankById(UUID id);
    BankDTO createBank(BankDTO data);
    BankDTO updateBankById(UUID id, BankDTO data);
    void deleteBankById(UUID id);
}
