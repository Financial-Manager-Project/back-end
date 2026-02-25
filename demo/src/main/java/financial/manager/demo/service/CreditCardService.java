package financial.manager.demo.service;

import java.util.List;
import java.util.UUID;

import financial.manager.demo.DTO.CreditCardDTO;

interface CreditCardService {
    List<CreditCardDTO> getAllCreditCard();
    CreditCardDTO getCreditCardById(UUID id);
    CreditCardDTO createCreditCard(CreditCardDTO data);
    CreditCardDTO updateCreditCardById(UUID id, CreditCardDTO data);
    void deleteCreditCardById(UUID id);    
}
