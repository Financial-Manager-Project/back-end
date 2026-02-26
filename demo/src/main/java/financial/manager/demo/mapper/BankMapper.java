package financial.manager.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import financial.manager.demo.DTO.response.bank.BankResponseDetailsDTO;
import financial.manager.demo.DTO.response.bank.BankResponseSummaryDTO;
import financial.manager.demo.model.Bank;

@Mapper(componentModel = "spring")
interface BankMapper {
    BankResponseDetailsDTO toDetailsDTO(Bank bank);
    BankResponseSummaryDTO toSummaryDTO(Bank bank);
    
    @Mapping(target = "id", ignore = true)
    Bank toEntitySummary(BankResponseSummaryDTO bankDTO);
}