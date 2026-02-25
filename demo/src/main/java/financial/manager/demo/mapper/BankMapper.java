package financial.manager.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import financial.manager.demo.DTO.BankDTO;
import financial.manager.demo.model.Bank;

@Mapper(componentModel = "spring")
public interface BankMapper {
    BankDTO toDTO(Bank bank);
    
    @Mapping(target = "id", ignore = true)
    Bank toEntity(BankDTO bankDTO);
}
