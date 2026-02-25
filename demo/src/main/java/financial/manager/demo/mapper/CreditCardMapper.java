package financial.manager.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import financial.manager.demo.DTO.CreditCardDTO;
import financial.manager.demo.model.CreditCard;

@Mapper(componentModel = "spring")
public interface CreditCardMapper {
    CreditCardDTO toDTO(CreditCard creditCard);

    @Mapping(target = "id", ignore = true)
    CreditCard toEntity(CreditCardDTO creditCardDTO);
}
